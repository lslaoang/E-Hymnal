package com.ehymnal.service.present;

import com.ehymnal.model.Hymn;
import com.ehymnal.repository.HymnRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unchecked")
@Service
public class PresentPdfServiceImpl implements PresentPdfService {

    private final HymnRepository hymnRepository;

    public PresentPdfServiceImpl(final HymnRepository hymnRepository) {
        this.hymnRepository = hymnRepository;
    }

    @Override
    public List<Hymn> displayPdfFiles() {
        return (List<Hymn>) hymnRepository.findAll();
    }

    @Override
    public List<Hymn> sortHymnById() {
        List<Hymn> hymnList = (List<Hymn>) hymnRepository.findAll();
        hymnList.sort(Comparator.comparing(Hymn::getId));
        return hymnList;
    }

    @Override
    public List<Hymn> sortHymnByLanguage() {
        List<Hymn> hymnList = (List<Hymn>) hymnRepository.findAll();
        hymnList.sort(Comparator.comparing(Hymn::getLanguage));
        return hymnList;
    }

    @Override
    public List<Hymn> sortHymnByPrintDate() {
        List<Hymn> hymnList = (List<Hymn>) hymnRepository.findAll();
        hymnList.sort(Comparator.comparing(Hymn::getPrintDate));
        return hymnList;
    }

    @Override
    public List<Hymn> sortHymnByTitle() {
        List<Hymn> hymnList = (List<Hymn>) hymnRepository.findAll();
        hymnList.sort(Comparator.comparing(Hymn::getTitle));
        return hymnList;
    }

}
