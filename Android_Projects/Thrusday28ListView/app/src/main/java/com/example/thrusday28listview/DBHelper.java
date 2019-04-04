package com.example.thrusday28listview;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper
{
    private static final String dbname="list";
    private static final String Table_name="users";

    private static final String COL0="id";
    private static final String COL1="name";


    public DBHelper(Context context){

        super(context, Table_name,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "create table " + Table_name + " (id integer primary key autoincrement , " + COL1 + " TEXT)";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addUser(String name){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL1,name);
        long result = db.insert(Table_name,null,cv);

        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "select *from " + Table_name;
        Cursor data = db.rawQuery(sql,null);
        return data;
    }

    public void delUser(){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "select *from " + Table_name;
       

    }
}
