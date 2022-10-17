package com.example.apispringrepository01.repositoris;

import com.example.apispringrepository01.entitis.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {
}
