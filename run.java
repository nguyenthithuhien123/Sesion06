package bailuyentap;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Student  student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên:");
        student.setMsv(sc.nextLine());
        System.out.println("Nhập vào giới tính sv");
        student.setSex(sc.nextBoolean());
        student.showInfor();
    }
}
