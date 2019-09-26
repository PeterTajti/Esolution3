package com.example.securitytokenpractice.services;

import com.example.securitytokenpractice.models.ApplicationUser;
import com.example.securitytokenpractice.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {

  private ApplicationUserRepository userRepository;

  @Autowired
  public ApplicationUserServiceImpl(ApplicationUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public ApplicationUser saveUser(ApplicationUser user) {
    return userRepository.save(user);
  }
}
