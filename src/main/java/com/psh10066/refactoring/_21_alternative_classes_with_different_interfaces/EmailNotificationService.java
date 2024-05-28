package com.psh10066.refactoring._21_alternative_classes_with_different_interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailNotificationService implements NotificationService {

    private EmailService emailService;

    @Override
    public void sendNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        emailService.sendEmail(emailMessage);
    }
}
