package com.capgemini.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter

//@ToString


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private Integer personId;
	private String personName;
	private String personGender;
	private long mobileNumber;

}
