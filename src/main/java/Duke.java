import java.util.Scanner;
public class Duke {
    private static String GREETING_MSG = "Hello! I'm Duke\nWhat can I do for you?";
    private final static String GOODBYE_MSG = "Bye. Hope to see you again soon!";
    private final static Scanner scanner = new Scanner(System.in);

    private static void greet() {
        System.out.println(GREETING_MSG);
    }

    private static void echo(String cmd) {
        System.out.println(cmd);
    }

    private static void exit() {
        System.out.println(GOODBYE_MSG);
    }

    public static void main(String[] args) {
        greet();
        for (String s = scanner.nextLine(); !s.equals("bye"); s = scanner.nextLine()) {
            echo(s);
        }
        exit();
    }
}
