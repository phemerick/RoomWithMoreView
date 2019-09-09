package com.example.roomwithview;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

   // @Query("DELETE FROM word_table WHERE")

    @Query("SELECT * from word_table ORDER BY num ASC")
    LiveData<List<Word>> getAllWords();

}


