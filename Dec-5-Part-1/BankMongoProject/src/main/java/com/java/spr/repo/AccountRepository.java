package com.java.spr.repo;

import com.java.spr.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
    Account findByAccountNo(int accountNo);
    Account findFirstByOrderByAccountNoDesc();
    void deleteByAccountNo(int accountNo);
}
