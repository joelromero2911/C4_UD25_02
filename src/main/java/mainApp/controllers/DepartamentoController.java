package mainApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Departamento;
import mainApp.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoXID(@PathVariable(name="codigo") int codigo) {
		
		Departamento departamento_xid= new Departamento();
		departamento_xid=departamentoServiceImpl.departamentoXID(codigo);
		System.out.println("Departamento XID: "+departamento_xid);
		return departamento_xid;
	}

	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamentos(@PathVariable(name="codigo")int codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServiceImpl.departamentoXID(codigo);
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamentos(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamentos(@PathVariable(name="codigo")int codigo) {
		departamentoServiceImpl.eliminarDepartamentos(codigo);
	}
}
