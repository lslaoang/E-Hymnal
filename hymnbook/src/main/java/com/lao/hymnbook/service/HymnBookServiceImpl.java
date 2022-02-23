package com.lao.hymnbook.service;

import com.lao.hymnbook.model.HymnBook;
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

        return (List<HymnBook>) hymnBookRepository.findAll();
    }
}
