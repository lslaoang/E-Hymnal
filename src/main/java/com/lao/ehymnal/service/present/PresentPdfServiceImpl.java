package com.lao.ehymnal.service.present;

import com.lao.ehymnal.repository.HymnRepository;
import org.springframework.stereotype.Service;

@Service
public class PresentPdfServiceImpl implements PresentPdfService {

    private final HymnRepository hymnRepository;

    public PresentPdfServiceImpl(final HymnRepository hymnRepository) {
        this.hymnRepository = hymnRepository;
    }

    @Override
    public void displayPdfFiles() {

        hymnRepository.findAll();
    }
}
