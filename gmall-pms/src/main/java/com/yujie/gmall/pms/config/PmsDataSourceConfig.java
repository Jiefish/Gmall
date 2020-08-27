package com.yujie.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Classnam PmsDataSourceConfig
 * @Date 2020/8/27 21:21
 */
public class PmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {

        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);

        return dataSource;
    }
}
