package com.lao.ehymnal.controller;

import com.ehymnal.api.AddFileApi;
import com.ehymnal.api.DeleteApi;
import com.ehymnal.api.UpdateFileApi;
import com.ehymnal.api.model.Hymn;
import com.ehymnal.api.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HymnalController implements AddFileApi, DeleteApi, UpdateFileApi {

    @Override
    public ResponseEntity<Response> addHymn(Hymn body) {
        return null;
    }

    @Override
    public ResponseEntity<Response> deleteHymn(String fileId) {
        return null;
    }

    @Override
    public ResponseEntity<Response> updateHymn(Hymn body) {
        return null;
    }
}
