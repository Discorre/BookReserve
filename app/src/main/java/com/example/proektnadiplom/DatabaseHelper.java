package com.example.proektnadiplom;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "library.db";
    private static final int SCHEMA = 1;
    public static final String TABLE = "users";

    public static final String COLUMN_ID = "id";
    private static final String COLUMN_NUMPASS = "numpass";
    private static final String COLUMN_BIRTHDAY = "birthday";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_FAMILE = "famile";
    private static final String COLUMN_SURNAME = "surname";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_FAMILE + " TEXT NOT NULL, "
                + COLUMN_NAME + " TEXT NOT NULL, "
                + COLUMN_SURNAME + " TEXT NOT NULL, "
                + COLUMN_NUMPASS + " INTEGER NOT NULL, "
                + COLUMN_BIRTHDAY + " DATE NOT NULL );");
        db.execSQL("INSERT INTO " + TABLE + " ("
                + COLUMN_FAMILE + ", "
                + COLUMN_NAME + ", "
                + COLUMN_SURNAME + ", "
                + COLUMN_NUMPASS + ", "
                + COLUMN_BIRTHDAY + ") VALUES ('Михайлов','Егор','Сергеевич','8113000000','31.12.99' );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}