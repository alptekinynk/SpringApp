package com.example.springapp.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class EmployeeConfig {

    CommandLineRunner commandLineRunner(EmployeeRepository repository){
        return args -> {
            Employee Alptekin = new Employee(
                    "Alptekin",
                    "YANIK",
                    "alptekin_ynk@hotmail.com",
                    LocalDate.of(1998, NOVEMBER, 5),
                    23
            );
            Employee Murat = new Employee(
                    "Murat",
                    "YILDIRIM",
                    "murattyldrm@hotmail.com",
                    LocalDate.of(1999, MAY, 1),
                    22
            );
            Employee Furkan = new Employee(
                    "Furkancan",
                    "ÖZER",
                    "furkcan13@gmail.com",
                    LocalDate.of(1999, AUGUST, 15),
                    22
            );

            repository.saveAll(
                    List.of(Alptekin,Murat,Furkan)
            );
        };
    }
}
