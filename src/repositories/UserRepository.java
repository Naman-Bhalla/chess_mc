package repositories;

import models.User;

public abstract class UserRepository {
  public abstract User get(String email);
  public abstract User getRandomUser();
  public abstract void save(User user);
}
