package listAllRegister;

import java.util.Vector;
import fillRegisterProfile.*;

public class RunListAllRegister {

	public static void main(String[] args) {
//		1 – ยูสเคสเริ่มต้นเมื่อผู้ใช้เลือกฟังก์ชันดูรายชื่อผู้เข้าร่วมอบรมทั้งหมดของหลักสูตร
//		2 – ระบบรับข้อมูลหลักสูตรการอบรมที่ผู้ใช้เลือก
		Trainee trainee1 = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0836234763", 
				"unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Trainee trainee2 = new Trainee("นางสาว", "สมหญิง ใจร้าย", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0834567867", 
				"uncreon@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.2");
		
		Register register = new Register("QTP01","1/5/2557",3,"6/5/2557",3,"15/5/2557",3200);
		
		register.addTrainee(trainee1);
		register.addTrainee(trainee2);
//		3 – ระบบค้นหารายชื่อผู้เข้าร่วมอบรมจากฐานข้อมูล
		
//		4 – ระบบคืนค่ารายชื่อผู้เข้าร่วมอบรม
		Vector<Trainee> traineeData = register.listTrainee();
//		5 – ระบบแสดงรายชื่อผู้เข้าร่วมอบรมบนหน้าจอ
		for(int i = 0;i<traineeData.size();i++){
			System.out.println(traineeData.elementAt(i).getTitle()+" "+traineeData.elementAt(i).getName()+" "+traineeData.elementAt(i).getTraineeStatus());
		}
//		6 – ยูสเคสสิ้นสุดการทำงาน

	}

}
