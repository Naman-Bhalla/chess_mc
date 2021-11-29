package service;

import models.User;
import repositories.InMemoryUserRepository;
import repositories.UserRepository;

public class UserService {
  private UserRepository userRepository;

  UserService() {
    // how can I not use InMemoryUserRepository here directly
    this.userRepository = new InMemoryUserRepository();
  }

  public User getRandomUser() {
    return userRepository.getRandomUser();
  }
  
}
