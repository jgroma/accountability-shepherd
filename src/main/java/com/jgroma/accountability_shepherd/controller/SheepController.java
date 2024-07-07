package com.jgroma.accountability_shepherd.controller;


import com.jgroma.accountability_shepherd.service.SheepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sheep")
@CrossOrigin
public class SheepController {
    @Autowired
    SheepService sheepService;
}
