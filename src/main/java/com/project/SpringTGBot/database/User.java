package com.project.SpringTGBot.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tg_data")
public class User {

    @Id
    private Long id; //BigInteger
    private String name; //text
    private int msg_numb; //Integer
}
