package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		Employee e1 = new Employee(10,"Madhu",65000);
		try {
			FileOutputStream fos = new FileOutputStream("C://Employee/employee.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(e1);
			System.out.println("Object is Serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fos1= new FileInputStream("C://Employee/employee.txt");
			ObjectInputStream oos1= new ObjectInputStream(fos1);
			Employee e2=(Employee)oos1.readObject();
			System.out.println(e2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			
		}

	}

}
