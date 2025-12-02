package com.java.spr.controller;

import com.java.spr.model.Resource;
import com.java.spr.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @PostMapping(value="/addresource")
    public String addResource(@RequestBody Resource resource){
        return resourceService.addResource(resource);
    }

    @GetMapping(value="/show")
    public List<Resource> show(){
        return resourceService.findAll();
    }

    @GetMapping(value="/search/{resourceName}")
    public Resource findByResourceName(@PathVariable("resourceName") String resourceName){
        return resourceService.findByResourceName(resourceName);
    }
}
