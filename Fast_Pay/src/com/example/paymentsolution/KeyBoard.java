package com.example.paymentsolution;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class KeyBoard implements OnClickListener{

	public static final int CURRENCY_EXPONENTA = 2;
	public static final String INITIAL_AMOUNT = "0.00";
	public static final int MAXIMUM_AMOUNT_LENGTH = 9;
	
	EditText amount;
    StringBuilder amountValue;
    String actionName;
    Intent action;
	 
	KeyBoard(EditText amount, StringBuilder amountValue, String actionName, Intent action)
	{
	  this.amount = amount;
	  this.amountValue = amountValue;
	  this.actionName = actionName;
	  this.action = action;
	}
	
	@Override
	public void onClick(View v) {
		
        Button button = (Button)v;
		
        if((amountValue.length() == 0) && (button.getText().equals("0")))
	           return;
  
	    if(button.getText().equals("<-") && (amountValue.length() != 0))
		   {
			   amountValue.deleteCharAt(amountValue.length() - 1); 
			   amount.setText(FormatMethods.formatAmount(amountValue, CURRENCY_EXPONENTA));
		   }
	    
	    if(amountValue.length() == 0)	      
			   amount.setText(INITIAL_AMOUNT);
		
	    if(!button.getText().equals("<-") && !button.getText().equals(actionName) && (amountValue.length() < MAXIMUM_AMOUNT_LENGTH))
		   {
					   
			   amountValue.append(button.getText().toString());
			   amount.setText(FormatMethods.formatAmount(amountValue, CURRENCY_EXPONENTA));
		   }
	    
	    if(button.getText().equals(actionName) && !amount.getText().toString().equals(INITIAL_AMOUNT))
	        v.getContext().startActivity(action);
	    	
		
	}

}
