package com.lao.hymnbook.controller;

import com.lao.hymnbook.model.HymnBook;
import com.lao.hymnbook.service.HymnBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HymnBookController {

    private final HymnBookService hymnBookService;

    public HymnBookController(final HymnBookService hymnBookService) {
        this.hymnBookService = hymnBookService;
    }

    @GetMapping("/hymnBooks")
    public List<HymnBook> getAllBooks() {


        return hymnBookService.displayAllHymns();
    }
}
