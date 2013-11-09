package com.example.paymentsolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		final Activity activity = this;
		
		Thread timer = new Thread(){
			public void run()
			{
				try
				{
					sleep(1000);
			    }	
				catch(InterruptedException ie)
				{
					
				}
				finally{
					Intent intent = new Intent("com.example.paymentsolution.SelectOperation");
					startActivity(intent);
					activity.finish();				
				}
			}
			
		};
		timer.start();
	}


}
