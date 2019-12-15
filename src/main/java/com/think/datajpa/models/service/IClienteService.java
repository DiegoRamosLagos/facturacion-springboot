package com.think.datajpa.models.service;

import java.util.List;

import com.think.datajpa.models.entity.Cliente;
import com.think.datajpa.models.entity.Producto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);

	public void delete(Long id);

	public List<Producto> findByNombre(String term);
    
}