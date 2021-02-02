package com.multimodule.database.util;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceCreator {
    private final Logger log= LoggerFactory.getLogger(DatasourceCreator.class);

    @ConfigurationProperties(prefix="spring.datasource")
    @Bean(destroyMethod = "close")
    public DataSource getDatasource(){
        DataSource ds=null;
        try {
            log.info("Initializing Datasource Bean............");
            ds = DataSourceBuilder.create().build();
            log.info("[DONE] Initializing Datasource Bean");
        }catch(Exception e){
            log.error("",e);
        }
        return ds;
    }
}
