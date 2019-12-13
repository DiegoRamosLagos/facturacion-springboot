package com.think.datajpa.models.dao;

import com.think.datajpa.models.entity.Cliente;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}
