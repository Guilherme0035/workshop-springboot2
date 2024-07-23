package com.educacaoweb.course.repositories;

import com.educacaoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Long> {



}
