package com.chatapp.tests.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.socket.TextMessage;

@Controller
public class ChatController {



    @GetMapping("/")
    public String chat() throws Exception {
        return "chat";
    }

}