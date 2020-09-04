package com.diendev.datasync.component;

import com.diendev.datasync.service.DataSynchronizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Created by Pham Thi Cam Duyen on 17/08/2020
 */
@ConditionalOnProperty(name = "syncDataEnabled", havingValue = "true")
@Component
public class DataSynchronizerWrapper {

    @Autowired
    DataSynchronizerService dataSynchronizerService;

    public void syncData() {
        dataSynchronizerService.syncData();
    }
}
