package downloadDocument;

import java.util.Vector;

public class RundownloadTrainingDocument {

	public static void main(String[] args) {
		TrainingDocument doc1 = new TrainingDocument("QTP_presentation01","localhost/Qtp_ppt/ppt01.ppt");
		TrainingDocument doc2 = new TrainingDocument("QTP_presentation02","localhost/Qtp_ppt/ppt02.ppt");
		CourseTraining courseTraining = new CourseTraining("QTP",5);
		SearchCourseTraining searchCourseTraining = new SearchCourseTraining();
		
		courseTraining.addDocument(doc1);
		courseTraining.addDocument(doc2);
		
		searchCourseTraining.addCourseTraining(courseTraining);
		
		
//		2 – ระบบค้นหาข้อมูลเอกสารของการอบรมจากฐานข้อมูล
//		3 – ระบบคืนค่าข้อมูลเอกสารของการอบรมจากฐานข้อมูล
		Vector<TrainingDocument> trainingDoc = searchCourseTraining.getCourseTrainingVector().elementAt(0).listAllDocument();
//		4 – ระบบแสดงข้อมูลเอกสาร
		for(int i=0 ; i<trainingDoc.size() ; i++){
			System.out.println((i+1) + " - " + trainingDoc.elementAt(i).toString());
		}
//		5 – ผู้ใช้เลือกเอกสารที่ต้องการดาวน์โหลด
		int documentNumber = 1;
//		6 – ระบบรับค่าข้อมูลการดาวน์โหลดที่ผู้ใช้เลือก
//		7 – ระบบค้นหาข้อมูลการดาวน์โหลดจากฐานข้อมูล
//		8 – ระบบคืนค่าข้อมูลการดาวน์โหลด
		String documentDownload = searchCourseTraining.getCourseTrainingVector().elementAt(0).downloadTrainingDocument(documentNumber);
		System.out.println("\nเอกสารที่ผู้เข้าอบรมดาวน์โหลด : ");
		System.out.println(documentDownload);
	}

}
