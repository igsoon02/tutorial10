import java.util.Scanner;

public class Main {
    private static int[] array = new int[10];
    private static Scanner scanner = new Scanner(System.in);


    public static int readNumber() throws NegativeNumberException {
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }
    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        fillArray();
        System.out.println("Zawartość tablicy:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}