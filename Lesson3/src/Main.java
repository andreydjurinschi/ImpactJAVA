import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // creeam scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your username");
        String username = scanner.nextLine(); // ateptam input de la user
        System.out.println("Hello " + username + "!");

        /*
         * int[] -> aratam ca creem un array cu elemente int
         * 1 -> 5 (0)
         */
        int[] numbersArray = new int[5]; // 0 0 0 0 0
        System.out.println("Size of your array is " + numbersArray.length); // marimea array-ului

        for(int i = 0; i < numbersArray.length; i++){
            System.out.println("Write an element on position " + i + ":");
            numbersArray[i] = scanner.nextInt();
        }

        System.out.println("Great, your created array is: ");

        for(int i = 0; i < numbersArray.length; i++){
            System.out.print(numbersArray[i] + " ");
        }
    }
}