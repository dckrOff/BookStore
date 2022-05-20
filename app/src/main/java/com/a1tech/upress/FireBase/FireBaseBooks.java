
package com.a1tech.upress.FireBase;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FireBaseBooks implements Serializable
{

    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("book_name")
    @Expose
    private String bookName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    private final static long serialVersionUID = 5074846639588657340L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FireBaseBooks() {
    }

    /**
     * 
     * @param img
     * @param authorName
     * @param rating
     * @param description
     * @param bookName
     */
    public FireBaseBooks(String authorName, String bookName, String description, String img, Integer rating) {
        super();
        this.authorName = authorName;
        this.bookName = bookName;
        this.description = description;
        this.img = img;
        this.rating = rating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
