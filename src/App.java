import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, I'm a program that can convert an integer into its Fibonacci counterpart.");
        System.out.println("For example, if you enter 8, I will return 21 because that's the 8th number in the Fibonacci Sequence.");
        System.out.println("To start, enter y");
        Scanner scanner = new Scanner(System.in);
            String userContinue = scanner.nextLine();

        int firstArg;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        while (true) {
            System.out.println("Please enter the number indicating the Fibonacci Sequence value you would like to know. You can enter any number from 0 to 20. If you would like to quit, enter -1 at any time.");
            int i = scanner.nextInt();

            if (i == 0) {
                System.out.println("0 in the Fibonacci Sequence is 0.");
            }
            else if (i == 1) {
                System.out.println("1 in the Fibonacci Sequence is 1.");
            }
            else if (i == 2) {
                System.out.println("2 in the Fibonacci Sequence is 1.");
            }
            else if (i == 3) {
                System.out.println("3 in the Fibonacci Sequence is 2.");
            }
            else if (i == 4) {
                System.out.println("4 in the Fibonacci Sequence is 3.");
            }
            else if (i == 5) {
                System.out.println("5 in the Fibonacci Sequence is 5.");
            }
            else if (i == 6) {
                System.out.println("6 in the Fibonacci Sequence is 8.");
            }
            else if (i == 7) {
                System.out.println("7 in the Fibonacci Sequence is 13.");
            }
            else if (i == 8) {
                System.out.println("8 in the Fibonacci Sequence is 21.");
            }
            else if (i == 9) {
                System.out.println("9 in the Fibonacci Sequence is 34.");
            }
            else if (i == 10) {
                System.out.println("10 in the Fibonacci Sequence is 55.");
            }
            else if (i == 11) {
                System.out.println("11 in the Fibonacci Sequence is 89.");
            }
            else if (i == 12) {
                System.out.println("12 in the Fibonacci Sequence is 144.");
            }
            else if (i == 13) {
                System.out.println("13 in the Fibonacci Sequence is 233.");
            }
            else if (i == 14) {
                System.out.println("14 in the Fibonacci Sequence is 377.");
            }
            else if (i == 15) {
                System.out.println("15 in the Fibonacci Sequence is 610.");
            }
            else if (i == 16) {
                System.out.println("16 in the Fibonacci Sequence is 987.");
            }
            else if (i == 17) {
                System.out.println("17 in the Fibonacci Sequence is 1597.");
            }
            else if (i == 18) {
                System.out.println("18 in the Fibonacci Sequence is 2584.");
            }
            else if (i == 19) {
                System.out.println("19 in the Fibonacci Sequence is 4181.");
            }
            else if (i == -1) {
                break;
            }
            else {
                System.out.println("You did not enter a number in the proper range.");
            }
            System.out.println("Enter y to get another Fibonacci number, enter -1 to quit.");
            userContinue = scanner.next();
            if (userContinue.equals("-1")) {
                break;
            }
        }

    System.out.println("I hope you enjoyed the program!");

    }
}
