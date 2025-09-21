package com.example.notecard.notecard;

public class Notecard {
    public String front;
    public String back;

    public Notecard(String front, String back){
        this.front = front;
        this.back = back;
    }

    public void setFront(String front){
        this.front = front;
    }
    public String getFront(){
        return this.front;
    }

    public void setBack(String back){
        this.back = back;
    }
    public String getBack(){
        return this.back;
    }
}
