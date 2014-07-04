package removeInvalidRegister;

import fillRegisterProfile.*;

public class RunRemoveInvalidRegister {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0836234763", 
				"unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Trainee trainee2 = new Trainee("นางสาว", "สมหญิง ใจร้าย", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0834567867", 
				"uncreon@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.2");
		
		Register register = new Register("QTP01","1/5/2557",3,"6/5/2557",3,"15/5/2557",3200);
		
		register.addTrainee(trainee1);
		register.addTrainee(trainee2);
		
		boolean isSuccess = register.removeInvalidTrainee("อัญชลี มณีนก");
		
		if(isSuccess){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}

	}

}
