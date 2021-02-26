package com.cos.testinsta;

// lombok이 갑자기 적용이 안돼서 이렇게 적었습니다.

public class MainModel {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MainModel(String title) {
        this.title = title;
    }
}
