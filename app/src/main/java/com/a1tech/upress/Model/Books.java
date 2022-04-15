package com.a1tech.upress.Model;

public class Books {

    private String bookName;
    private String authorName;
    private String description;
    private String tvRating;
    private Integer bookImage;
    private Integer imgRating;
    private int bookId;

    public Books(String bookName, String authorName, String description, String tvRating, Integer bookImage, Integer imgRating, int bookId) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.tvRating = tvRating;
        this.description = description;
        this.bookImage = bookImage;
        this.imgRating = imgRating;
        this.bookId = bookId;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTvRating() {
        return tvRating;
    }

    public void setTvRating(String tvRating) {
        this.tvRating = tvRating;
    }

    public Integer getBookImage() {
        return bookImage;
    }

    public void setBookImage(Integer bookImage) {
        this.bookImage = bookImage;
    }

    public Integer getImgRating() {
        return imgRating;
    }

    public void setImgRating(Integer imgRating) {
        this.imgRating = imgRating;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
