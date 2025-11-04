package com.hamid.FoodApp.category.services;

import com.hamid.FoodApp.category.dtos.CategoryDTO;
import com.hamid.FoodApp.response.Response;

import java.util.List;

public interface CategoryService {

    Response<CategoryDTO> addCategory(CategoryDTO categoryDTO);

    Response<CategoryDTO> updateCategory(CategoryDTO categoryDTO);

    Response<CategoryDTO> getCategoryById(Long id);

    Response<List<CategoryDTO>> getAllCategories();

    Response<?> deleteCategory(Long id);
}
