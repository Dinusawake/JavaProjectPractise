package com.capgemini.services.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.capgemini.services.bean", "com.capgemini.services.config", "com.capgemini.services.test" })

public class AppConfig {

}
