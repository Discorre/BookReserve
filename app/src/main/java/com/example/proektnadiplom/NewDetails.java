package com.example.proektnadiplom;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class NewDetails extends AppCompatActivity {

    //RecyclerView userview;
    DatabaseHelper databaseHelper;
    SQLiteDatabase library;
    Cursor userCursor;
    long userID = 0;

    EditText etnewname, etnewfamile, etnewsurename, etnewnumpass, etnewbirthday;
    Button btnok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newdetails_main);

        etnewname = findViewById(R.id.newname);
        etnewfamile = findViewById(R.id.newfamname);
        etnewsurename = findViewById(R.id.newsurname);
        etnewnumpass = findViewById(R.id.newnumpass);
        etnewbirthday = findViewById(R.id.newbirthday);
        btnok = findViewById(R.id.btnok);

        databaseHelper = new DatabaseHelper(this);
        /*library = databaseHelper.getWritableDatabase();*/


        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            userID = extras.getLong("id");
        }
        if (userID > 0) {
            userCursor = library.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE + " WHERE " + DatabaseHelper.COLUMN_ID + "=?", new String[]{String.valueOf(userID)});
            userCursor.moveToFirst();
            etnewname.setText(userCursor.getString(1));
            etnewfamile.setText(userCursor.getString(2));
            etnewsurename.setText(userCursor.getString(3));
            etnewnumpass.setText(String.valueOf(userCursor.getInt(4)));
            etnewbirthday.setText(userCursor.getString(5));
        }


    }

    public void delete(View view) {
        library.delete(DatabaseHelper.TABLE, "id = ?", new String[]{String.valueOf(userID)});
        goHome();

    }


    private void goHome() {
        library.close();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
 /*   EditText etnewname, etnewfamile, etnewsurename, etnewnumpass, etnewbirthday;
    Button btnok;
    private long id;
    public SQLiteDatabase library;
    Details details = (Details) getIntent().getSerializableExtra("Details");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newdetails_main);
        library = getBaseContext().openOrCreateDatabase("library.db", MODE_PRIVATE, null);
        library.execSQL("CREATE TABLE IF NOT EXISTS users(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, famile TEXT, surname TEXT, numpass TEXT, birthday TEXT)");

        etnewname = findViewById(R.id.newname);
        etnewfamile = findViewById(R.id.newfamname);
        etnewsurename = findViewById(R.id.newsurname);
        etnewnumpass = findViewById(R.id.newnumpass);
        etnewbirthday = findViewById(R.id.newbirthday);

        if (getIntent().hasExtra("Details")) {

            etnewname.setText(details.getNewname());
            etnewfamile.setText(details.getNewfamile());
            etnewsurename.setText(details.getNewsurname());
            etnewbirthday.setText(details.getNewbirthday());
            etnewnumpass.setText(details.getNewnumpass());
        } else {
            id = -1;
        }


        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDetails();
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        library.close();
    }

    private void initDetails() {
    }
}*/
