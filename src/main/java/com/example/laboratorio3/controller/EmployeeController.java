package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    final EmployeesRepository employeesRepository;


    public EmployeeController(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;

    }
    @GetMapping(value ={"/employee","","/"})

    public String listaEmployee(Model model){

        List<Employees> lista =employeesRepository.findAll();
        model.addAttribute("lista",lista);

        return "employee/lista";
    }
    @GetMapping(value ={"/employee/new"})
    public String nuevoEmployeeForm(Model model) {

        return "employee/newFrm";
    }


    @PostMapping(value ={"/employee/guardar"})
    public String guardarEmployee() {
        return "redirect:/employee";
    }

    @GetMapping(value ={"/employee/edit"})
    public String editarEmployee() {
        return "employee/lista";
    }


    public String borrarEmpleado() {

        return "employee/lista";

    }

    //COMPLETAR

}
