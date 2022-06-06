package com.example.t2009m1_helloworld.controller;

import com.example.t2009m1_helloworld.Model.MySqlProduct;
import com.example.t2009m1_helloworld.Model.ProductModel;
import com.example.t2009m1_helloworld.entity.Product;
import com.example.t2009m1_helloworld.entity.ShoppingCart;
import com.example.t2009m1_helloworld.util.ShoppingCartHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubCartServlet extends HttpServlet {
    private ProductModel productModel;

    public SubCartServlet(){
        this.productModel = new MySqlProduct();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer productId = Integer.parseInt(req.getParameter("productId"));
            Integer quantity = Integer.parseInt(req.getParameter("quantity"));
            Product product = productModel.findById(productId);
            if (product == null){
                resp.getWriter().println("Sản phẩm không được tìm thấy!");
                return;
            }
            if (quantity <=0){
                resp.getWriter().println("Số lượng không hợp lệ!");
                return;
            }
            ShoppingCartHelper shoppingCartHelper = new ShoppingCartHelper(req);
            ShoppingCart shoppingcart = shoppingCartHelper.getCart();
            shoppingcart.sub(product, quantity);
            shoppingCartHelper.saveCart(shoppingcart);
        }catch (Exception ex){
            resp.getWriter().println(ex.getMessage());
        }
    }
}