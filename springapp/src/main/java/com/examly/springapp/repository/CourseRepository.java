package com.examly.springapp.repository;
 
import org.springframework.data.jpa.repository.JpaRepository; 
 
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable; 
import com.examly.springapp.model.Course; 
//import com.springboot.languagelearning.entities.Language; 
import com.examly.springapp.model.Course.DifficultyLevel; 
 
public interface CourseRepository extends JpaRepository<Course, Long> { 
    //Page<Course> findByLanguage(Language language, Pageable pageable); 
 
    Page<Course> findByDifficultyLevel(DifficultyLevel difficultyLevel, Pageable pageable); 
 
}