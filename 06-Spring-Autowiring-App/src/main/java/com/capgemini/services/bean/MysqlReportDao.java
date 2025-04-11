package com.capgemini.services.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository	()	

public class MysqlReportDao implements ReportDao{

	@Override
	public void getData() {
		System.out.println("Getting data from MySQL Db....");
		
	}

}
