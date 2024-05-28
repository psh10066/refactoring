package com.psh10066.refactoring._21_alternative_classes_with_different_interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderAlerts {

//    private AlertService alertService;
//
//    public void alertShipped(Order order) {
//        AlertMessage alertMessage = new AlertMessage();
//        alertMessage.setMessage(order.toString() + " is shipped");
//        alertMessage.setFor(order.getEmail());
//        alertService.add(alertMessage);
//    }

    private NotificationService notificationService;

    public void alertShipped(Order order) {
        Notification notification = Notification.newNotification(order.toString() + " is shipped")
            .receiver(order.getEmail());
        notificationService.sendNotification(notification);
    }
}
