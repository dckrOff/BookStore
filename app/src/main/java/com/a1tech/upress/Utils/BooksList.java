package com.a1tech.upress.Utils;

import android.util.Log;

import androidx.annotation.NonNull;

import com.a1tech.upress.FireBase.FireBaseBookList;
import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class BooksList {
    private final String TAG = "BookList";
    public ArrayList<Books> books = new ArrayList<>();

    public ArrayList<Books> getBooks() {
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequata.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequata.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequata.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequata.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        books.add(new Books("Fashionopolis", "Dana Thomas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequata.", "4.0", R.drawable.img1, R.drawable.ic_stars4, 1));
        books.add(new Books("Chanel", "Patrick Mauriès", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "3.0", R.drawable.img2, R.drawable.ic_stars3, 2));
        books.add(new Books("Calligraphy", "June & Lucy", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "5.0", R.drawable.img3, R.drawable.ic_stars5, 3));
        return books;
    }

    public void getDataFromFB() {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("books");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ArrayList<FireBaseBookList> list = dataSnapshot.getValue(FireBaseBookList.class);

                Log.e(TAG, "list: " + Objects.requireNonNull(list).size());
//                booksFb.addAll(dataSnapshot.getValue());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.e(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}
