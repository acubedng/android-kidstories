package com.project.android_kidstories.db;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;

public class DbUserClass {
    int dbUserId;
    int id;
    byte[] userImageByteArray;
    Bitmap userImageBitmap;

    String firstName,lastName;

    public byte[] getUserImageByteArray(){
        return userImageByteArray;
    }

    public void setUserImageByteArray(byte[] userImageByteArray){
        this.userImageByteArray = userImageByteArray;
    }

    public Bitmap getUserImageBitmap(){
        return userImageBitmap;
    }

    public void setUserImageBitmap(Bitmap userImageBitmap){
        this.userImageBitmap = userImageBitmap;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getDbUserId(){
        return dbUserId;
    }

    public void setDbUserId(int userId){
        this.dbUserId = userId;
    }

    public void setUserId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
