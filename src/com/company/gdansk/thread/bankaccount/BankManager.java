package com.company.gdansk.thread.bankaccount;

public class BankManager {

    public static void main(String[] args) throws InterruptedException {
        do {
            Account account1 = new Account();
            Account account2 = new Account();

            Runnable r = getRunnable(account1, account2);
            Runnable r2 = getRunnable2(account1, account2);

            Thread thread = new Thread(r);
            thread.start();
            Thread thread1 = new Thread(r);
            thread1.start();

            thread.join();
            thread1.join();

            if (account1.getValue() != 0 || account2.getValue() != 2) {
                System.out.println(account1.getValue());
                System.out.println(account2.getValue());

            }
        } while (true);
    }

    private static Runnable getRunnable(Account a1, Account a2) {
        return new Runnable() {
            @Override
            public void run() {
                transfer(a1, a2);
            }
        };
    }

    private synchronized static void transfer(Account a1, Account a2) {
        if (a1.getValue() > 0) {
            a1.withdraw();
            a2.add();
        }
    }

    private static Runnable getRunnable2(Account a1, Account a2) {
        return new Runnable() {
            @Override
            public void run() {
                if (a1.getValue() > 0) {
                    a1.withdraw();
                    a2.add();
                }
            }
        };
    }


}
