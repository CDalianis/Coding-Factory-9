package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO.IAccountDAO {

    private final List<Account> accounts = new ArrayList<>();
    // einai o apothikeftikos mas xwros aftosgia ti sigekrimeni periptwsi, tha m
    // mporouse na nai kai mia vasi dedomenwn

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);

        if (index == -1 ) {
            accounts.add(account);
            return account;
        }

        //An iparxei idi to account
        accounts.set(index, account);
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban (String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
        //return new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public boolean isAccountExists (String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }

    @Override
    public long count() {
        return accounts.size();
    }
}
