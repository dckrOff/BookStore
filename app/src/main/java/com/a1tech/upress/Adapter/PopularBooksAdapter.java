package com.a1tech.upress.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.a1tech.upress.Activity.BookActivity;
import com.a1tech.upress.Model.Books;
import com.a1tech.upress.R;

import java.util.ArrayList;


public class PopularBooksAdapter extends RecyclerView.Adapter<PopularBooksAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    private final ArrayList<Books> books;

    public PopularBooksAdapter(Context context, ArrayList<Books> books) {
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_popular_books, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Books books = this.books.get(position);
        holder.bookName.setText(books.getBookName());
        holder.bookAutorName.setText(books.getAuthorName());
        holder.bookImage.setImageResource(books.getBookImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BookActivity.class);
                intent.putExtra("bookId", books.getBookId());
                view.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return books.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView bookName, bookAutorName;
        ImageView bookImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.popBookName);
            bookAutorName = itemView.findViewById(R.id.popAuthorName);
            bookImage = itemView.findViewById(R.id.popBookImage);
        }
    }
}
