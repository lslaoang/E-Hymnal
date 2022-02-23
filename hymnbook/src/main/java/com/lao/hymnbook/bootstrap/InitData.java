package com.lao.hymnbook.bootstrap;

import com.lao.hymnbook.model.HymnBook;
import com.lao.hymnbook.model.Language;
import com.lao.hymnbook.repository.HymnBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InitData implements CommandLineRunner {

    private final HymnBookRepository hymnBookRepository;

    public InitData(HymnBookRepository hymnBookRepository) {
        this.hymnBookRepository = hymnBookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        HymnBook hb1 = HymnBook.builder()
                .id("1")
                .title("Hymn No. 1")
                .language(Language.EN)
                .printDate("11/11/2020")
                .build();

        HymnBook hb2 = HymnBook.builder()
                .id("2")
                .title("Hymn No. 2")
                .language(Language.EN)
                .printDate("11/12/2020")
                .build();

        HymnBook hb3 = HymnBook.builder()
                .id("3")
                .title("Hymn No. 3")
                .language(Language.EN)
                .printDate("12/11/2020")
                .build();

        HymnBook hb4 = HymnBook.builder()
                .id("4")
                .title("Hymn No. 4")
                .language(Language.FIL)
                .printDate("11/12/2021")
                .build();

        hymnBookRepository.saveAll(Arrays.asList(hb1, hb2, hb3, hb4));

    }
}
