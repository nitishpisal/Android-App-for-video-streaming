package com.example.login;

import java.util.ArrayList;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBHandling {
	public static String DB_NAME = "TaskMgt";
	public static String TABLE_NAME = "userMain52";
	public static String TABLE_NAME_EX_APP="ex_app32";
	public static SQLiteDatabase Con = null;

	public DBHandling() {
		try {
			if (Con == null) {
				Con = Demo1Activity.Con;
				Con.execSQL("CREATE TABLE IF NOT EXISTS "
						+ TABLE_NAME
						+ " (name VARCHAR, password VARCHAR);");
				
				Con.execSQL("CREATE TABLE IF NOT EXISTS "
						+ TABLE_NAME_EX_APP
						+ " (appname VARCHAR, lock VARCHAR);");
					
			}
		} catch (Exception e) {

		}
	}

	public boolean AddUser(String name, String password) {
		boolean f = false;
		try {
			Con.execSQL("INSERT INTO " + TABLE_NAME + " Values ('" + name
					+ "','" + password + "');");
			f = true;
		} catch (Exception e) {

		}
		return f;

	}

	

	public boolean CheckUserNameExits(String name,String password) {
		boolean f = true;
		try {
			Cursor c = Con.rawQuery("SELECT name FROM " + TABLE_NAME
					+ " where name='" + name + "' AND password='"+password+"'", null);

			if (c != null) {
				if  (c.moveToFirst()) {
				f = false;				
    		} 
			}
		} catch (Exception e) {

		}
		return f;

	}

	public ArrayList<String[]> GetUserList() {
		ArrayList<String[]> al=new ArrayList<String[]>(); 
		try {
			Cursor c = Con.rawQuery("SELECT name FROM " + TABLE_NAME, null);
			if (c != null) {
				if  (c.moveToFirst()) {
        			do {
        				String[] obj=new String[4];
        				obj[0]=c.getString(c.getColumnIndex("name"));
        				obj[1]=c.getString(c.getColumnIndex("password"));
        				

        				al.add(obj);
        			}while (c.moveToNext());
        		} 
			}
		} catch (Exception e) {

		}
		return al;

	}
	public String[] GetUser() {
		String[] obj=new String[4];
		try {
			Cursor c = Con.rawQuery("SELECT name,password FROM " + TABLE_NAME, null);
			if (c != null) {
				if  (c.moveToFirst()) {
        			//do {
        				
        				obj[0]=c.getString(c.getColumnIndex("name"));
        				obj[1]=c.getString(c.getColumnIndex("password"));
        				


        			//}while (c.moveToNext());
        		} 
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return obj;

	}
	public String[] GetUserByName(String name) {
		String[] obj=new String[4];
		try {
			Cursor c = Con.rawQuery("SELECT name,password FROM " + TABLE_NAME + " WHERE name='"
					+ name + "'", null);
			if (c != null) {
				 
        				
        				obj[0]=c.getString(c.getColumnIndex("name"));
        				obj[1]=c.getString(c.getColumnIndex("password"));
        				
 
			}
		} catch (Exception e) {

		}
		return obj;

	}
	
	/////////Code  For TABLE_NAME_EX_APP="ex_app"
	
	public boolean CheckApplicationExits(String appname) {
		boolean f = true;
		try {
			Cursor c = Con.rawQuery("SELECT appname FROM " + TABLE_NAME_EX_APP
					+ " where appname='" + appname + "'", null);

			if (c != null) {
				if  (c.moveToFirst()) {
				f = false;				
    		} 
			}
		} catch (Exception e) {

		}
		return f;

	}
	public String[] GetApplication() {
		String[] obj=new String[2];
		try {
			Cursor c = Con.rawQuery("SELECT appname,lock FROM " + TABLE_NAME_EX_APP, null);
			if (c != null) {
				if  (c.moveToFirst()) {
        			        				
        				obj[0]=c.getString(c.getColumnIndex("appname"));
        				obj[1]=c.getString(c.getColumnIndex("lock"));
        			        			 
        		} 
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return obj;

	}
	public String[] GetApplicationByName(String appname) {
		String[] obj=new String[2];
		try {
			Cursor c = Con.rawQuery("SELECT appname,lock FROM " + TABLE_NAME_EX_APP
					+ " where appname='" + appname + "'", null);
			if (c != null) {
				if  (c.moveToFirst()) {
        			        				
        				obj[0]=c.getString(c.getColumnIndex("appname"));
        				obj[1]=c.getString(c.getColumnIndex("lock"));
        			        			 
        		} 
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return obj;

	}
	public boolean AddAppication(String appname, String lock) {
		boolean f = false;
		try {
			Con.execSQL("INSERT INTO " + TABLE_NAME_EX_APP + " Values ('" + appname
					+ "','" + lock + "');");
			f = true;
		} catch (Exception e) {

		}
		return f;

	}

	public boolean UpdateAppication(String appname1,String lock1) {
		boolean f = false;
		try {
			Con.execSQL("UPDATE " + TABLE_NAME_EX_APP
					+ " SET lock='"+lock1+"' WHERE appname='" + appname1 + "';");
			f = true;
		} catch (Exception e) {

		}
		return f;

	}

	public boolean DeleteAppication(String appname) {
		boolean f = false;
		try {
			Con.execSQL("DELETE FROM " + TABLE_NAME_EX_APP + " WHERE appname='"
					+ appname + "';");
			f = true;
		} catch (Exception e) {

		}
		return f;

	}
	public ArrayList<String[]> GetApplicationList() {
		ArrayList<String[]> al=new ArrayList<String[]>(); 
		try {
			Cursor c = Con.rawQuery("SELECT appname,lock FROM " + TABLE_NAME_EX_APP, null);
			if (c != null) {
				if  (c.moveToFirst()) {
        			do {
        				String[] obj=new String[2];
        				obj[0]=c.getString(c.getColumnIndex("appname"));
        				obj[1]=c.getString(c.getColumnIndex("lock"));
        				al.add(obj);
        			}while (c.moveToNext());
        		} 
			}
		} catch (Exception e) {

		}
		return al;

	}
	
}
