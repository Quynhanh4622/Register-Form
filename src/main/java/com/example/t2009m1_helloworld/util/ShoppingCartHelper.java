package com.example.t2009m1_helloworld.util;

import com.example.t2009m1_helloworld.entity.ShoppingCart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ShoppingCartHelper {
    private static final String SHOPPING_CART_SESSTIOM_NAME = "SHOPPING_CART";
    HttpSession session;

    public ShoppingCartHelper(HttpServletRequest request){this.session = request.getSession();}

    public ShoppingCart getCart(){
        ShoppingCart shoppingcart = (ShoppingCart) session.getAttribute(SHOPPING_CART_SESSTIOM_NAME);
        if (shoppingcart == null){
            shoppingcart = new ShoppingCart();
        }
        return shoppingcart;
    }
    public void saveCart(ShoppingCart shoppingcart){
        session.setAttribute(SHOPPING_CART_SESSTIOM_NAME,shoppingcart);
    }
}
