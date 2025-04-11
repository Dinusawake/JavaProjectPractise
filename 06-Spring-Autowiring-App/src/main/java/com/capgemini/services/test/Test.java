package com.capgemini.services.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.services.bean.ReportService;
import com.capgemini.services.config.AppConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ReportService rs = context.getBean(ReportService.class);

		rs.generateReport();

	}

}
