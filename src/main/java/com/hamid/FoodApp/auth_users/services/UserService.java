package com.hamid.FoodApp.auth_users.services;

import com.hamid.FoodApp.auth_users.dtos.UserDTO;
import com.hamid.FoodApp.auth_users.entity.User;
import com.hamid.FoodApp.response.Response;

import java.util.List;

public interface UserService {


    User getCurrentLoggedInUser();

    Response<List<UserDTO>> getAllUsers();

    Response<UserDTO> getOwnAccountDetails();

    Response<?> updateOwnAccount(UserDTO userDTO);

    Response<?> deactivateOwnAccount();

}
