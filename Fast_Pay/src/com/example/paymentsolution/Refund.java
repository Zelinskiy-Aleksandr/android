package com.example.paymentsolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;


public class Refund extends Activity{
	
	EditText amount;
    StringBuilder amountValue = new StringBuilder();
	static final String nameOfButton[] = {"btnNum1Id", "btnNum2Id", "btnNum3Id", "btnNum4Id", "btnNum5Id", "btnNum6Id", "btnNum7Id", "btnNum8Id", "btnNum9Id", "btnNum0Id", "btnBackspaceId", "btnPayId"};
	private static final String actionName = "NEXT";
	Intent action = new Intent("com.example.paymentsolution.TransactionResult");
	
	
	Button buttons[] = new Button[nameOfButton.length];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_refund);
        amount = (EditText)findViewById(R.id.amount);
		
		for(int i = 0; i < nameOfButton.length; i++)
		{
			buttons[i] = (Button)findViewById(this.getResources().getIdentifier(nameOfButton[i], "id", this.getPackageName()));
		    buttons[i].setOnClickListener(new KeyBoard(amount, amountValue, actionName, action));
		}  
 	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_operation, menu);
		return true;
	}

	
	
	
}
