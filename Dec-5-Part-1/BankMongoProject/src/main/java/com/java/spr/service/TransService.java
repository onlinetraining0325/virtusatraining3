package com.java.spr.service;

import com.java.spr.model.Trans;
import com.java.spr.repo.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransService {

    @Autowired
    private TransRepository transRepository;

    public void addHistory(Trans trans){
        transRepository.save(trans);
    }
}
