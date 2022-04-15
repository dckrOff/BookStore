package com.a1tech.upress.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    final private String TAG = "BookActivity";
    private ImageView bookImage, bookRating;
    private TextView bookName, bookAuthorName, bookTvRating, bookDescription;
    private ArrayList<Books> books = new ArrayList<>();
    private int bookdId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Bundle arguments = getIntent().getExtras();
        bookdId = arguments.getInt("bookId");

        Log.e(TAG, String.valueOf(bookdId));

        MainActivity mainActivity = new MainActivity();
        books.addAll(mainActivity.getBooks());
//        Log.e(TAG, "sdasada --> " + );

        initView();
        setData();
    }

    private void initView() {
        bookImage = findViewById(R.id.bookImg);
        bookRating = findViewById(R.id.ratingImg);
        bookName = findViewById(R.id.bookName);
        bookAuthorName = findViewById(R.id.bookAutorName);
        bookTvRating = findViewById(R.id.tvRating);
        bookDescription = findViewById(R.id.bookDescription);
    }

    private void setData() {
        Log.e(TAG, "setData ga kirdi");
        Log.e(TAG, "book size =>" + books.size());
        for (int i = 0; i < books.size(); i++) {
            Log.e(TAG, "for ga kirdi");
            if (books.get(i).getBookId() == bookdId) {
                Log.e(TAG, "if ga kirdi");
                bookImage.setImageResource(books.get(i).getBookImage());
                bookRating.setImageResource(books.get(i).getImgRating());
                bookName.setText(books.get(i).getBookName());
                bookAuthorName.setText(books.get(i).getAuthorName());
                bookTvRating.setText(books.get(i).getTvRating());
                bookDescription.setText(books.get(i).getDescription());
            }
        }
    }
}