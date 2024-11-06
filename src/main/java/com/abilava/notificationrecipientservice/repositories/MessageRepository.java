package com.abilava.notificationrecipientservice.repositories;

import com.abilava.notificationrecipientservice.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> { }
