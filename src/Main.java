import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean farToCelConversion = false;


        System.out.println("Input 1 for fahrenheit to celsius conversion, Input 0 for celsius to fahrenheit conversion");
        input = scanner.nextLine();

        if(Objects.equals(input, "1")) //gets type of conversion for later use
        {
            farToCelConversion = true;
        }
        else if (Objects.equals(input, "0"))
        {
            farToCelConversion = false;
        }
        else
        {
            System.out.println("Invalid user input, try again");

            //restart
            String[] argsIn = new String[]{};
            main(argsIn);
            return;
        }


        System.out.println("Enter value you wish to be converted");
        float inputFloat;
        input = scanner.nextLine();

        try //check if valid, if not restart method
        {
            inputFloat = Float.parseFloat(input);
        }
        catch (Exception e)
        {
            System.out.println("Invalid character/s used, Try again");

            //restart
            String[] argsIn = new String[]{};
            main(argsIn);
            return;
        }

        if(farToCelConversion)
        {
            System.out.println(
                    inputFloat + ".f = " +
                    FahrenheitToCelsius(inputFloat) + ".c");
        }
        else
        {
            System.out.println(
                    inputFloat + ".c = " +
                    CelsiusToFahrenheit(inputFloat) + ".f");
        }


    }
    public  static float FahrenheitToCelsius(float in)
    {
        float out = (in -32.0f) * (5.0f/9.0f);
        return out;
    }
    public static float CelsiusToFahrenheit(float in)
    {
        float out = (in * (9.0f/5.0f)) +32.0f;
        return out;
    }
}
