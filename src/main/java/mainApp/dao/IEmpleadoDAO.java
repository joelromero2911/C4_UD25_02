package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{

}
