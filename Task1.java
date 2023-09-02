import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
                System.out.println("Вы ввели число: " + promptForFloat());
        }

        public static float promptForFloat() {
                Scanner scanner = new Scanner(System.in);
                float userFloat = 0.0f;

                while (true) {
                        System.out.println("Пожалуйста, введите дробное или целое число:");
                        String input = scanner.nextLine();
                        try {
                                userFloat = Float.parseFloat(input);
                                break;
                        } catch (NumberFormatException e) {
                                System.out.println("Это не корректное число. Попробуйте еще раз.");
                        }
                }

                return userFloat;
        }
}
