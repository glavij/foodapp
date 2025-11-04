package com.hamid.FoodApp.auth_users.services;

import com.hamid.FoodApp.auth_users.dtos.LoginRequest;
import com.hamid.FoodApp.auth_users.dtos.LoginResponse;
import com.hamid.FoodApp.auth_users.dtos.RegistrationRequest;
import com.hamid.FoodApp.response.Response;

public interface AuthService {
    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);
}
