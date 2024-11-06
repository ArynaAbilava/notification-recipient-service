package com.abilava.notificationrecipientservice.entities;

import com.abilava.dtos.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "message")
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Message extends BaseEntity {

    private String content;

}
