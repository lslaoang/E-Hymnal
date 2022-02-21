package com.lao.hymnbook.service;

import com.lao.hymnbook.model.HymnBook;
import com.lao.hymnbook.model.Language;
import com.lao.hymnbook.repository.HymnBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HymnBookServiceImpl implements HymnBookService {

    private final HymnBookRepository hymnBookRepository;

    public HymnBookServiceImpl(HymnBookRepository hymnBookRepository) {
        this.hymnBookRepository = hymnBookRepository;
    }

    @Override
    public List<HymnBook> displayAllHymns() {

        hymnBookRepository.save(HymnBook.builder()
                .id("1")
                .language(Language.EN)
                .printDate("2022-10-10")
                .title("test")
                .build());

        hymnBookRepository.save(HymnBook.builder()
                .id("2")
                .language(Language.EN)
                .printDate("2022-10-11")
                .title("test1")
                .build());

        return (List<HymnBook>) hymnBookRepository.findAll();
    }
}
