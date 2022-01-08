package com.serhiihonchar.customerdemo.repository;
/**
 * Repository interface for {@link com.serhiihonchar.customerdemo.model.Customer}class
 */

import com.serhiihonchar.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
