package com.example.t2009m1_helloworld.controller;

import com.example.t2009m1_helloworld.Model.CategoryModel;
import com.example.t2009m1_helloworld.Model.MySqlCategory;
import com.example.t2009m1_helloworld.entity.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> productList = categoryModel.findAll();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("admin/category/list.jsp").forward(req, resp);
    }
}
