package com.capgemini.services.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class OracleReportDao implements ReportDao{
	
	
	@Override
	public void getData() {
		System.out.println("Getting data from Oracle Db....");
		
	}

}
