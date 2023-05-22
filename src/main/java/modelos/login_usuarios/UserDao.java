package modelos.login_usuarios;


import java.util.List;


public class UserDao {
    public User getUserByUsernameAndPassword(String username, String password) {
        List<User> userList = User.getUsers();
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
