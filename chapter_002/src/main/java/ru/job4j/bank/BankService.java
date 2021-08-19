package ru.job4j.bank;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User added = findByPassport(passport);
        if (added != null) {
            List<Account> accounts = users.get(added);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(
            String srcPassport,
            String srcRequisite,
            String destPassport,
            String destRequisite,
            double amount) {
            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                return true;
            }
            return false;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}