package com.greatlearning.EmailApp.service;

import java.util.Random;

import com.greatlearning.EmailApp.model.Employee;





public class CredentialService {
	
	

	public  String generatePassword()
	
	{
		
		String passwordchars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+/;";
		
		char[] array=new char[8];
		
		Random random=new Random();
		
		for (int i=0 ;i<array.length;i++)
		{
			array[i]=passwordchars.charAt(random.nextInt(passwordchars.length()));
		}
		
		return new String(array);
				
	}
	
	public String  generateEmailAddress(Employee emp)
	{
		
		return emp.getFirstName()+emp.getLastName()+"@"+emp.getDept()+".gl.in";
		
		
	}
	
	public void showCredentials(Employee emp , String password, String emailadd)
	
	{
		
		System.out.println("Dear "+emp.getFirstName()+" "+emp.getLastName()+ " your generated credentials are as follows");
	System.out.println("Email--->"+emailadd);
	System.out.println("Password--->"+password);
	}

}
