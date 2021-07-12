package ru.forevernotes.corelib.interfaces;

import ru.forevernotes.corelib.models.UserInfo;

public interface ITokenService {

    String generateToken(UserInfo user);

    UserInfo parseToken(String token);
}
