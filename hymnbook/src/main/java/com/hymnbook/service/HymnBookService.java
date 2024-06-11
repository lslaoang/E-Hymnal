package com.hymnbook.service;

import com.hymnbook.model.HymnBook;

import java.util.List;
import java.util.Optional;

public interface HymnBookService {

    List<HymnBook> displayAllHymns();

    List<HymnBook> sortById();

    List<HymnBook> sortByTitle();

    List<HymnBook> sortByPrintDate();

    Optional<HymnBook> getHymnBookById(String id);
}
