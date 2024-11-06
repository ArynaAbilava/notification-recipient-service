package com.abilava.notificationrecipientservice.services;

import com.abilava.dtos.SendNotificationEvent;
import com.abilava.notificationrecipientservice.mappers.MessageMapper;
import com.abilava.notificationrecipientservice.repositories.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    @Override
    @Transactional
    public void processMessage(SendNotificationEvent event) {
        var message = messageMapper.toEntity(event);
        messageRepository.save(message);
    }

}
