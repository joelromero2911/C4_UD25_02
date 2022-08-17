package mainApp.service;

import java.util.List;

import mainApp.dto.Departamento;

public interface IDepartamentoService {

	//Metodos del CRUD
	public List<Departamento> listarDepartamentos(); // Listar All 
	
	public Departamento guardarDepartamento(Departamento departamento);	// CREATE
	
	public Departamento departamentoXID(int codigo); // READ
	
	public Departamento actualizarDepartamentos(Departamento departamento); // UPDATE
	
	public void eliminarDepartamentos(int codigo); // DELETE
}
