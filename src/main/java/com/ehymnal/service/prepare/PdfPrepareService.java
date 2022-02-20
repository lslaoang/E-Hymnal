package com.ehymnal.service.prepare;

import com.ehymnal.model.Hymn;

public interface PdfPrepareService {

    void splitPdfFilesByPage(String pdfFileAsString, int page);

    void splitPdfFileIndividually(String pdfFileAsString);

    void updatePdfFile(String id);

    void addPdfFile(Hymn hymn);
}
