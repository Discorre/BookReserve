package com.example.proektnadiplom;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.proektnadiplom.Interfaces.AppDatabaseUsers;


public class Details extends AppCompatActivity {
        AppDatabaseUsers library = Room.databaseBuilder(getApplicationContext(),
            AppDatabaseUsers.class, "library")
            .allowMainThreadQueries()
            .build();


    public static Details instance;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        library = Room.databaseBuilder(this, AppDatabaseUsers.class, "library").build();
    }

    public static Details getInstance() {
        return instance;
    }

    public AppDatabaseUsers getDatabase() {
        return library;
    }
}


    /*private String newname;
    private String newfamile;
    private String newsurname;
    private int newnumpass;
    private String newbirthday;

    public Details(String newname, String newfamile, String newsurname, int newnumpass, String newbirthday) {
        this.newname = newname;
        this.newfamile = newfamile;
        this.newsurname = newsurname;
        this.newnumpass = newnumpass;
        this.newbirthday = newbirthday;
    }

    public String getNewname() {
        return newname;
    }

    public String getNewfamile() {
        return newfamile;
    }

    public String getNewsurname() {
        return newsurname;
    }

    public int getNewnumpass() {
        return newnumpass;
    }

    public String getNewbirthday() {
        return newbirthday;
    }
}*/

