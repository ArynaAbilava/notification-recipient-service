package com.abilava.notificationrecipientservice.mappers;

import com.abilava.dtos.SendNotificationEvent;
import com.abilava.notificationrecipientservice.entities.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = MessageMapper.class)
public interface MessageMapper {

    Message toEntity(SendNotificationEvent event);

}
