package com.vatrascell.nezrspring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAppUserDto {
    private String username;
    private String password;
}
