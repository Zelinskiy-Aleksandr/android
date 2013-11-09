package com.example.paymentsolution;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SelectOperation extends Activity implements OnClickListener{
	
	static final String nameOfButton[] = {"Purchase", "Refund", "Cancel", "CopyReceipt"};

    ImageButton buttons[] = new ImageButton[nameOfButton.length];
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_operation);
        
		
		for(int i = 0; i < nameOfButton.length; i++)
		{
			buttons[i] = (ImageButton)findViewById(this.getResources().getIdentifier(nameOfButton[i], "id", this.getPackageName()));
		    buttons[i].setOnClickListener(this);
		}  
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_operation, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
	 for(int i = 0; i < nameOfButton.length; i++)
	    if(buttons[i] == (ImageButton)v)
		{
		   Intent intent = new Intent(this.getPackageName()+"."+ nameOfButton[i]);
		   startActivity(intent);	
		}
	}

}
