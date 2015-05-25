package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends Activity{
    			private TextView nameView;
    			private TextView passdView;
    			
    			 private EditText nameEt;
    			 private EditText passwordEt;
    			
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.registration);
	
	        nameEt = (EditText) findViewById(R.id.etRegUsername);
 		   passwordEt = (EditText) findViewById(R.id.etRegPassword);
 		 
 		   
	        final Button b1=(Button) findViewById(R.id.btnRegisterReg);
	        b1.setOnClickListener(new View.OnClickListener() {
	        	 public void onClick(View v) 
		          {
	        		 
	        		 	saveInfo();
		          }
					
				
			});
	    	nameView=(TextView) findViewById(R.id.etRegUsername);
	    	passdView=(TextView)findViewById(R.id.etRegPassword);
	    	
	    	
	        final Button b2=(Button) findViewById(R.id.btnClear);
	        b2.setOnClickListener(new View.OnClickListener() {
	        
	        	 public void onClick(View v) 
		          {
	        		clearText();
		          }
					
				
			});
	        
	        
	    }
	 public void clearText()
	 {
		 nameView.setText("");
		 passdView.setText("");
		
	 }
	 public void saveInfo()
	 {
		 

		 DBHandling db = new DBHandling();

	      if (getIntent().getExtras() == null)
	      {
	    	  db.AddUser(nameEt.getText().toString(),
	    			  passwordEt.getText().toString()
	    			);
	      }
		 Toast.makeText(getApplicationContext(), "Registration  Successfull.....", Toast.LENGTH_LONG).show();
		 showMain();
	 }
	
	 public void showMain()
	    {
	    	Intent i=new Intent();
	    	i.setClass(this, Demo1Activity.class);
	    	startActivity(i);
	    }
	 
}
