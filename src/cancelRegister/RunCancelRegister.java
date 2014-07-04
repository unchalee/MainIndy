package cancelRegister;

import fillRegisterProfile.*;

public class RunCancelRegister {

	public static void main(String[] args) {
		Register register = new Register("Qtp001", "1/7/2557", 5, "10/7/2557", 5, "20/7/2557", 2500);
		Trainee trainee = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", new String[] { "Tester" }, 
				"0836234763", "unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Login login = new Login("unchalee", "10012536");
		trainee.addLogin(login);
		register.addTrainee(trainee);
		
		Trainee theTrainee = register.searchTraineeByUsername("unchalee");
		
		theTrainee.setTraineeStatus("ยกเลิกการเข้าร่วมอบรม");
		
	}

}
