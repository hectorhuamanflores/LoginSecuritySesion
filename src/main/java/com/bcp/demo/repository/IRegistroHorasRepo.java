package com.bcp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.demo.model.RegistroHoras;

@Repository
public interface IRegistroHorasRepo extends JpaRepository<RegistroHoras,Integer>{
   
}
