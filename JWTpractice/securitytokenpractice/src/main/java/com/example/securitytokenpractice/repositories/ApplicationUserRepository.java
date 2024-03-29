package com.example.securitytokenpractice.repositories;

import com.example.securitytokenpractice.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends CrudRepository <ApplicationUser, Long> {
  ApplicationUser findByUsername(String username);
}
