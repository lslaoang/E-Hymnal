package com.lao.ehymnal.service.prepare;

public interface PreparePdfService {

    void splitPdfFilesByPage(String pdfFileAsString, int page);

    void splitPdfFileIndividually(String pdfFileAsString);

    void collatePdfFiles();

    void updatePdfFile();
}
