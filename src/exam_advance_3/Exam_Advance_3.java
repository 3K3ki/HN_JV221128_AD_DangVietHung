package exam_advance_3;

import java.util.*;

public class Exam_Advance_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập phụ huynh nộp hồ sơ ");
                    String someWord = input.nextLine();
                    queue.add(someWord);
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
