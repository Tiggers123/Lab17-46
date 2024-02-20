package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int onlineUsersCount;
    public static int Count;
    public static int addUser(){
        return ++Count;
    }
    public static int deleteUser(){
        return --Count;
    }
}
