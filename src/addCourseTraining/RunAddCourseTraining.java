package addCourseTraining;
import fillRegisterProfile.*;
import downloadDocument.*;

public class RunAddCourseTraining {

	public static void main(String[] args) {
		SearchCourseTraining searchcourseTaraining = new SearchCourseTraining();
		CourseTraining courseTraining = null;
		
//		2 – ระบบแสดงแบบฟอร์มการเพิ่มหลักสูตรการอบรม
//		3 – ผู้ใช้กรอกข้อมูลการเพิ่มหลักสูตรการอบรม
//		5 – ระบบรับค่าข้อมูลการเพิ่มหลักสูตรการอบรมที่ผู้ใช้กรอก
		String courseName = "QTP";
		int courseDuration = 5;
		String trainingStartDate ="10/1/2557";		
		String courseRegisterStartDate="1/1/2557";
		int courseRegisterDuration=3;
		String paymentStartDate="6/1/2557";
		int paymentDuration=3;
		int courseRegisterCosts=2500;
//		6 – ระบบตรวจสอบข้อมูลหลักสูตรการอบรมจากฐานข้อมูล
//		7 – ระบบคืนค่าสถานะการตรวจสอบ
		boolean verifyCourse = searchcourseTaraining.verifyCourseTraining(courseName,courseDuration);
		
//		8 – ระบบตรวจสอบสถานะการคืนค่า
		if(verifyCourse!=true){
			Register register = new Register(courseName+"1",courseRegisterStartDate,courseRegisterDuration,
					paymentStartDate,paymentDuration,trainingStartDate,courseRegisterCosts);
			courseTraining = new CourseTraining(courseName,courseDuration);		
			courseTraining.addRegister(register);
			searchcourseTaraining.addCourseTraining(courseTraining);
			System.out.println("Add CourseTraining Success");
		}else{
			int coursePosition = searchcourseTaraining.searchCourseId(courseName, courseDuration);
//			9 – ระบบค้นหาจำนวนการลงทะเบียนของหลักสูตรการอบรมนั้น ๆ  จากฐานข้อมูล
//			10 – ระบบคืนค่าการค้นหาจากฐานข้อมูล
			int registerAmount  = searchcourseTaraining.getCourseTrainingVector().elementAt(coursePosition).sumOfRegister();
//			11 – ระบบสร้างรหัสการลงทะเบียนโดยบวกรหัสการลงทะเบียนเพิ่มขึ้น 1 ลำดับ
			String registerNumber = searchcourseTaraining.getCourseTrainingVector()
					.elementAt(coursePosition).createRegisterNo(registerAmount);
//			12 – ระบบบันทึกข้อมูลการเพิ่มหลักสูตรการอบรมลงฐานข้อมูล
//			13 – ระบบคืนค่าสถานะการตรวจสอบจากฐานข้อมูล
			Register register = new Register(registerNumber,courseRegisterStartDate,courseRegisterDuration,
					paymentStartDate,paymentDuration,trainingStartDate,courseRegisterCosts);
			searchcourseTaraining.getCourseTrainingVector().elementAt(coursePosition).addRegister(register);
			System.out.println("Add CourseTraining Success");
		}

	}
}
