package com.example.demo.service;

import com.example.demo.model.Template;
import com.example.demo.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {
    private TemplateRepository templateRepository;

    @Autowired
    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public Iterable<Template> findAll() {
        return templateRepository.findAll();
    }
}
