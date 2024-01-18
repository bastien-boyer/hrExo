package com.project.hrExo.repository;

import com.project.hrExo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.expression.spel.ast.OpInc;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // => Indique qu'une classe est un bean capable de communiquer avec une source de données
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {
}
