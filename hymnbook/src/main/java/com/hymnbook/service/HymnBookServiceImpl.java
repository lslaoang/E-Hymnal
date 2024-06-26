package com.hymnbook.service;

import com.hymnbook.model.HymnBook;
import com.hymnbook.repository.HymnBookRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<HymnBook> sortById() {
        List<HymnBook> sortedByIdList =(List<HymnBook>) hymnBookRepository.findAll();
        sortedByIdList.sort(Comparator.comparing(HymnBook::getId));
        return sortedByIdList;
    }

    @Override
    public List<HymnBook> sortByTitle() {
        List<HymnBook> sortedByTitleList =(List<HymnBook>) hymnBookRepository.findAll();
        sortedByTitleList.sort(Comparator.comparing(HymnBook::getTitle));
        return sortedByTitleList;
    }

    @Override
    public List<HymnBook> sortByPrintDate() {
        List<HymnBook> sortedByDateList =(List<HymnBook>) hymnBookRepository.findAll();
        sortedByDateList.sort(Comparator.comparing(HymnBook::getPrintDate));
        return sortedByDateList;
    }

    @Override
    public Optional<HymnBook> getHymnBookById(String id) {
        return hymnBookRepository.findById(id);
    }
}
