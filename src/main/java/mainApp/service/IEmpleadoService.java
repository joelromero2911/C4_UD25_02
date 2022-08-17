package mainApp.service;

import java.util.List;

import mainApp.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	// CREATE
	
	public Empleado empleadoXID(String dni); // READ
	
	public Empleado actualizarEmpleados(Empleado empleado); // UPDATE
	
	public void eliminarEmpleados(String dni); // DELETE
}
