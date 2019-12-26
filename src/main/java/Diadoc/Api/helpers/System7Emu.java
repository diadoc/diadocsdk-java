package Diadoc.Api.helpers;

import java.io.File;
import java.lang.reflect.Method;

public class System7Emu
{
    private static String lineSeparator = detectLineSeparator();
    
    public static String lineSeparator()
    {
        return lineSeparator;
    }
    
    private static String detectLineSeparator()
    {
        try
        {
            Method lineSeparatorMethod = System.class.getMethod("lineSeparator", new Class[0]);
            return (String)lineSeparatorMethod.invoke(null,  new Object[0]);
        }
        catch (Exception ignored)
        {
            // If JRE is of version below 7 then System.lineSeparator does not exist, 
            // so we just have to ignore the error and to emulate logic
        }
        
        try
        {
            String value = System.getProperty("line.separator");
            if (value != null)
                return value;
        }
        catch (Exception ignored)
        {
            // It is unlikely but still possible to block access to properties through security settings of Java 
            // In this case just ignore the problem and detect line separator based on file system properties 
        }
        
        return (File.separatorChar == '\\') ? "\r\n" : "\n";
    }
}
