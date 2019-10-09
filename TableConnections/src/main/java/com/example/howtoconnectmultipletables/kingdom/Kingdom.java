package com.example.howtoconnectmultipletables.kingdom;

import com.example.howtoconnectmultipletables.user.User;

import javax.annotation.Resource;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Kingdom {

  private Long id;
  private String name;

  private User user;

  private List<Resource> resources;

}
