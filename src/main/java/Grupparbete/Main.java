package Grupparbete;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {

        List<User> users = Arrays.asList(
                new User("Kalle", "Kalle@gmail.com", 12, UserRole.ADMIN, true),
                new User("Karin", "Karin@gmail.com", 4, UserRole.EMPLOYEE, true),
                new User("Petter", "Petter@gmail.com", 2, UserRole.ADMIN, true),
                new User("Sven-Ingvar", "Sven-Ingvar@gmail.com", 5, UserRole.EMPLOYEE, true)
                );

        UserService userService = new UserService();
        List<UserDTO> result = userService.getActiveAdminUsers(users);

        System.out.println("Filtered Active Admin Users: " + result);
    }
}