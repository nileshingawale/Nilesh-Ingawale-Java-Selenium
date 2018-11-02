package com.figmd.session4;


class ABC
{
	private int age = 12;
	
	void showAge()
	{
		System.out.println(age);
	}
	
	
}
public class BankDetails
{
	private int balance;
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	private void show()
	{
		System.out.println(balance);
	}
	
	
	
	
	public static void main(String[] args) 
	{
			ABC a = new ABC();
			a.showAge();
			//a.age = 19;

	}

}
