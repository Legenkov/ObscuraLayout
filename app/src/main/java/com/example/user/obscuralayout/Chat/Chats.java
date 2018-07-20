package com.example.user.obscuralayout.Chat;

/**
 * Created by User on 10.07.2018.
 */

public class Chats {
    String name;

    String lastMessage;

    String theme;

    String photoUrl;

    String lastMessageTime;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }



    public void setLastMessage(String lastMessage){
        this.lastMessage=lastMessage;
    }

    public String getLastMessage(){
        return  lastMessage;
    }


    public  void setTheme (String theme){
        this.theme = theme;
    }

    public  String getTheme(){
        return theme;
    }


    public  void setPhotoUrl (String photoUrl){
        this.photoUrl = photoUrl;
    }

    public  String getPhotoUrl(){
        return photoUrl;
    }


    public  void setLastMessageTime (String lastMessageTime){
        this.lastMessageTime = lastMessageTime;
    }

    public  String getLastMessageTime(){
        return lastMessageTime;
    }


    public Chats(String name, String lastMessage, String theme, String photoUrl, String lastMessageTime){
        this.lastMessage = lastMessage;
        this.name = name;
        this.theme=theme;
        this.photoUrl=photoUrl;
        this.lastMessageTime=lastMessageTime;
    }
}
