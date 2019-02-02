import java.util.Random;
import java.util.Scanner;

public class Console {
    private Scanner input;

    public Console() {
        this.input = new Scanner(System.in);
    }

    public int readInteger(String s) {
        System.out.println(s);
        return input.nextInt();
    }

    public String readString(String print) {
        System.out.println(print);
        return input.next();
    }

    public void printString(String print_statement) {
        System.out.println(print_statement);
    }
}
