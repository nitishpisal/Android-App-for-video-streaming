package com.example.login;



import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Demo1Activity extends Activity {
	
	 
	public static SQLiteDatabase Con = null;
	 String []aa=null;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button b1=(Button) findViewById(R.id.btnMainregister);
        final Button b2=(Button) findViewById(R.id.btnMainexit);
        final Button b3=(Button) findViewById(R.id.btnMainlogin);
     
       
     //  ArrayList<String[]> la=db.GetUserList();
      Con=this.openOrCreateDatabase("db_user", MODE_PRIVATE, null);
      DBHandling db = new DBHandling();
        userExt();
     
        if(aa[0]!=null)
        {
        	b3.setVisibility(1);
        	
        }
        else
        {
        	b1.setVisibility(1);
        
        }
      
        b1.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) 
	          {
        		 showRegistration();
	          }
				
			
		});
        
     
        b2.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) 
	          {
        		ApplicationExit();
	          }
				
			
		});
                
        b3.setOnClickListener(new View.OnClickListener() {
          	 public void onClick(View v) 
   	          {
          		
		showLogin();
   	          }
   				
   			
   		});
      
           
          
       
    }
    public void showRegistration()
    {
    	Intent i=new Intent();
    	i.setClass(this, Registration.class);
    	startActivity(i);
    }
    public void showLogin()
    {
    	Intent i=new Intent();
    	i.setClass(this, Login.class);
    	startActivity(i);
    }
    public void ApplicationExit()
    {
    	ApplicationExit();
    }
    public void userExt()
    {
    	
    	 DBHandling db = new DBHandling();
        aa= db.GetUser();
       
    }
  
   
    
   
}
