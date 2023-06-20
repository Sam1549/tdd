package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {

    private static HashMap<String,String> phoneBook = new HashMap<>();
    public int add(String name, String number){
        phoneBook.put(name,number);
        return phoneBook.size();
    }
}
