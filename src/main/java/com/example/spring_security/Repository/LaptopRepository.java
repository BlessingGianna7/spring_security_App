package com.example.spring_security.Repository;

import com.example.spring_security.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
