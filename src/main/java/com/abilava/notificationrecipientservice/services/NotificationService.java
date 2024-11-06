package com.abilava.notificationrecipientservice.services;


import com.abilava.dtos.SendNotificationEvent;

public interface NotificationService {

    void processMessage(SendNotificationEvent event);

}
