package com.example.t2009m1_helloworld.controller;

import com.example.t2009m1_helloworld.Model.CategoryModel;
import com.example.t2009m1_helloworld.Model.MySqlCategory;
import com.example.t2009m1_helloworld.entity.Category;
import com.example.t2009m1_helloworld.entity.CategoryStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategory();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int categoryId = Integer.parseInt(req.getParameter("id"));
        Category category = categoryModel.findById(categoryId);
        category.setStatus(CategoryStatus.DELETED);
        category.setDeletedAt(LocalDateTime.now());
        if(categoryModel.update(categoryId, category)) {
            resp.sendRedirect("admin/category/list.jsp");
        }
    }
}
