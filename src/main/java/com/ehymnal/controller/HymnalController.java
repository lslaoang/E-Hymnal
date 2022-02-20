package com.ehymnal.controller;

import com.ehymnal.api.AddFileApi;
import com.ehymnal.api.DeleteApi;
import com.ehymnal.api.HymnsApi;
import com.ehymnal.api.UpdateFileApi;
import com.ehymnal.api.model.Accepted;
import com.ehymnal.api.model.Hymn;
import com.ehymnal.service.present.PresentPdfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HymnalController implements HymnsApi, AddFileApi, DeleteApi, UpdateFileApi {

    private static Logger LOGGER = LoggerFactory.getLogger(HymnalController.class);
    private final PresentPdfService presentPdfService;

    public HymnalController(final PresentPdfService presentPdfService) {
        this.presentPdfService = presentPdfService;
    }

    @Override
    public ResponseEntity<Accepted> addHymn(Hymn body) {
        return null;
    }

    @Override
    public ResponseEntity<Accepted> deleteHymn(String fileId) {
        return null;
    }

    @Override
    public ResponseEntity<Accepted> getAllHymn() {
        presentPdfService.displayPdfFiles();
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Accepted> updateHymn(Hymn body) {
        return null;
    }
}

