package updatePaymentStatus;
import fillRegisterProfile.*;
public class RunUpdatePaymentStatus {

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
		
		//2 – ผู้ใช้เลือกสถานะของผู้เข้าร่วมอบรมที่ต้องการแก้ไข
		Trainee traineeToEdit = register.searchTraineeByName("อัญชลี มณีนก");
		System.out.println(traineeToEdit.getName());
		String traineeStatus = "ชำระเงินเรียบร้อยแล้ว";
		//4 – ระบบรับค่าข้อมูลผู้เข้าร่วมอบรมที่แก้ไข
		//5 – ระบบบันทึกข้อมูลผู้เข้าร่วมอบรมลงฐานข้อมูล
		//6 – ระบบคืนค่าสถานะการตรวจสอบจากฐานข้อมูล
		
		traineeToEdit.editPaymentStatus(traineeStatus);

		//7 – ระบบตรวจสอบสถานะการคืนค่า
		System.out.println(register.getTraineeVector().get(0).getTraineeStatus());

	}

}
