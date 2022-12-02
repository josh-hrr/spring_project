package com.example.udemy.course.demo.repository; 
import java.io.Serializable;  
import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.udemy.course.demo.entity.Cliente; 

public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{
	
}
