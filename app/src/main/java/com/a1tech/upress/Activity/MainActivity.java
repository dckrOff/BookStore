package com.a1tech.upress.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.a1tech.upress.Adapter.NewestAdapter;
import com.a1tech.upress.Adapter.PopularBooksAdapter;
import com.a1tech.upress.FireBase.FireBaseBookList;
import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;
import com.a1tech.upress.Utils.BooksList;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final private String TAG = "MainActivity";
    private ArrayList<Books> books = new ArrayList<>();
    private PopularBooksAdapter popularBooksAdapter;
    private NewestAdapter newestAdapter;
    private BooksList booksList = new BooksList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        setAdapterPopBooks();
        setAdapterNewBooks();
        transparentStatusBar();

//        booksList.getDataFromFB();

        Button btn = findViewById(R.id.btnCrash);

        FirebaseApp.initializeApp(getApplicationContext());
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                throw new NullPointerException("Test Crash"); // Force a crash
            }
        });
    }

    private void setData() {
        books.addAll(booksList.getBooks());
    }

    private void setAdapterPopBooks() {
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerPopular);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        popularBooksAdapter = new PopularBooksAdapter(this, books);
        recyclerView.setAdapter(popularBooksAdapter); // set the Adapter to RecyclerView
        recyclerView.setNestedScrollingEnabled(false);
    }

    private void setAdapterNewBooks() {
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerNewest);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        newestAdapter = new NewestAdapter(this, books);
        recyclerView.setAdapter(newestAdapter); // set the Adapter to RecyclerView
        recyclerView.setNestedScrollingEnabled(false);
    }

    private void transparentStatusBar() {
        // In Activity's onCreate() for instance
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

}