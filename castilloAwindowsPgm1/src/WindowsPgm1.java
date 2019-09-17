public class WindowsPgm1
{

    public static void main(String[] args) {
        processWindows("Andrew", 3.99, 3.50, 2);
    }

    public static void processWindows(String name, double field2, double field3, int field4)
    {
        String[] separateField2 = String.valueOf(field2).split("\\."); // Separate integer and decimal numbers.
        String[] separateField3 = String.valueOf(field3).split("\\."); // Separate integer and decimal numbers.
        // First row display name, second and third field using 6 spaces for the integer and 4 spaces for the decimal part, follow by 6 spaces for the fourth field.
        System.out.printf("%1$s%2$6s.%3$5s%4$6s.%5$5s%6$6s%n", name, separateField2[0], separateField2[1], separateField3[0], separateField3[1], field4);
        String avgGPA = String.format("%.2f", calculateAverageGPA(field2, field3, field4)); // Calls and formats average gpa by 2 decimal places.
        System.out.printf("Average GPA:%6s", avgGPA); // Prints Average GPA follow by 6 spaces and Average GPA number.
    }

    // Calculates Average GPA
    private static double calculateAverageGPA(double field2, double field3, int field4)
    {
        return (field2 + field3)/field4; // (3.99 + 3.50)/2 = 3.75
    }
}
