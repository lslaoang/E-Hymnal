package com.ehymnal.bootstrap;

import com.ehymnal.model.Hymn;
import com.ehymnal.repository.HymnRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class InitialData implements CommandLineRunner {

    private final HymnRepository hymnRepository;

    public InitialData(final HymnRepository hymnRepository) {
        this.hymnRepository = hymnRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hymn hymn1 = Hymn.builder()
                .id("id100")
                .language("EN")
                .number("100")
                .printDate(new Date("10/1/2013"))
                .title("Sample Title")
                .build();

        Hymn hymn2 = Hymn.builder()
                .id("id101")
                .language("EN")
                .number("101")
                .printDate(new Date("10/11/2013"))
                .title("Sample Title 1")
                .build();

        hymnRepository.save(hymn1);
        hymnRepository.save(hymn2);
    }
}
