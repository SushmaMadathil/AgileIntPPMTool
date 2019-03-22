package io.agileintelligence.ppmtool.security;

public class SecurityConstants {

    public static final String SIGN_UP_URLS = "/api/users/**";
    public static final String H2_URL = "h2-console/**";
    public static final String SECRET ="SecretKeyToGenJWTs";
    public static final String TOKEN_PREFIX= "Bearer ";//has to be space here
    //because when we push it to the server it needs that space before the token id is added with it
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 200_000; // 2minutes
}
