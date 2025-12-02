package com.java.spr.service;

import com.java.spr.model.Resource;
import com.java.spr.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> findAll() {
        return resourceRepository.findAll();
    }

    public String addResource(Resource resource){
        resourceRepository.save(resource);
        return "Resource Added...";
    }
    public Resource findByResourceName(String resourceName) {
        return resourceRepository.findByResourceName(resourceName);
    }
    public Resource findById(String id) {
        return resourceRepository.findById(id).get();
    }
}
