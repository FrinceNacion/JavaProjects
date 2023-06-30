package com.example.page;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    private static final String DataBase_Name = "Page";
    private static final int DataBase_Version = 1;
    private static final String Table_Name = "myBooks";
    private static final String ID_Col = "ID";
    private static final String BookName_Col = "Names";
    private static final String BookPageTracks_Col = "Pages no.";
    private static final String BookQuotes = "Quotes";

    public MyDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DataBase_Name, null, DataBase_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE "+ Table_Name +" ("+
                ID_Col+"INTEGER PRIMARY KEY AUTOINCREMENT, "+
                BookName_Col+" TEXT,"+
                BookPageTracks_Col+" TEXT,"+
                BookQuotes+" TEXT)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVer, int newVer) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ Table_Name);
        onCreate(sqLiteDatabase);
    }

    //Adds a book in the table
    public  void addNewBook(String bookName, String bookPage, String bookQuote ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(BookName_Col, bookName);
        values.put(BookPageTracks_Col, bookPage);
        values.put(BookQuotes, bookQuote);

        db.insert(Table_Name, null, values);
        db.close();
    }

    //Updates a book in the table
    public void updateBook(){
        return;
    }
}
