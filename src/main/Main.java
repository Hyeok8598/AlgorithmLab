package src.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exitMessage = "";
        String doMessage;

        while(!exitMessage.equals("exit")) {
            System.out.println("알고리즘 시작");
            doMessage = scanner.nextLine();

            exitMessage = doMessage.equals("exit") ? doMessage: "";
        }
    }
}
