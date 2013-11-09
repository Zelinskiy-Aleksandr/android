package com.example.paymentsolution;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class CopyReceipt extends Activity{
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_copyreceipt);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_operation, menu);
		return true;
	}

	
}
