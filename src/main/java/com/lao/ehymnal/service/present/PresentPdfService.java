package com.lao.ehymnal.service.present;

import com.lao.ehymnal.model.Hymn;

import java.util.List;

public interface PresentPdfService {

    void displayPdfFiles();

    List<Hymn> sortHymnById();

    List<Hymn> sortHymnByLanguage();

    List<Hymn> sortHymnByPrintDate();

    List<Hymn> sortHymnByTitle();

}
