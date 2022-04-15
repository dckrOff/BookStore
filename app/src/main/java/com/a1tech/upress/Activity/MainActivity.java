package com.a1tech.upress.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.a1tech.upress.Adapter.NewestAdapter;
import com.a1tech.upress.Adapter.PopularBooksAdapter;
import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Books> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBooks();
        transparentStatusBar();
        recyclerViewPopularBooks();
        recyclerViewNewest();
    }

    private void recyclerViewPopularBooks() {
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerPopular);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        PopularBooksAdapter popularBooksAdapter = new PopularBooksAdapter(this, books);
        recyclerView.setAdapter(popularBooksAdapter); // set the Adapter to RecyclerView
        recyclerView.setNestedScrollingEnabled(false);
    }

    private void recyclerViewNewest() {
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerNewest);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        NewestAdapter newestAdapter = new NewestAdapter(this, books);
        recyclerView.setAdapter(newestAdapter); // set the Adapter to RecyclerView

        recyclerView.setNestedScrollingEnabled(false);
    }

    private void transparentStatusBar() {
        // In Activity's onCreate() for instance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    private void addBooks() {
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));

    }

    public ArrayList<Books> getBooks() {
        return books;
    }
}