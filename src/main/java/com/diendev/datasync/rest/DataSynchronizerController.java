package com.diendev.datasync.rest;

import com.diendev.datasync.service.DataSynchronizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pham Thi Cam Duyen on 17/08/2020
 */
@RestController
@RequestMapping("/api")
public class DataSynchronizerController {

    @Autowired
    private DataSynchronizerService dataSynchronizerService;

    @GetMapping("/sync-data")
    public ResponseEntity<Void> syncData() {
        dataSynchronizerService.syncData();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
