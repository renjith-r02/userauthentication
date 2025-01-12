package com.dzone.demo.userauthentication.notification.domain;

import com.dzone.demo.userauthentication.common.events.UserRegisteredEvent;
import org.springframework.modulith.NamedInterface;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@NamedInterface("NotificationService")
@Service
public class NotificationService {

    @ApplicationModuleListener
    public void handle(UserRegisteredEvent event) {

        System.out.println("User registered event received:");
        System.out.println("Email: " + event.getEmail());
        System.out.println("First Name: " + event.getFirstName());
        System.out.println("Last Name: " + event.getLastName());
    }
}
