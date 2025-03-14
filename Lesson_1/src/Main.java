import java.util.Scanner; // importam classa Scanner

public class Main{
       public static void main(String[] args)
       {

           Scanner input = new Scanner(System.in); /*
            variabila input pentru a avea posibilitate sa scriem ceva in consola
            */

           System.out.println("Hello World!");
           int age = 20; // variabila 'age' cu tipul de date int
           String name = "Andrei"; // variabila 'name' cu tipul de date String
           float height = 1.80f; // variabila 'height' cu tipul de date float
           char letter = 'D'; // variabila 'letter; cu tipul de date char

           System.out.println("Ma numesc: " + name + ", eu am " + age + ", inaltamea mea este: " + height);


           int a = 500000; // variabila a
           int b = 10; // variabila b

          int addition = a + b; //adunare
           int subtraction = a - b; //scadere
           int division = a / b; // impartirea
           int multiplication = a * b; // inmultirea

           System.out.println("Addiction: " + addition);
           System.out.println("subtraction: " + subtraction);
           System.out.println("division: " + division);
           System.out.println("multiplication: " + multiplication);



           if(a == b){
               System.out.println(" = ");
           } else if (a < b) {
               System.out.println(" < ");
           }else {
               System.out.println(" > ");
           }


           System.out.println("What is your age? ");
           int userAge = input.nextInt(); // Consola asteapta un numar de la utilizator
           System.out.println("Your age is: " + userAge);

           input.nextLine();

           System.out.println("What is your username? ");
           String userName = input.nextLine(); // asteptam numele utilizatorului
           System.out.println("Your username is: " + userName);


       }
}