package Grupparbete;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

public class Main {
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

        System.out.println("Filtered active Admin Users: " + result);*/

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

        /*MyArray<String> list = new MyArray<>();
        list.add("Athir");
        list.add("Johan");
        list.add("Simon");
        list.add("Boban");

        System.out.println("get Johan " + list.get(1));*/

        //övning 4------------------------------------------------------------
        /*MyAnimal myAnimal = new MyAnimal();
        AutoCaller.callAnnotatedMethods(myAnimal);*/


        AmazingArray amazingArray = new AmazingArray();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println();
            System.out.println("*-*-*-* Menu: The Amazing Array *-*-*-*");
            System.out.println("    1. Add element to array");
            System.out.println("    2. Remove element at index");
            System.out.println("    3. Get element at index");
            System.out.println("    4. Clear array");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int elementToAdd = scanner.nextInt();
                    amazingArray.add(elementToAdd);
                    System.out.println(elementToAdd + " added to array.");
                    break;

                case 2:
                    System.out.print("Enter index to remove element from: ");
                    int indexToRemove = scanner.nextInt();
                    amazingArray.remove(indexToRemove);
                    System.out.println("Element at index " + indexToRemove + " removed.");
                    break;

                case 3:
                    System.out.print("Enter index to get its' element: ");
                    int indexToGet = scanner.nextInt();
                    try {
                        int element = amazingArray.get(indexToGet);
                        System.out.println("Element at index " + indexToGet + " is: " + element);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    amazingArray.clear();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } scanner.close();
    }
}
