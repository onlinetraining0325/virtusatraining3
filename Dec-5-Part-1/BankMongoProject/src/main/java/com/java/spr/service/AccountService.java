package com.java.spr.service;

import com.java.spr.model.Account;
import com.java.spr.model.Trans;
import com.java.spr.repo.AccountRepository;
import com.java.spr.repo.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransRepository transRepository;

    public List<Account> findAll(){
        return  accountRepository.findAll();
    }
    public Account getMaxAccountNo() {
        return accountRepository.findFirstByOrderByAccountNoDesc();
    }

    public Account findByAccountNo(int accountNo){
        return accountRepository.findByAccountNo(accountNo);
    }

    public String deleteByAccountNo(int accountNo) {
        accountRepository.deleteByAccountNo(accountNo);
        return "Account Deleted...";
    }
    public String createAccount(Account account){
        account.setStatus("ACTIVE");

        account.setDateOfOpen(new Date());   // ✔ correct
        Account maxAccountNo = getMaxAccountNo();
        int accno = maxAccountNo.getAccountNo();
        accno++;
        account.setAccountNo(accno);
        accountRepository.save(account);
        return "Account Created Successfully...";
    }

    public List<Trans> showAllTrans(int accountNo) {
        return transRepository.findByAccountNo(accountNo);
    }

    public String withdrawAccount(int accountNo, double withDrawAmount) {
        Account account = findByAccountNo(accountNo);
        double amount = account.getAmount();
        if (amount - withDrawAmount < 0) {
            return "Insufficient Funds...";
        }
        account.setAmount(account.getAmount() - withDrawAmount);
        accountRepository.save(account);
        Trans trans = new Trans();
        trans.setAccountNo(account.getAccountNo());
        trans.setTranAmount(withDrawAmount);
        trans.setTranType("WITHDRAW");
        transRepository.save(trans);
        return "Account Withdrawn Successfully...";
    }

    public String depositAmount(int accountNo, double depositAmount) {
        Account account = findByAccountNo(accountNo);
        account.setAmount(account.getAmount()+depositAmount);
        accountRepository.save(account);
        Trans trans = new Trans();
        trans.setAccountNo(account.getAccountNo());
        trans.setTranAmount(depositAmount);
        trans.setTranType("DEPOSIT");
        transRepository.save(trans);
        return "Account Deposited Successfully...";
    }
}
