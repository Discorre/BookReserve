package com.example.proektnadiplom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapterRV extends AppCompatActivity {
    int booksList;
    Button serchbtn;
    EditText serchet;
    private int layout;
    private final ArrayList<Books> books;
    private final LayoutInflater inflater;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booklist);

        serchbtn = findViewById(R.id.searchbtn);
        serchet  =findViewById(R.id.search);
    }

    public BookAdapterRV(@NonNull Context context, int list_item, ArrayList<Books> books) {
        super(list_item);
        this.books = books;
        this.booksList = list_item;
        this.inflater = LayoutInflater.from(context);
    }

    public void onBindViewHolder(@NonNull BookAdapterRV.ViewHolder holder, int position) {
        Books books = Books.get(position);
        holder.name.setText(books.getName());
        holder.author.setText(books.getAuthor());
        holder.resbtn.setOnClickListener(v -> {

        });

        class ViewHolder extends RecyclerView.ViewHolder {
            final Button resbtn;
            final TextView name, author;
            final ImageView foto;

            ViewHolder(@NonNull View v) {
                super(v);
                resbtn = v.findViewById(R.id.reservebtn);
                name = v.findViewById(R.id.name);
                author = v.findViewById(R.id.author);
                foto = v.findViewById(R.id.foto);

            }
        }
    }

    public class ViewHolder {
        final Button resbtn;
        final TextView name, author;
        final ImageView foto;

        ViewHolder(@NonNull View v) {
            resbtn = v.findViewById(R.id.reservebtn);
            name = v.findViewById(R.id.name);
            author = v.findViewById(R.id.author);
            foto = v.findViewById(R.id.foto);

        }
    }
}
