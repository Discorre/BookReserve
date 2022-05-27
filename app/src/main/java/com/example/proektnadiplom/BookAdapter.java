package com.example.proektnadiplom;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends AppCompatActivity {
    /*
        private List<Books> dataBooks = new ArrayList<>();



        //private OnDeleteListener onDeleteListener;
        private Context context;


        public BookAdapter(List<Books> dataBooks, Context context) {
            this.dataBooks = dataBooks;
            this.context = context;
        }


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklist, parent,
                    false);

            return new NewsViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            final NewsViewHolder viewHolder = (NewsViewHolder) holder;
            viewHolder.title.setText(dataBooks.get(position).);
        }

        @Override
        public int getItemCount() {
            return 0;
        }
        public class NewsViewHolder extends RecyclerView.ViewHolder {
            @BindView(R.id.name)
            public TextView title;
            @BindView(R.id.author)
            public TextView author;
            @BindView(R.id.reservebtn)
            public Button resbtn;




            public NewsViewHolder(@NonNull View itemView) {
                super(itemView);

            }
        }*/
    ArrayList<Books> booksList = new ArrayList<>();
    RecyclerView recyclerView;
    BookAdapterRV bookAdapterRV;
    DatabaseHelperBooks databaseHelperBooks;
    SQLiteDatabase library;
    EditText sercher;
    TextView p_title, p_author;
    Button resbtn, serchbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booklist);
        databaseHelperBooks = new DatabaseHelperBooks(getApplicationContext());
        library = databaseHelperBooks.getReadableDatabase();
        p_title = findViewById(R.id.name);
        p_author = findViewById(R.id.author);
        resbtn = findViewById(R.id.reservebtn);
        sercher = findViewById(R.id.search);
        serchbtn = findViewById(R.id.searchbtn);
        serchbtn.setOnClickListener(v -> {

        });
        resbtn.setOnClickListener(v -> {

        });
        recyclerView = findViewById(R.id.list_viewselect);
        initBooks();
        bookAdapterRV = new BookAdapterRV(this, booksList);
        recyclerView.setAdapter(bookAdapterRV);
    }

    private void initBooks() {
        booksList.clear();
        for (int i = 0; i < 10; i++) {
            booksList.add(new Books("Капитанская дочка", "А.С.Пушкин"));
            booksList.add(new Books("Война и мир", "Л.Н.Толстой"));
            booksList.add(new Books("Челкаш", "М.Горький"));
            booksList.add(new Books("Человек в футляре", "А.П.Чехов"));
            booksList.add(new Books("Преступление и наказание", "Ф.И.Достоевский"));
            booksList.add(new Books("Ревизор", "Н.В.Гоголь"));
            booksList.add(new Books("Собачье сердце", "М.Булгаков"));
            booksList.add(new Books("Три товарища", "Эрих Мария Ремарк"));
            booksList.add(new Books("Мёртвые Души", "Н.В.Гоголь"));
            booksList.add(new Books("Евгений Онегин", "А.С.Пушкин"));
        }
            /*String title = p_title.getText().toString();
        String author = p_author.getText().toString();
        library.execSQL("INSERT INTO " + TABLE + " VALUES ("
                + title + ","
                + author + ");");
        bookAdapterRV.notifyDataSetChanged();*/
    }
}

