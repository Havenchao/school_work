public class UbuntuProgram1
{

    public static void main(String[] args)
    {
        processUbuntu("Andrew", 2019.2); // Calls processUbuntu method with name and number parameter.
    }

    public static void processUbuntu(String name, double number)
    {
        String[] separate = String.valueOf(number).split("\\."); // Separate integer and decimal numbers.
        // First row display name. Second row with display 10 spaces with the integer part and 5 spaces for the decimal part.
        System.out.printf("%1$s%n%2$10s.%3$5s", name, separate[0], separate[1]);
    }
}