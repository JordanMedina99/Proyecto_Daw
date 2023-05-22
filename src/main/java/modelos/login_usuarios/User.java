package modelos.login_usuarios;


import java.util.ArrayList;
import java.util.List;

public class User {
  private String username;
  private String password;
  private String role;

  public User(String username, String password, String role) {
    this.username = username;
    this.password = password;
    this.role = role;
  }

  // Getters y setters

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public static List<User> getUsers() {
    List<User> userList = new ArrayList<>();
    userList.add(new User("presidente", "cornelius", "admin"));
    userList.add(new User("vigilante", "agila", "cuidador"));
    userList.add(new User("mentor", "sasuke", "mentor"));
    userList.add(new User("tributos", "cuidador", "vigilante"));
    // Agregar más usuarios si es necesario
    return userList;
  }
}
/*
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return username.equals(user.username);
  }

  @Override
  public int hashCode() {
    return username.hashCode();
  }
}
*/