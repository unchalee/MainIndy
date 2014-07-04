package editRegisterProfile;

import fillRegisterProfile.*;

public class RunEditRegisterProfile {

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
		
		//2 – ระบบค้นหารายละเอียดข้อมูลจากการลอกอินของผู้ใช้
		//3 – ระบบคืนค่ารายละเอียดข้อมูลจากการลอกอิน
		Trainee theTrainee = register.searchTraineeByUsername(username);
		//4 – ระบบแสดงรายละเอียดข้อมูลจากการลอกอิน
		System.out.println(theTrainee.toString());
		System.out.println(theTrainee.getAddress().toString());
		//5 – ผู้ใช้กรอกข้อมูลการแก้ไขข้อมูล
		String title = "นางสาว";
		String name = "BAS";
		String education = "ต่ำกว่าปริญญาตรี";
		String[] occupation = {"Tester", "Administrator"};
		String telNo = "0836234763";
		String email = "unchalee.fern@gmail.com";
        String workplace = "itsci" ; 
        String addressNo = "1234";
        String street="maejo";
        String subDistrict="nonghaan";
        String district = "sansai";
        String province = "cm";
        String zipcode = "50290";
		//7 – ระบบรับค่าข้อมูลการแก้ไขข้อมูล
		//8 – ระบบบันทึกข้อมูลการแก้ไข
		//9 – ระบบคืนค่าสถานการณ์ตรวจสอบจากฐานข้อมูล
        theTrainee = theTrainee.editTrainee(title, name, education, occupation, telNo, email, workplace, addressNo, street, subDistrict, district, province, zipcode);
        //10 – ระบบตรวจสอบสถานะการคืนค่า
        if(theTrainee != null){
        	//11 – ระบบแสดงข้อมูลผู้ใช้ที่ถูกบันทึก
        	System.out.println("|| ท่านได้แก้ไขข้อมูลเรียบร้อยแล้ว ||\n");
        	System.out.println(theTrainee.toString());
    		System.out.println(theTrainee.getAddress().toString());
        }
	}
}
