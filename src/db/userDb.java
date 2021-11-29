package db;

import java.util.HashMap;

import models.User;

public class userDb {
  public static HashMap<String, User> connect() {
    HashMap<String, User> userMap = new HashMap<>();
    userMap.put("user.one@email.in", new User("User One", "Address One", "user.one@email.in"));
    userMap.put("user.two@email.in", new User("User Two", "Address Two", "user.two@email.in"));
    userMap.put("user.three@email.in", new User("User Three", "Address Three", "user.three@email.in"));
    return userMap;
  }
}
