package com.example.roomwithview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "zero";
    public static final String EXTRA_REPLY2 = "um";
    public static final String EXTRA_REPLY3 = "tres";

    private EditText mEditWordView;
    private EditText mEditTitleView;
    private EditText mEditNumView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        mEditWordView = findViewById(R.id.edit_conteudo);
        mEditTitleView = findViewById(R.id.edit_titulo);
        mEditNumView = findViewById(R.id.edit_num);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                Word word = new Word();

                if (TextUtils.isEmpty(mEditWordView.getText())) {

                    setResult(RESULT_CANCELED, replyIntent);

                }else if(TextUtils.isEmpty(mEditTitleView.getText())) {

                    setResult(RESULT_CANCELED, replyIntent);

                }else if(TextUtils.isEmpty(mEditNumView.getText())) {

                    setResult(RESULT_CANCELED, replyIntent);

                }else {
                    String texto = mEditWordView.getText().toString();
                    String titulo = mEditTitleView.getText().toString();
                    String num = mEditNumView.getText().toString();

                    replyIntent.putExtra(EXTRA_REPLY2, texto);
                    replyIntent.putExtra(EXTRA_REPLY, titulo);
                    replyIntent.putExtra(EXTRA_REPLY3, num);

                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }

        });
    }



}

