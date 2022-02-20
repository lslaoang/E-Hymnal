package com.lao.ehymnal.service.prepare;

import com.lao.ehymnal.model.Hymn;
import com.lao.ehymnal.repository.HymnRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PdfPrepareServiceImpl implements PdfPrepareService {

    private final HymnRepository hymnRepository;
    private static Logger LOGGER = LoggerFactory.getLogger(PdfPrepareServiceImpl.class);

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
    public void updatePdfFile(String id) {
        Hymn hymn = hymnRepository.findById(id);
        // TODO : Update impl
        hymnRepository.save(hymn);

    }

    @Override
    public void addPdfFile(Hymn hymn) {
        String hymnId = hymn.getId();

        if(hymnRepository.findById(hymnId) == null){
            hymnRepository.save(hymn);
            LOGGER.info("Hymn with {} successfully added in the repository", hymnId);
        } else {
            LOGGER.warn("Hymn with {} already in the repository", hymnId);
        }

    }
}
