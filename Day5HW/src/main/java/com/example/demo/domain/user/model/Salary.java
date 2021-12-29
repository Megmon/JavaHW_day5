package com.example.demo.domain.user.model;

import lombok.Data;

@Data
public class Salary{
	private String userId;
	private String paymentYearMonth;
	private Integer salary;
}