package com.example.paymentsolution;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Receipt extends Activity implements OnClickListener{
    
	Button exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_receipt);
		exit = (Button)findViewById(R.id.exit);
		exit.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		this.finish();
	}

	
	
}
