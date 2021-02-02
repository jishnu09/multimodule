package com.multimodule.database.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class DatabaseConnector {
    private final Logger log= LoggerFactory.getLogger(DatabaseConnector.class);
    @Autowired
    DataSource dataSource;
    public void connectDatabase(){
        log.info("Hello!!!!!!!!!!");
        try {
            log.info(dataSource.getConnection() + "");
        }catch (Exception e){
            log.error("",e);
        }
    }
}
