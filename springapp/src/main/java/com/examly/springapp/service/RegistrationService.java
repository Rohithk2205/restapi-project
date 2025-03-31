package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;  
import com.examly.springapp.model.Registration; 
import com.examly.springapp.model.User; 
import com.examly.springapp.repository.RegistrationRepository; 
import com.examly.springapp.repository.UserRepository; 
 
import java.util.List; 
 
@Service 
public class RegistrationService { 
 
    @Autowired 
    private RegistrationRepository repository; 
 
    @Autowired 
    private UserRepository userRepository; 
 
    public List<Registration> getAllRegistrations() { 
        return repository.findAll(); 
    } 
 
    public Registration saveRegistration(Registration registration) { 
        return repository.save(registration); 
    } 
 
    public Registration getRegistrationById(Long id) { 
        return repository.findById(id).orElse(null); 
    } 
 
    public void deleteRegistration(Long id) { 
        repository.deleteById(id); 
    } 
 
     
    public List<Registration> getRegistrationsByUser(Long userId) { 
        User user=userRepository.findById(userId).orElseThrow(()->new RuntimeException("User not found")); 
        return repository.findByUser(user); 
    } 
 
    public List<Registration> getRegistrationsByCourse(String course) { 
        return repository.findByCourse(course); 
    } 
 
 
    public long countRegistrationsByCourse(String course) { 
        return repository.countByCourse(course); 
    } 
} 