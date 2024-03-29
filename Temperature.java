import java.util.Scanner;
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose the conversion type
        System.out.println("Choose the type of temperature conversion you would like:");
        System.out.println("1.Fahrenheit to Degrees Celsius");
        System.out.println("2.Degrees Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        // Perform the conversion based on user choice
        switch (choice) {
            case 1:
                fahrenheitToCelsius();
                break;
            case 2:
                celsiusToFahrenheit();
                break;
            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }

    // Method to convert Fahrenheit to Celsius
    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}

