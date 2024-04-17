package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10];
		input(students);
		System.out.println(" Danh sach sinh vien: ");
		print(students);
	}
	private static void print(Student[] students) {
		// TODO Auto-generated method stub
	}
	public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			Student student = new Student();
			System.out.print("Tên: ");
			student.name = scanner.nextLine();
			System.out.print("Tuổi: ");
			student.age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng trống
			System.out.print("Địa chỉ: ");
			student.address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			student.phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			student.averageScore = scanner.nextDouble();
			scanner.nextLine(); // Đọc bỏ dòng trống
			students[i] = student;
		}
		scanner.close();
	}
}
