package com.uninsured.web.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


/**
 * 
 * @author ANKEM
 *
 */

@Configuration
@ComponentScan({"com.banana.spytutors.web","com.banana.spytutors.data"})
@EnableMongoRepositories({"com.banana.spytutors.web.app.config"}) 
@Import({MongoDBConfig.class})
public class AppConfig {
	
}
