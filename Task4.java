import java.util.Scanner;

public class Task4 {

    public class ExceptionOnEmptyInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Введите строку (пустые строки запрещены):");

                try {
                    String input = scanner.nextLine();

                    if (input.isEmpty()) {
                        throw new IllegalArgumentException("Пустые строки вводить нельзя!");
                    }

                    System.out.println("Вы ввели: " + input);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
