package com.lao.hymnbook.service;

import com.lao.hymnbook.model.HymnBook;

import java.util.List;

public interface HymnBookService {

    List<HymnBook> displayAllHymns();

    List<HymnBook> sortById();

    List<HymnBook> sortByTitle();

    List<HymnBook> sortByPrintDate();
}
