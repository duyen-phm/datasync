package com.diendev.datasync.service.impl;

import com.diendev.datasync.service.DataSynchronizerService;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Pham Thi Cam Duyen on 17/08/2020
 */
@Service
public class DataSynchronizerServiceImpl implements DataSynchronizerService {

    /**
     * @Async put here to make sure application still starts properly
     */
    @Async
    @Override
    @Retryable(
            value = { RuntimeException.class }, maxAttempts = 3, backoff = @Backoff(delay = 30000))
    public void syncData() {
        // data sync logic here
        System.out.println("Call data sync here !!!!!!!!");
    }
}
