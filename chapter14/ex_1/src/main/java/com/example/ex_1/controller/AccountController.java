package com.example.ex_1.controller;

import com.example.ex_1.model.Account;
import com.example.ex_1.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final TransferService transferService;

    @Autowired
    public AccountController(
            TransferService transferService
    ) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(
            @RequestBody TransferRequest request
    ) {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount()
        );
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountByName(name);
        }
    }

}
