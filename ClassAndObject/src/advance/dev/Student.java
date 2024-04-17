package advance.dev;



public class Student {
	String name;
	int age;
	String address;
	String phoneNumber;
	double averageScore;
	 public static void print(Student[] students) {
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Thông tin sinh viên thứ " + (i+1) + ":");
	            System.out.println("Tên: " + students[i].name);
	            System.out.println("Tuổi: " + students[i].age);
	            System.out.println("Địa chỉ: " + students[i].address);
	            System.out.println("Số điện thoại: " + students[i].phoneNumber);
	            System.out.println("Điểm trung bình: " + students[i].averageScore);
	        }

}
}