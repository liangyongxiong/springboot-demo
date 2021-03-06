package com.example.demo.repository.mysql;

import com.example.demo.domain.po.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>,
        JpaSpecificationExecutor<Worker>, QuerydslPredicateExecutor<Worker> {
}