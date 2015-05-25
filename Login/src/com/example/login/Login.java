package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	DBHandling db=new DBHandling();
    private TextView nameTv;
	   private TextView passwordTv;
	
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        setUpViews();
	        
	        
	        final Button b1=(Button) findViewById(R.id.btnLoginlogin);
		      
	        b1.setOnClickListener(new View.OnClickListener() {
	        	 public void onClick(View v) 
		          {
	        		 boolean b=chkLogin();
	        		 if(b==false)
	        		 {
	        			 Toast.makeText(getApplicationContext(), "Login Sucessfull..... ",Toast.LENGTH_LONG).show();
	        			 showuserinfo();
	        			
	        		 }
	        		 else
	        		 {
	        			 Toast.makeText(getApplicationContext(), "Plz Enter Correct UserName/Password",Toast.LENGTH_LONG).show();
	        		 }
		          }
					
				
			});
	        final Button b2=(Button) findViewById(R.id.btnLoginback);
		      
	        b2.setOnClickListener(new View.OnClickListener() {
	        	 public void onClick(View v) 
		          {
	        		 
	        		 	System.exit(0);
		          }
					
				
			});
	        
	  }
	   
	   private void setUpViews() {
		   nameTv = (TextView) findViewById(R.id.etLoginUserName);
		   passwordTv = (TextView) findViewById(R.id.etLoginPassword);
		 
	   }

	  public boolean chkLogin()
	  {
		  String name=nameTv.getText().toString();
		  String password=passwordTv.getText().toString();
		boolean b=db.CheckUserNameExits(name,password);
		return b;
	  }
	  public void showuserinfo()
	    {
	    	Intent i=new Intent();
	    	i.setClass(this, WelcomeActivity.class);
	    	startActivity(i);
	    }
}
