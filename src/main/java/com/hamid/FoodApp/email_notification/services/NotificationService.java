package com.hamid.FoodApp.email_notification.services;


import com.hamid.FoodApp.email_notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO);
}
