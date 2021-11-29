package repositories;

import java.util.HashMap;

import db.userDb;
import models.User;

public class InMemoryUserRepository extends UserRepository {
  private HashMap<String, User> users;
  private static Boolean shouldSendOne = false;

  public InMemoryUserRepository() {
    super();
    this.users = userDb.connect();
  }

  public User get(String email) {
    return users.get(email);
  }

  public User getRandomUser() {
    shouldSendOne = !shouldSendOne;
    if(shouldSendOne) {
      return this.users.get("user.one@email.in");
    }
    return this.users.get("user.two@email.in");
  }

  public void save(User user) {
    users.put(user.getEmail(), user);
  }
}