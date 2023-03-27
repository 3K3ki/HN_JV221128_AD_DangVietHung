package exam_advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập câu");
                    String someWord = input.nextLine();
                    stack.push(someWord);
                    System.out.println("Hiện: "+someWord);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Thoát thành công!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }
}
