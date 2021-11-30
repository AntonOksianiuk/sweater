package com.example.sweater.repository;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    public List<Message> findByTag(String tag);
}

//Буду добавлять комменатрии
//Первый
//Второй
//Третийп