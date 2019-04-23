package com.github.nimeshabuddhika.common.dto.cardStore;

import java.io.Serializable;

public class AddCardSuccess implements Serializable {

    private String title;
    private String Content;
    private String eygNo;


    public String getEygNo() {
        return eygNo;
    }

    public AddCardSuccess() {
    }

    public AddCardSuccess(String title, String content, String eygNo) {
        this.title = title;
        Content = content;
        this.eygNo = eygNo;
    }

    public void setEygNo(String eygNo) {
        this.eygNo = eygNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "AddCardSuccess{" +
                "title='" + title + '\'' +
                ", Content='" + Content + '\'' +
                ", eygNo='" + eygNo + '\'' +
                '}';
    }
}
