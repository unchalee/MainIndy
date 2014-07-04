package listRegisterDetail;

import fillRegisterProfile.*;

public class RunlistRegisterDetail {

	public static void main(String[] args) {
		Register register = new Register("Qtp001", "1/7/2557", 5, "10/7/2557", 5, "20/7/2557", 2500);
		Trainee trainee = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", new String[] { "Tester" }, 
				"0836234763", "unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Address address = new Address("", "111", "", "หนองหาร", "สันทราย", "เชียงใหม่", "50290");
		Login login = new Login("unchalee", "10012536");
		trainee.addAddress(address);
		trainee.addLogin(login);
		register.addTrainee(trainee);
		
		//ได้มาจากการลอกอิน
		String username = "unchalee";
				
		//2 - ระบบค้นหารายละเอียดข้อมูลจากการลอกอินของผู้ใช้
		//3 - ระบบคืนค่ารายละเอียดข้อมูลจากการลอกอินจากฐานข้อมูล
		Trainee theTrainee = register.searchTraineeByUsername(username);
		//4 - ระบบแสดงรายละเอียดข้อมูลจากการลอกอิน
		System.out.println(theTrainee.toString());
		System.out.println(theTrainee.getAddress().toString());
		System.out.println(theTrainee.getLogin().toString());
		System.out.println("\nส่วนที่ 4 ข้อมูลการชำระเงิน" + "\n\tสถานะการชำระเงิน : " + theTrainee.getTraineeStatus());
	}

}
