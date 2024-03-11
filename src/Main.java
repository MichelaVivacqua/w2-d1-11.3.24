import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //ESERCIZIO 0
//        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int number : arrayOfNumbers) {
//            sum += number;
//        }

//        System.out.println("Sum: " + sum);
//        debugger testato correttamente

//        ESERCIZIO 1
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(numbers));

        int position;
        int newValue;
        while (true) {
            try {
                System.out.print("Inserisci il numero da aggiungere oppure 0 per uscire: ");
                newValue = scanner.nextInt();
                if (newValue == 0) {
                    break;
                }

                System.out.print("Inserisci la posizione (da 1 a 5): ");
                position = scanner.nextInt();

                if (position < 1 || position > 5) {
                    throw new IndexOutOfBoundsException("Posizione non valida. Deve essere compresa tra 1 e 5.");
                }

                numbers[position - 1] = newValue;

                System.out.println(Arrays.toString(numbers));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore durante l'input: " + e.getMessage());
                scanner.next(); // Consuma l'input non valido per evitare un loop infinito
            }
        }

        scanner.close();
    }

}