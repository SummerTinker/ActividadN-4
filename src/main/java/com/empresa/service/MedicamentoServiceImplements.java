package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImplements implements MedicamentoService {

		@Autowired
		private MedicamentoRepository repository;
	
	
	@Override
	public Medicamento InsertarMedicamento(Medicamento medicamento) {
		
		return repository.save(medicamento);
	}


	@Override
	public List<Medicamento> ListarMedicamento() {
		
		return repository.findAll() ;
	}

	
	
	
}
