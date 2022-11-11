package com.example.springbootdemo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.model.Tutorial;

//create repository to interact with Tutorials from the database;.


public interface  TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}

