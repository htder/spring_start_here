package com.example.ex_2.controllers;

import com.example.ex_2.models.Purchase;
import com.example.ex_2.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseController(
            PurchaseRepository purchaseRepository
    ) {
        this.purchaseRepository = purchaseRepository;
    };

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases() {
        return purchaseRepository.findAllPurchases();
    }

}
