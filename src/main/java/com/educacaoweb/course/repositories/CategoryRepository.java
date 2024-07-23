package com.educacaoweb.course.repositories;

import com.educacaoweb.course.entites.Category;
import com.educacaoweb.course.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {



}
