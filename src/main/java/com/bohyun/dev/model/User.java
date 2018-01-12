package com.bohyun.dev.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
public class User {

	private int id;
	private String email;
	private String passwd;
	private String name;
	private String phone;

}
