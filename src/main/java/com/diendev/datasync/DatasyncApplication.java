package com.diendev.datasync;

import com.diendev.datasync.component.DataSynchronizerWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatasyncApplication {
	private static final Logger log = LoggerFactory.getLogger(DatasyncApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DatasyncApplication.class, args);
		try {
			applicationContext.getBean(DataSynchronizerWrapper.class).syncData();
		} catch (BeansException e) {
			log.error("syncDataEnabled turned off {}", e.getMessage());
		}
	}

}
