package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.examly.springapp.model.Registration; 
import com.examly.springapp.model.User; 
 
import java.util.List; 
 
@Repository 
public interface RegistrationRepository extends JpaRepository<Registration, Long> { 
     
    // Custom JPA Methods 
    List<Registration> findByUser(User user); 
 
    List<Registration> findByCourse(String course);  
 
    long countByCourse(String course);  
}