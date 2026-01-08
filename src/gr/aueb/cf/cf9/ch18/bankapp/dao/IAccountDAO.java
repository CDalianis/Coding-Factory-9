package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

public class IAccountDAO {

    public interface IAccountDAO {

        //ta vasika CRUD pou prepei na parexontai

        Account saveOrUpdate (Account account);
        void remove (String iban);
        Optional<Account> findByIban (String iban);
        List<Account> getAllAccounts();
        long count();


        //Queries
        boolean isAccountExists(String iban);
    }
}
