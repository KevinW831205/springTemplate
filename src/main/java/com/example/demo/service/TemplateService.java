package com.example.demo.service;

import com.example.demo.model.Template;
import com.example.demo.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Template> findById(Long id){
        return templateRepository.findById(id);
    }

    public Template create(Template template){
        return templateRepository.save(template);
    }
}
