package user;

public class UserManager {
    User[] users = new User[10];
    int userCount = 0;

    public void addUser(User user) {
        users[userCount] = user;
        userCount++;
    }

    public void displayUsers() {
        for (int i = 0; i < userCount; i++) {
            System.out.println("Name: " + users[i].name + " Email: " + users[i].email + "  Age: " + users[i].age);
        }
    }
}
