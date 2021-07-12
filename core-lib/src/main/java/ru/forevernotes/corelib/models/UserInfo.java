package ru.forevernotes.corelib.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo{

    private Long userId;

    private String userLogin;

    private String userPassword;

    private String userName;

    private char gender;

    private String userEmail;

    private String role;
}
