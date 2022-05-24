package com.example.proektnadiplom.Interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface BookDao {
    @Query("SELECT * FROM books")
    List<Book> getAll();

    @Insert
    void insert(Book insertBook);

    @Delete
    void delete(Book delBook);

    @Update
    void update(Book updateBook);

}
