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
import com.a1tech.upress.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList<String> popularNames = new ArrayList<>(Arrays.asList("Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy"));
    ArrayList<Integer> popularImages = new ArrayList<>(Arrays.asList(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3));

    ArrayList<String> newestNames = new ArrayList<>(Arrays.asList("Yves Saint Laurent", "The Book of Signs", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel", "Calligraphy", "Fashionopolis", "Chanel"));
    ArrayList<Integer> newestImages = new ArrayList<>(Arrays.asList(R.drawable.img4, R.drawable.img5, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img1, R.drawable.img2));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        PopularBooksAdapter popularBooksAdapter = new PopularBooksAdapter(MainActivity.this, popularNames, popularImages);
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
        NewestAdapter newestAdapter = new NewestAdapter(MainActivity.this, newestNames, newestImages);
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
}