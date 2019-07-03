package com.cycle.web.repository;

import com.cycle.web.entities.Cycle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public interface  CycleRepository extends CrudRepository<Cycle, Long> {



    
}