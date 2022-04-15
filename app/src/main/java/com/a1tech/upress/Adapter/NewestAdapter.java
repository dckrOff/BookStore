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


public class NewestAdapter extends RecyclerView.Adapter<NewestAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    private final ArrayList<Books> books;

    public NewestAdapter(Context context, ArrayList<Books> books) {
        this.inflater = LayoutInflater.from(context);
        this.books = books;
    }

    @Override
    public NewestAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_newest, parent, false);
        return new NewestAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewestAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Books books = this.books.get(position);
        holder.bookName.setText(books.getBookName());
        holder.bookAutorName.setText(books.getAuthorName());
        holder.tvBookRating.setText(books.getTvRating());
        holder.ivBookRating.setImageResource(books.getImgRating());
        holder.bookImage.setImageResource(books.getBookImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), books.getBookName(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(view.getContext(), BookActivity.class);
//                view.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return books.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView bookName, bookAutorName, tvBookRating;
        ImageView bookImage, ivBookRating;

        public MyViewHolder(View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.newBookName);
            bookAutorName = itemView.findViewById(R.id.newAuthorName);
            tvBookRating = itemView.findViewById(R.id.newTvRating);
            bookImage = itemView.findViewById(R.id.newBookImage);
            ivBookRating = itemView.findViewById(R.id.newIvRating);
        }
    }
}
