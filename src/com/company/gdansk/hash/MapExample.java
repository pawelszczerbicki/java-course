package com.company.gdansk.hash;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Long, BankUser> userIdToUser = new HashMap<>();

        userIdToUser.put(1l, new BankUser());
        userIdToUser.put(2l, new BankUser());
        userIdToUser.put(3l, new BankUser());
        userIdToUser.put(3l, new BankUser());
        userIdToUser.put(3l, new BankUser());

        System.out.println(userIdToUser.size());

        BankUser bankUser = userIdToUser.get(3l);

        //petla po wszystkioch kluczach
        for (Long aLong : userIdToUser.keySet()) {
            userIdToUser.get(aLong);
        }

        for (BankUser user : userIdToUser.values()) {
            System.out.println(user);
        }

        for (Map.Entry<Long, BankUser> oneEntry : userIdToUser.entrySet()) {
             oneEntry.getKey();
             oneEntry.getValue();
        }


    }
}
