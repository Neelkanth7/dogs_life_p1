package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.db.grad.javaapi.model.Dog;

public interface DogRepo extends JpaRepository <Dog, Integer> {

}
