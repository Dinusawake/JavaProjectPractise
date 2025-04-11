package com.capgemini.services.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ReportService {

	@Autowired

	private ReportDao reportDao;

	public ReportService() {
		System.out.println("0 Param Constructor");
	}

	@Autowired
	public ReportService(ReportDao reportDao) {

		System.out.println("Parameterized Constructor");
		this.reportDao = reportDao;
	}

	public void generateReport() {
		reportDao.getData();
		System.out.println("Report Generated");
	}
}
