package login;

import fillRegisterProfile.*;

public class RunLogin {

	public static void main(String[] args) {
		
		// 2 – ผู้ใช้ระบุชื่อผู้ใช้และรหัสผ่าน
		String username = "user";
		String password = "4321";
		// 4 - ระบบรับค่าชื่อผู้ใช้และรหัสผ่าน
		// 5 - ระบบค้นหาชื่อผู้ใช้และรหัสผ่านภายในฐานข้อมูล
		// 6 - ระบบคืนค่าสถานการตรวจสอบจากฐานข้อมูล
		//ทดสอบใหม่นะ
		
		Login login = new Login() ;
		Trainee trainee  =new Trainee();
		Register register = new Register();
		
		login.setUsername("user");
		login.setPassword("4321");
		trainee.addLogin(login);
		register.addTrainee(trainee);
		
		boolean verifyLogin = register.verifyLogin(username, password);
		
		// 7 - ระบบตรวจสอบสถานการณ์คืนค่า
		if(verifyLogin){
			// 8 - ระบบยอมให้ผู้ใช้เข้าสู่หน้าจอการทำงานหลักของผู้อบรม
			System.out.println("Pass");
		}else{
			System.out.println("No data found!! Please Try again");
		}

	}

}
