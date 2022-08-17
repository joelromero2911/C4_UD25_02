package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer>{

}
