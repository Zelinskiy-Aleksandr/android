package com.example.paymentsolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class TransactionResult  extends Activity implements OnClickListener{
     

	static final String statusLabel[] = {"Swipe a card", "PIN entry", "Authorisation...", "Transaction is successful"};
	static final String nameOfPicture[] = {"swipe_card", "pinentry", "authorisation", "ok_icon"};
    
	
	             TextView status;
                 ImageButton icon;
                 Button receipt, exit;
                 int i = 1;
	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_transaction_result);
	    status = (TextView)findViewById(R.id.status_label);
	    icon = (ImageButton)findViewById(R.id.status_button);
	    receipt = (Button)findViewById(R.id.get_receipt);
	    exit = (Button)findViewById(R.id.exit);
	    icon.setOnClickListener(this);
	    status.setText(statusLabel[0]);
		icon.setBackgroundResource(this.getResources().getIdentifier(nameOfPicture[0], "drawable", this.getPackageName()));
		receipt.setOnClickListener(this);
		exit.setOnClickListener(this);
	
	}
	@Override
	public void onClick(View v) { 
		    if(i < statusLabel.length)
		    {
		    	  status.setText(statusLabel[i]);
		          icon.setBackgroundResource(this.getResources().getIdentifier(nameOfPicture[i++], "drawable", this.getPackageName()));
		    }      
		    if(i == statusLabel.length)
		    {	
		    	  receipt.setVisibility(View.VISIBLE);
                  exit.setVisibility(View.VISIBLE);		           
		    }
		    if(receipt == v)
		    {
		    	Intent intent = new Intent("com.example.paymentsolution.Receipt");
		    	startActivity(intent);
		    	this.finish();
		    }
		    if(exit == v)
		    {
		    	Intent intent = new Intent("com.example.paymentsolution.SelectOperation");
		    	startActivity(intent);
		    	this.finish();
		    }
		    
		      
		
	}
	
}
