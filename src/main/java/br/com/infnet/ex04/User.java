package br.com.infnet.ex04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Address> addresses = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
