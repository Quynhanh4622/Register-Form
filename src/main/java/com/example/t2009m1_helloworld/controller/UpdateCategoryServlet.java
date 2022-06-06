package com.example.t2009m1_helloworld.controller;

import com.example.t2009m1_helloworld.Model.CategoryModel;
import com.example.t2009m1_helloworld.Model.MySqlCategory;
import com.example.t2009m1_helloworld.entity.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category  = categoryModel.findById(Integer.parseInt(req.getParameter("id")));
        if(category == null) {
            category = new Category();
        }
        req.setAttribute("product", category);
        req.getRequestDispatcher("Admin/category/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
