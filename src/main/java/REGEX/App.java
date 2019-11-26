package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pattern p = Pattern.compile("[0-8]{4}");
        String s = "2019/01/01 la chuoi can tim xx xx 2018";
        Matcher m = p.matcher(s);

        boolean findOrNot = m.find();
        System.out.println( findOrNot );

        boolean matchOrNot = m.matches();
        System.out.println( matchOrNot );
    }
}
