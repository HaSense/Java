//루프 가이드코드

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. 데이터 삽입 ");
            System.out.println(" 2. 데이터 삭제 ");
            System.out.println(" 3. 데이터 조회 ");
            System.out.println(" 4. 데이터 수정 ");
            System.out.println(" 5. 프로그램 종료 ");

            System.out.print("메뉴 : ");
            String input = scanner.nextLine();

            int number;
            try {
                number = Integer.parseInt(input); // 문자열을 int로 변환
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            switch (number) {
                case 1:
                    System.out.println("데이터 삽입을 선택했습니다.");
                    break;
                case 2:
                    System.out.println("데이터 삭제를 선택했습니다.");
                    break;
                case 3:
                    System.out.println("데이터 조회를 선택했습니다.");
                    break;
                case 4:
                    System.out.println("데이터 수정을 선택했습니다.");
                    break;
                case 5:
                    System.out.println("프로그램이 안전하게 종료되었습니다!");
                    System.exit(0); 
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
