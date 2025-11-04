package com.hamid.FoodApp.menu.services;

import com.hamid.FoodApp.menu.dtos.MenuDTO;
import com.hamid.FoodApp.response.Response;

import java.util.List;

public interface MenuService {

    Response<MenuDTO> createMenu(MenuDTO menuDTO);
    Response<MenuDTO> updateMenu(MenuDTO menuDTO);
    Response<MenuDTO> getMenuById(Long id);
    Response<?> deleteMenu(Long id);
    Response<List<MenuDTO>> getMenus(Long categoryId, String search);

}
