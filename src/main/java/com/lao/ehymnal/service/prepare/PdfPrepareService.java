package com.lao.ehymnal.service.prepare;

import com.lao.ehymnal.model.Hymn;

public interface PdfPrepareService {

    void splitPdfFilesByPage(String pdfFileAsString, int page);

    void splitPdfFileIndividually(String pdfFileAsString);

    void collatePdfFiles();

    void updatePdfFile();

    void addPdfFile(Hymn hymn);
}