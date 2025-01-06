package com.Firebase.controller;


import com.Firebase.entity.NotificationMessage;
import com.Firebase.service.FirebaseMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private FirebaseMessagingService firebaseMessagingService;

    @PostMapping()
    public String sendNotificationByToken(@RequestBody NotificationMessage notificationMessage){
        return firebaseMessagingService.sendNotificationByToken(notificationMessage);
    }

}
