package com.a1tech.upress.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;
import com.a1tech.upress.Utils.BooksList;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    final private String TAG = "BookActivity";
    private ImageView bookImage, bookRating, backBtn;
    private TextView bookName, bookAuthorName, bookTvRating, bookDescription;
    private ArrayList<Books> books = new ArrayList<>();
    private int bookdId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initView();
        setData();
        transparentStatusBar();
    }

    private void initView() {
        bookImage = findViewById(R.id.bookImg);
        bookRating = findViewById(R.id.ratingImg);
        bookName = findViewById(R.id.bookName);
        bookAuthorName = findViewById(R.id.bookAutorName);
        bookTvRating = findViewById(R.id.tvRating);
        bookDescription = findViewById(R.id.bookDescription);
        backBtn = findViewById(R.id.backBtn);

        BooksList booksList = new BooksList();
        Bundle arguments = getIntent().getExtras();
        bookdId = arguments.getInt("bookId");
        books.addAll(booksList.getBooks());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setData() {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookdId) {
                bookImage.setImageResource(books.get(i).getBookImage());
                bookRating.setImageResource(books.get(i).getImgRating());
                bookName.setText(books.get(i).getBookName());
                bookAuthorName.setText(books.get(i).getAuthorName());
                bookTvRating.setText(books.get(i).getTvRating());
                bookDescription.setText(books.get(i).getDescription());
            }
        }
    }

    private void transparentStatusBar() {
        // In Activity's onCreate() for instance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}