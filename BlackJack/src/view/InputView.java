package view;

import java.util.Scanner;

public class InputView {
    public static int getUserIntent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 : Draw, 2: Stop");
        return scanner.nextInt();
    }
}
