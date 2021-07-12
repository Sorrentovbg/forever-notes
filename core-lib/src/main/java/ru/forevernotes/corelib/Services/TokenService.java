package ru.forevernotes.corelib.Services;

import ru.forevernotes.corelib.interfaces.ITokenService;
import ru.forevernotes.corelib.models.UserInfo;

public class TokenService implements ITokenService {

    private final String JWT_SECRET = "3b2648762a13d3f6be076edb7f70fa391e83049e1eaef30448eecc4effd31e74f7eaa092196868d677986ab5f12afd579a894d0daa0716da1d72c443a539976e";

    @Override
    public String generateToken(UserInfo user) {
        return null;
    }

    @Override
    public UserInfo parseToken(String token) {
        return null;
    }
}
