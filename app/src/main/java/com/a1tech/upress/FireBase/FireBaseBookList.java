
package com.a1tech.upress.FireBase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FireBaseBookList extends ArrayList<FireBaseBookList> implements Serializable {

    @SerializedName("books")
    @Expose
    private List<FireBaseBooks> fireBaseBooks = null;
    private final static long serialVersionUID = -5103183398747733063L;

    /**
     * No args constructor for use in serialization
     */
    public FireBaseBookList() {
    }

    /**
     * @param fireBaseBooks
     */
    public FireBaseBookList(List<FireBaseBooks> fireBaseBooks) {
        super();
        this.fireBaseBooks = fireBaseBooks;
    }

    public List<FireBaseBooks> getBooks() {
        return fireBaseBooks;
    }

    public void setBooks(List<FireBaseBooks> fireBaseBooks) {
        this.fireBaseBooks = fireBaseBooks;
    }

}
