package com.educacaoweb.course.repositories;

import com.educacaoweb.course.entites.OrderItem;
import com.educacaoweb.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {



}