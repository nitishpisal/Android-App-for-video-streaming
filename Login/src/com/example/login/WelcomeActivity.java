package com.example.login;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        		
        Button b = (Button) findViewById(R.id.button1);{
        	b.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startActivity(new Intent(WelcomeActivity.this, CameraActivity.class));
				}
			});
        	
        	
        }
       
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}