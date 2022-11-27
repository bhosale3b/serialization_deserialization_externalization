package com.app.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 9064697551330196639L;
	
	private int id;
	 private String name;
	 private  transient String mobile;// transient we used for the perticular variable u don't want make it serializable
	 private transient String address;
	
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

	 
}
