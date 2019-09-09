package com.example.roomwithview;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Num")
    private String num;
   // @ColumnInfo(name = "conteudo")
    private String Word;
    //@ColumnInfo(name = "titulo")
    private String Title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum( String num) {
        this.num = num;
    }

    public String getWord() {
        return Word;
    }

    public void setWord( String word) {
        Word = word;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle( String title) {
        Title = title;
    }
}
