package com.ehymnal.service.present;

import com.ehymnal.model.Hymn;

import java.util.List;

public interface PresentPdfService {

    List<Hymn> displayPdfFiles();

    List<Hymn> sortHymnById();

    List<Hymn> sortHymnByLanguage();

    List<Hymn> sortHymnByPrintDate();

    List<Hymn> sortHymnByTitle();

}
