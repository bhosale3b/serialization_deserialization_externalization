package com.app.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationDeserialization {

	public static void write(){
		Student student = new Student();
		student.setId(123);
		student.setName("poo");
		student.setMobile("9579927053");
		student.setAddress("pune");
	
	
	FileOutputStream fos = null;
	try {
		fos = new FileOutputStream(new File("student.txt"));//file take 
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(student);//write object
		out.flush();//file close
		System.out.println("student serialized successfully");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}catch (IOException e) {
		
		e.printStackTrace();
	}finally {
		try {
			fos.close();//file close
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}public static void read() {
	FileInputStream fis =null;
	try {
		 fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student;
		try {
			student = (Student) ois.readObject();
			System.out.println(student);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	read() ;
	write();
	
}
	
		
		
	}
	
	
