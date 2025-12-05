package com.java.spr.controller;

import com.java.spr.model.Account;
import com.java.spr.model.Trans;
import com.java.spr.service.AccountService;
import com.java.spr.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransService transService;

    @GetMapping(value="/showAccount")
    public List<Account> showAccount(){
        System.out.println(accountService.findAll().size());
        return  accountService.findAll();
    }

    @GetMapping(value="/showTrans/{accountNo}")
    public List<Trans> showTrans(@PathVariable int accountNo){
       return accountService.showAllTrans(accountNo);
    }

    @PostMapping(value="/deposit/{accountNo}/{depositAmount}")
    public String deposit(@PathVariable int accountNo, @PathVariable double depositAmount){
        return accountService.depositAmount(accountNo,depositAmount);
    }

    @PostMapping(value="/withdraw/{accountNo}/{withdrawAmount}")
    public String withdraw(@PathVariable int accountNo, @PathVariable double withdrawAmount){
        return accountService.withdrawAccount(accountNo,withdrawAmount);
    }

    @DeleteMapping(value="/deleteAccount/{accountNo}")
    public String deleteAccount(@PathVariable int accountNo) {
        return accountService.deleteByAccountNo(accountNo);
    }

    @PostMapping(value="/addAccount")
    public String createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @GetMapping(value="/search/{accno}")
    public Account searchAccount(@PathVariable int accno){
        return accountService.findByAccountNo(accno);
    }
}
