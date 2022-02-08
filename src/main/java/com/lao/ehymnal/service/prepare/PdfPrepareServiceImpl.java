package com.lao.ehymnal.service.prepare;

import com.lao.ehymnal.model.Hymn;
import com.lao.ehymnal.repository.HymnRepository;
import org.springframework.stereotype.Service;

@Service
public class PdfPrepareServiceImpl implements PdfPrepareService {

    private final HymnRepository hymnRepository;

    public PdfPrepareServiceImpl(HymnRepository hymnRepository) {
        this.hymnRepository = hymnRepository;
    }

    @Override
    public void splitPdfFilesByPage(String pdfFileAsString, int page) {

    }

    @Override
    public void splitPdfFileIndividually(String pdfFileAsString) {

    }

    @Override
    public void collatePdfFiles() {

    }

    @Override
    public void updatePdfFile(String id) {
        Hymn hymn = hymnRepository.findById(id).get();
        // TODO : Update impl
        hymnRepository.save(hymn);

    }

    @Override
    public void addPdfFile(Hymn hymn) {
        hymnRepository.save(hymn);
    }
}
