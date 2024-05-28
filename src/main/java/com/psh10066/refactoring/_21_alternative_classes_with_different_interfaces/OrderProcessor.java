package com.psh10066.refactoring._21_alternative_classes_with_different_interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderProcessor {

//    private EmailService emailService;
//
//    public void notifyShipping(Shipping shipping) {
//        EmailMessage emailMessage = new EmailMessage();
//        emailMessage.setTitle(shipping.getOrder() + " is shipped");
//        emailMessage.setTo(shipping.getEmail());
//        emailMessage.setFrom("no-reply@whiteship.com");
//        emailService.sendEmail(emailMessage);
//    }

    private NotificationService notificationService;

    public void notifyShipping(Shipping shipping) {
        Notification notification = Notification.newNotification(shipping.getOrder() + " is shipped")
            .receiver(shipping.getEmail())
            .sender("no-reply@test.com");
        notificationService.sendNotification(notification);
    }
}
