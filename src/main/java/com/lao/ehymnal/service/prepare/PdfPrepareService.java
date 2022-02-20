package com.lao.ehymnal.service.prepare;

import com.lao.ehymnal.model.Hymn;

public interface PdfPrepareService {

    void splitPdfFilesByPage(String pdfFileAsString, int page);

    void splitPdfFileIndividually(String pdfFileAsString);

    void updatePdfFile(String id);

    void addPdfFile(Hymn hymn);
}
