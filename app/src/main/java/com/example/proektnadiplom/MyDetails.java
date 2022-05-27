
package com.example.proektnadiplom;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.proektnadiplom.Interfaces.AppDatabaseUsers;
import com.example.proektnadiplom.Interfaces.Users;

import java.util.List;

public class MyDetails extends AppCompatActivity {
    private static MyDetails instance;
    TextView username, famname, surname, numpass, birthday;
    Button remove, update;
    AppDatabaseUsers library = Room.databaseBuilder(getApplicationContext(),
                    AppDatabaseUsers.class, "library.db")
            .allowMainThreadQueries()
            .build();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydetails_main);
        instance = this;
        library = Room.databaseBuilder(this, AppDatabaseUsers.class, "library").build();


        List<Users> all = library.getUserDao().getAll();
        username = findViewById(R.id.username);
        famname = findViewById(R.id.famname);
        surname = findViewById(R.id.surname);
        numpass = findViewById(R.id.numpass);
        birthday = findViewById(R.id.birthday);
        remove = findViewById(R.id.removebtn);
        update = findViewById(R.id.updatebtn);


/*update.setOnClickListener(v -> {
        });
        remove.setOnClickListener(v -> {
        });*/





    }
    public static MyDetails getInstance() {
        return instance;
    }

    public AppDatabaseUsers getDatabase() {
        return library;
    }


}

