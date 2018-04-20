package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;


/**
 * 
 * @author Bruno Gabriel  RA:816111491  SI3ANMCA
 *
 */

@Service
public class FilaService {
	private FilaDAO dao;
	
	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}

	public List<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}
	
	public void criar(Fila f){
		dao.criarFila(f);
	}
	
	public void fechar(Fila f){
		dao.fecharFila(f);
	}
}
