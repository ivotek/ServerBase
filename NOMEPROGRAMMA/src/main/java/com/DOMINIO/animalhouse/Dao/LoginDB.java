/*
 * 
 * Interface for DB whit JPA
 * 
 */
package com.ivotek.animalhouse.Dao;


import com.ivotek.animalhouse.Entity.LogInEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 *
 */

@Repository
public interface LoginDB extends JpaRepository<LogInEntity, Long> {

    /**
     *
     * Find by id for login session
     * @param id to find
     * @return DTO for session
     */
    LogInEntity findByid(Long id);
    
    //TODO 
    //CONTINUARE LA SEZIONE LOGIN
   
}