package com.wipro.ExceptionHandling;

class InvalidCountryException extends Exception
{
	public InvalidCountryException(String s)
	{
		super(s);
	}
	
}
class userRegistration
{
	public void registeruser(String username,String usercountry) throws InvalidCountryException
	{
			if(usercountry!="India") {
				throw new InvalidCountryException("user outside india cannot be registered");
			}
			else {
				System.out.println("Registration succesful");
			}
	}
}
public class Main {

	public static void main(String[] args) {
		userRegistration obj=new userRegistration();
		try
		{
			//obj.registeruser("John","usa");
			obj.registeruser("abc","India");
		}
		catch(InvalidCountryException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		// TODO Auto-generated method stub

	}

}
