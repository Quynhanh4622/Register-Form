package com.example.t2009m1_helloworld.Model;

import com.example.t2009m1_helloworld.entity.Account;
import com.example.t2009m1_helloworld.entity.Category;

import java.util.List;

public interface AccountModel {
    boolean create(Account account);
    boolean update(int id, Account account);
    boolean delete(int id);
    Account findById(int id);
    List<Account> findAll();
}
