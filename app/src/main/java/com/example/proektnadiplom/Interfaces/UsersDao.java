
package com.example.proektnadiplom.Interfaces;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao()
public interface UsersDao {

    @Query("SELECT * FROM users")
    List<Users> getAll();

    @Insert
    void insert(Users insertUsers);

    @Delete
    void delete(Users delUsers);

    @Update
    void update(Users updateUsers);


}

