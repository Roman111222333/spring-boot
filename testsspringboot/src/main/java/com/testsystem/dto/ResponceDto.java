package com.testsystem.dto;

/**
 * Created by roman.ali on 8/25/2022.
 */

/**
 * we have only expose
 * id
 * first name
 * and email
 * that why we only inatilze id, firt name and email and get and set these variables.
 */
public class ResponceDto {
    int userId;
    int id;
    String title;
    String body;

    public ResponceDto(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public ResponceDto() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}