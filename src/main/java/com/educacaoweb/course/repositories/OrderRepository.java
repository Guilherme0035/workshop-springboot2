package com.educacaoweb.course.repositories;

import com.educacaoweb.course.entites.Order;
import com.educacaoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {



}
