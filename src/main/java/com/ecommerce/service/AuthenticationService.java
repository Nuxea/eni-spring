package com.ecommerce.service;

import com.ecommerce.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
