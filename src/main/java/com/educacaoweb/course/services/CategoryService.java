package com.educacaoweb.course.services;

import com.educacaoweb.course.entites.Category;
import com.educacaoweb.course.entites.Order;
import com.educacaoweb.course.repositories.CategoryRepository;
import com.educacaoweb.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll(){
        return repository.findAll();

    }

    public Category findById(Long id){
       Optional<Category> obj = repository.findById(id);
        return obj.get();
    }



}
