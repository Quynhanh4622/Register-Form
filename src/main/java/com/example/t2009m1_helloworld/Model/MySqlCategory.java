package com.example.t2009m1_helloworld.Model;

import com.example.t2009m1_helloworld.constant.SqlConstant;
import com.example.t2009m1_helloworld.entity.Category;
import com.example.t2009m1_helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlCategory implements CategoryModel{
    @Override
    public boolean save(Category category) {
        try{
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_INSERT);
            preparedStatement.setString(1, category.getName());
//            preparedStatement.setString(2, category.getCreatedAt().toString());
//            preparedStatement.setString(3, category.getUpdatedAt().toString());
            if(category.getDeletedAt() != null) {
                preparedStatement.setString(10, category.getDeletedAt().toString());
            }else {
                preparedStatement.setString(10, null);
            }
            preparedStatement.setInt(11, category.getCreatedBy());
            preparedStatement.setInt(12, category.getUpdatedBy());
            preparedStatement.setInt(13, category.getDeletedBy());
            preparedStatement.setInt(14, category.getProductStatus().getValue());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e) {
//            e.printStackTrace();
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Category category) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }
}
