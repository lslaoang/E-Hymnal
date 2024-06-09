package com.hymnbook.bootstrap;

import com.hymnbook.config.DriveQuickStart;
import com.hymnbook.model.HymnBook;
import com.hymnbook.model.Language;
import com.hymnbook.repository.HymnBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Date;

@Component
public class InitData implements CommandLineRunner {

    private final HymnBookRepository hymnBookRepository;
    private final DriveQuickStart driveQuickStart;

    public InitData(HymnBookRepository hymnBookRepository, DriveQuickStart driveQuickStart) {
        this.hymnBookRepository = hymnBookRepository;
        this.driveQuickStart = driveQuickStart;
    }

    @Override
    public void run(String... args) throws GeneralSecurityException, IOException {

        HymnBook hb1 = HymnBook.builder()
                .id("1")
                .title("Hymn No. 1")
                .language(Language.EN)
                .printDate(new Date("11-Nov-2022"))
                .build();

        HymnBook hb2 = HymnBook.builder()
                .id("2")
                .title("Hymn No. 2")
                .language(Language.EN)
                .printDate(new Date("11-Dec-2020"))
                .build();

        HymnBook hb3 = HymnBook.builder()
                .id("3")
                .title("Hymn No. 3")
                .language(Language.EN)
                .printDate(new Date("12-Nov-2020"))
                .build();

        HymnBook hb4 = HymnBook.builder()
                .id("4")
                .title("Hymn No. 4")
                .language(Language.FIL)
                .printDate(new Date("11-Dec-2021"))
                .build();

        HymnBook hb5 = HymnBook.builder()
                .id("99")
                .title("99 Hymn")
                .language(Language.FIL)
                .printDate(new Date("11-Dec-2017"))
                .build();

        hymnBookRepository.saveAll(Arrays.asList(hb1, hb2, hb3, hb4, hb5));

//        driveQuickStart.initGoogleAPI();
    }
}
