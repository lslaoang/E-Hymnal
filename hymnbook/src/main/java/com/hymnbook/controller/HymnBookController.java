package com.hymnbook.controller;

import com.hymnbook.model.HymnBook;
import com.hymnbook.service.HymnBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class HymnBookController {

    private final HymnBookService hymnBookService;

    public HymnBookController(final HymnBookService hymnBookService) {
        this.hymnBookService = hymnBookService;
    }

    @GetMapping("/hymnbooks")
    public List<HymnBook> getAllBooks() {
        return hymnBookService.displayAllHymns();
    }

    @GetMapping("/hymnbooks/{id}")
    public Optional<HymnBook> getHymnBookById(@PathVariable String id) {
        return hymnBookService.getHymnBookById(id);
    }

    @GetMapping("/hymnbooks-id")
    public List<HymnBook> getAllBooksSortedById() {
        return hymnBookService.sortById();
    }

    @GetMapping("/hymnbooks-title")
    public List<HymnBook> getAllBooksSortedByTitle() {
        return hymnBookService.sortByTitle();
    }

    @GetMapping("/hymnbooks-date")
    public List<HymnBook> getAllBooksSortedByDate() {
        return hymnBookService.sortByPrintDate();
    }

}
