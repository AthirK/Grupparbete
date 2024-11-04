package Grupparbete;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;



public class Main
{
    private static Object Calculator;

    public static void main(String[] args) {
        //övning 1--------------------------------------------
        /*List<User> users = Arrays.asList(
                new User("Kalle", "Kalle@gmail.com", 12, UserRole.ADMIN, true),
                new User("Karin", "Karin@gmail.com", 4, UserRole.EMPLOYEE, true),
                new User("Petter", "Petter@gmail.com", 2, UserRole.ADMIN, true),
                new User("Sven-Ingvar", "Sven-Ingvar@gmail.com", 5, UserRole.EMPLOYEE, true)
                );

        UserService userService = new UserService();

        List<UserDTO> result = userService.getActiveAdminUsers(users);

        System.out.println("Filtered Active Admin Users: " + result);*/

        //övning 3---------------------------------------------
        /*try
        {
            Class<Calculator> Clazz = Calculator.class;

            Constructor<Calculator> constructor = Clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);

            Calculator calculator = constructor.newInstance(32);

            Method addMethod = Clazz.getDeclaredMethod("add", int.class);
            addMethod.setAccessible(true);

            int result = (int) addMethod.invoke(calculator, 18);
            System.out.println("Result of addition: " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/
        //övning 2----------------------------------------------------
        MyArray<String> list = new MyArray<>();
        list.add("Athir");
        list.add("Johan");
        list.add("Simon");
        list.add("Boban");

        System.out.println("get Johan " + list.get(1));
        //------------------------------------------------------------
    }
}
