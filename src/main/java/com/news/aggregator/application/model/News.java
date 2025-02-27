package com.news.aggregator.application.model;



public class News {

    private String title;
    private String authorName;
    private String newsDesc;
    private String newsContent;

    public News() {
    }

    public News(String title, String authorName, String newsDesc, String newsContent) {
        this.title = title;
        this.authorName = authorName;
        this.newsDesc = newsDesc;
        this.newsContent = newsContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
