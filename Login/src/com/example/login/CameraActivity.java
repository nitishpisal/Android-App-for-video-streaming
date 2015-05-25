package com.example.login;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



 public class CameraActivity extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        		
        Button b1 = (Button) findViewById(R.id.camera1);{
        	b1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.43.94/motionvideo/Camera1.avi"));
				startActivity(browserIntent);
			}});
        	
        	
        }
        
        Button b2 = (Button) findViewById(R.id.camera2);{
        	b2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.43.94/motionvideo/Camera2.avi"));
				startActivity(browserIntent);
			}});
        	
        	
        }
        
        Button b3 = (Button) findViewById(R.id.camera3);{
        	b3.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.43.94/motionvideo/Camera3.avi"));
				startActivity(browserIntent);
			}});
        	
        	
        }
        
        Button b4 = (Button) findViewById(R.id.camera4);{
        	b4.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.43.94/motionvideo/Camera4.avi"));
				startActivity(browserIntent);
			}});
        	
        	
        }
       
    }
}