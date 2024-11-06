package com.abilava.notificationrecipientservice.consumers;

import com.abilava.dtos.SendNotificationEvent;
import com.abilava.notificationrecipientservice.services.NotificationService;
import com.abilava.utils.LoggerUtil;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationsConsumer {

    private final NotificationService notificationService;

    @KafkaListener(
            topics = "${topics.inbound.send-notification}",
            groupId = "${topics.consumer-groups.notifications}")
    public void processMessage(final SendNotificationEvent event) {
        LoggerUtil.info("Receive event");
        notificationService.processMessage(event);
    }

}
