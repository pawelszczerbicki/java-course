package com.company.gdansk.hash;

import java.util.HashMap;
import java.util.Map;

public class MapExcercise {
    public static void main(String[] args) {
        Map<Long, BankUser> idToUser = new HashMap<>();
        idToUser.put(1l, new BankUser("kowalski"));
        idToUser.put(2l, new BankUser("test"));
        idToUser.put(2l, new BankUser("duplicate"));

        for (Long id : idToUser.keySet()) {
            System.out.println("id: "+ id + ", user: " + idToUser.get(id));
        }

        System.out.println(idToUser.containsKey(1l));
        System.out.println(idToUser.containsKey(10l));

        Map<BankUser, Long> userToId = new HashMap<>();
        BankUser jan = new BankUser("Jan");
        BankUser carl = new BankUser("carl");
        BankUser carl2 = new BankUser("carl");

        userToId.put(jan, 1l);
        userToId.put(carl, 1l);
        userToId.put(carl2, 1l);

        System.out.println(userToId.size());
    }
}
