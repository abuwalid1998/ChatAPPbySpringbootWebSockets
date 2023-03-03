package com.chatapp.tests.chatapp;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ChatMessage {
    private String content;
    private String sender;
    private LocalDateTime timestamp;
}