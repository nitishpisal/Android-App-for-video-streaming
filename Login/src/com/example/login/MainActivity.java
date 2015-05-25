package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	Button bt;
	EditText et;
	TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.enternameEditText1);
       
        tv=(TextView)findViewById(R.id.enternameTextView1);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(this);
    }
    public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	    Editable etd=et.getText();
	
	    if(etd.toString().equals("Gajendra")){
	    tv.setText("Welcome"+" "+etd);
	    }
	}
}