package com.java.spr.service;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository repository;

    public List<Employ> findAll() {
        return repository.findAll();
    }
}
