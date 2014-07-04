package listCourseTraining;

import java.util.Vector;

import downloadDocument.*;
import fillRegisterProfile.*;

public class RunListCourseTraining {

	public static void main(String[] args) {
		Register register1 = new Register("QTP01","1/5/2557",3,"6/5/2557",3,"15/5/2557",3200);
		Register register2 = new Register("QTP02","1/10/2557",3,"6/10/2557",3,"15/10/2557",3200);
		String courseName = "QTP";
		int courseDuration = 5;
		CourseTraining courseTraining = new CourseTraining(courseName,courseDuration);
		SearchCourseTraining searchCourseTraining = new SearchCourseTraining();
		
		courseTraining.addRegister(register1);
		courseTraining.addRegister(register2);
		
		searchCourseTraining.addCourseTraining(courseTraining);
		
//		1 - ยูสเคสเริ่มต้นเมื่อผู้ใช้เลือกฟังก์ชันแสดงรายการหลักสูตรอบรม
//		2 - ระบบค้นหาหลักสูตรการอบรมจากฐานข้อมูล
		
//		3 - ระบบคืนค่าหลักสูตรการอบรมจากการค้นหา
		int courseposition = searchCourseTraining.searchCourseId(courseName, courseDuration);
		
		
//		4 - ระบบแสดงหลักสูตรการอบรมทั้งหมดบนหน้าจอ
		CourseTraining courseNameToShow = searchCourseTraining.getCourseTrainingVector().elementAt(courseposition);
		System.out.println(courseNameToShow.getCourseName());
		Vector<Register> allregister = searchCourseTraining.getCourseTrainingVector().elementAt(courseposition).getRegisterVector();
		
		for(int i = 0;i<allregister.size();i++){
			System.out.println(allregister.elementAt(i).getRegisterNo()+" วันที่อบรม "+allregister.elementAt(i).getTrainingStartDate());
		}
//		5 - ยูสเคสสิ้นสุดการทำงาน

	}

}
