//Program to define AdminService class
package com.tns.onlineshopping.services;

import java.util.ArrayList;

public class AdminService {

    private List<Admin> adminList = new ArrayList<>();

    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public List<Admin> getAdmins() {
        return adminList;
    }

}
