package selectReceipt;
import fillRegisterProfile.*;

import java.util.Calendar;

public class RunSelectReceipt {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		String receiptDate = date + "/" + (month + 1) + "/" + year;
		
		Login login1 = new Login("unchalee", "10012536");
		Login login2 = new Login("somying", "12345678");
		Address address = new Address("Itsci","64","เชียงใหม่-พร้าว","หนองหาร","สันทราย","เชียงใหม่","50290");
		Trainee trainee1 = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0836234763", 
				"unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Trainee trainee2 = new Trainee("นางสาว", "สมหญิง ใจร้าย", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0834567867", 
				"uncreon@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.2");
		trainee1.addAddress(address);
		trainee2.addAddress(address);
		trainee1.addLogin(login1);
		trainee2.addLogin(login2);
		Register register = new Register("Qtp001", "1/7/2557", 5, "10/7/2557", 5, "20/7/2557", 2500);
		register.addTrainee(trainee1);
		register.addTrainee(trainee2);
		Receipt receipt = new Receipt(receiptDate);
		receipt.addRegister(register);
		//2 – ระบบแสดงแบบฟอร์มการเลือกรูปแบบใบเสร็จ
		//3 – ผู้ใช้เลือกรูปแบบใบเสร็จ
		int verifynumber = 1;
		Trainee theTrainee = receipt.getRegister().searchTraineeByUsername("unchalee");
		//4 – ระบบแสดงข้อมูลที่อยู่ของผู้ใช้
		if(verifynumber==1){
			System.out.println(theTrainee.getTitle()+theTrainee.getName());
			System.out.println(theTrainee.getAddress().toString());
		}else if(verifynumber==2){
			System.out.println(theTrainee.getAddress().toString());
		}
		//5 – ผู้ใช้กรอกข้อมูลรูปแบบใบเสร็จ
		String receiptName = "แก้ว เรทโทรเลี่ยน";
		String receiptAddressNo="124/11";
		String receiptStreet = "เชียงใหม่-ลำปาง";
		String receiptSubDistrict = "แจ้ห่ม";
		String receiptDistrict="แจ้ห่ม";
		String receiptProvince ="ลำปาง";
		String receiptZipcode = "123456";
		
		//6 – ระบบตรวจสอบความถูกต้องและครบถ้วนจาก Script
		//7 – ระบบรับค่าข้อมูลรูปแบบใบเสร็จจากผู้ใช้
		//8 – ระบบบันทึกข้อมูลรูปแบบใบเสร็จลงฐานข้อมูล
		//9 – ระบบคืนค่าสถานะการตรวจสอบจากฐานข้อมูล
		receipt.editReceipt(receiptName, receiptAddressNo, receiptStreet, receiptSubDistrict, 
				receiptDistrict, receiptProvince, receiptZipcode);
		//10 – ระบบตรวจสอบสถานะการคืนค่า
		System.out.println(receipt.toString());

	}

}
