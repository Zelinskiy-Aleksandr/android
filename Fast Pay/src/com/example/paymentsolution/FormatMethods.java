package com.example.paymentsolution;

public class FormatMethods {
	
	public static String formatAmount(StringBuilder amountValue, int exponenta)
	{
		
		String zeroesAfterPoint = "";
				
		if(amountValue.length() <= exponenta)
		{	
		   for(int i = 0; i < exponenta - amountValue.length(); i++)
			   zeroesAfterPoint += "0";
		   return "0." + zeroesAfterPoint + amountValue.toString();
		}
		return amountValue.substring(0, amountValue.length() - exponenta) + "." + amountValue.substring(amountValue.length() - exponenta, amountValue.length());
		
	} 

}
