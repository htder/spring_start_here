package com.example.ex_1.services;

import com.example.ex_1.model.Account;
import com.example.ex_1.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    @Autowired
    public TransferService(
            AccountRepository accountRepository
    ) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount
    ) throws AccountNotFoundException {
        Account sender = accountRepository.findById(idSender)
                .orElseThrow(AccountNotFoundException::new);

        Account receiver = accountRepository.findById(idReceiver)
                .orElseThrow(AccountNotFoundException::new);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        accountRepository.changeAmount(idSender, senderNewAmount);
        accountRepository.changeAmount(idReceiver, receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountByName(String name) {
        return accountRepository.findAccountsByName(name);
    }

}
