package com.coursedev.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coursedev.dsvendas.dto.SaleDTO;
import com.coursedev.dsvendas.entities.Sale;
import com.coursedev.dsvendas.repositories.SaleRepository;
import com.coursedev.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerrepository;
	
	@Transactional(readOnly = true)//garante que toda a operação com banco seja resolvida aqui e ReadOnly nao faz lock no banco pois é so select, nao muda nd no banco
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerrepository.findAll();//traz para a memoria para nao repetir o select no banco, funciona pois nao tem mtos vebdedores
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
}
