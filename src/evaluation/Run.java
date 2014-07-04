package evaluation;
import fillRegisterProfile.*;

public class Run {

	public static void main(String[] args) {
		Trainee trainee = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", 
				new String[] { "Tester", "Administrator" }, "0836234763", 
				"unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		//2 – ระบบแสดงแบบฟอร์มการประเมินคุณภาพของการอบรม
		//3 – ผู้ใช้กรอกข้อมูลการประเมินคุณภาพของการอบรม
		int lecture1 = 1;
		int lecture2 = 1;
		int locationAndTime1 = 1;
		int cognition1 = 1;
		String comment = "-";
		//5 – ระบบรับค่าข้อมูลการประเมินคุณภาพของการอบรมที่ผู้ใช้กรอก
		//6 – ระบบบันทึกข้อมูลการประเมินคุณภาพของการอบรมลงฐานข้อมูล
		//7 – ระบบคืนค่าสถานะการตรวจสอบจากฐานข้อมูล
		Choice choice1 = new Choice("การเตรียมตัวและความพร้อมของวิทยากร", lecture1);
		Choice choice2 = new Choice("การถ่ายทอดของวิทยากร", lecture2);
		Choice choice3 = new Choice("สถานที่สะอาดและมีความเหมาะสม", locationAndTime1);
		Choice choice4 = new Choice("ความรู้ ความเข้าใจในเรื่องนี้ก่อนการอบรม", cognition1);
		Suggestion suggestion = new Suggestion(comment);
		
		Topic topic1 = new Topic("ด้านวิทยากร");
		Topic topic2 = new Topic("ด้านสถานที่/ระยะเวลา");
		Topic topic3 = new Topic("ด้านความรู้ความเข้าใจ");
		Topic topic4 = new Topic("ข้อเสนอแนะอื่นๆ");
		
		Evaluation evaluation = new Evaluation("แบบประเมินหลักสูตรการอบรม Qtp");
		
		topic1.addChoiceQuestion(choice1);
		topic1.addChoiceQuestion(choice2);
		topic2.addChoiceQuestion(choice3);
		topic3.addChoiceQuestion(choice4);
		topic4.addSuggestion(suggestion);
		evaluation.addTopic(topic1);
		evaluation.addTopic(topic2);
		evaluation.addTopic(topic3);
		evaluation.addTopic(topic4);
		trainee.addEvaluation(evaluation);
		//8 – ระบบตรวจสอบสถานะการคืนค่า
		if(trainee.getEvaluation()!=null){
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
