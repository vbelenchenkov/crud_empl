package com.hstn.crud_empl;

import com.hstn.crud_empl.entity.Employee;
import com.hstn.crud_empl.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudEmplApplication {

	public static void main(String[] args) {

        SpringApplication.run(CrudEmplApplication.class, args);
	}

}
