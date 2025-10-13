package com.springexample.employee.controller;

import com.springexample.employee.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
        employees.add(new Employee(1, "Neha", "neha@gmail.com", 40000));
        employees.add(new Employee(2, "Gauri", "gauri@gmail.com", 35000));
        employees.add(new Employee(3, "Shweta", "shweta@gmail.com", 30000));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        return employees.stream()
                .filter(e -> e.getId() == id )
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        employees.add(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee updateEmployee) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(updateEmployee.getName());
                e.setEmail(updateEmployee.getEmail());
                e.setSalary(updateEmployee.getSalary());
                return ResponseEntity.ok(e);
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable int id){
        employees.removeIf((e -> e.getId() == id));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build() ;
    }


}


