package com.jnu.myfirstapplication.data;


import com.jnu.myfirstapplication.recyclerview.Book;

public class BookItem extends Book {
    private String title;
    private int headId;

    public BookItem(String title, int headId) {
        super();
        this.title = title;
        this.headId = headId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }
}
