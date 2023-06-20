package org.example;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PhoneBook {

    private static HashMap<String, String> phoneBook = new HashMap<>();

    public int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey().toString();
            }
        }

        return "Нет контакта";
    }

    public String findByName(String name) {
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue().toString();
            }
        }
        return "Нет контакта";
    }

    public Map<String, String> printAllNames() {
        Map<String, String> treeMap = phoneBook.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue,
                        TreeMap::new));
        treeMap.entrySet().forEach(System.out::println);

        return treeMap;
    }


}
