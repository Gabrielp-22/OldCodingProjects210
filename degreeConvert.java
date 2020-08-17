import java.util.Scanner;

public class degreeConvert {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double fahrenheit = 0.0;
        double celsius = 0.0;

        System.out.println("Please enter in a value you would like to convert from celsius to fahrenheit");

        celsius = userInput.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("The celsius you entered: " + celsius + " is " + fahrenheit + " fahrenheit");
    }
}
