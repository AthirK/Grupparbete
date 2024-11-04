package Grupparbete;

import java.lang.reflect.Method;


public class AutoCaller
{
    public static void callAnnotatedMethods(Object obj)
    {
        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(AutoCall.class))
            {
                try
                {
                    method.setAccessible(true);
                    method.invoke(obj);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}