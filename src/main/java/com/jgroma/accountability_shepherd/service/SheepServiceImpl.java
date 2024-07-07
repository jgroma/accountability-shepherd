package com.jgroma.accountability_shepherd.service;

import com.jgroma.accountability_shepherd.dao.SheepDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheepServiceImpl implements SheepService {
    @Autowired
    SheepDao sheepDao;
}
