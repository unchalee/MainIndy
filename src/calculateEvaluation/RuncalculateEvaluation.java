package calculateEvaluation;

import evaluation.*;
import fillRegisterProfile.*;

public class RuncalculateEvaluation {

	public static void main(String[] args) {
		Choice choice11 = new Choice("การเตรียมตัวและความพร้อมของวิทยากร", 4);
		Choice choice12 = new Choice("การถ่ายทอดของวิทยากร", 5);
		Choice choice13 = new Choice("สถานที่สะอาดและมีความเหมาะสม", 3);
		Choice choice14 = new Choice("ความรู้ ความเข้าใจในเรื่องนี้ก่อนการอบรม", 4);
		Suggestion suggestion1 = new Suggestion("-");
		
		Topic topic11 = new Topic("ด้านวิทยากร");
		Topic topic12 = new Topic("ด้านสถานที่/ระยะเวลา");
		Topic topic13 = new Topic("ด้านความรู้ความเข้าใจ");
		Topic topic14 = new Topic("ข้อเสนอแนะอื่นๆ");
		
		Evaluation evaluation1 = new Evaluation("แบบประเมินหลักสูตรการอบรม Qtp");
		
		Trainee trainee1 = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", new String[] { "Tester", "Administrator" }, 
				"0836234763", "unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		topic11.addChoiceQuestion(choice11);
		topic11.addChoiceQuestion(choice12);
		topic12.addChoiceQuestion(choice13);
		topic13.addChoiceQuestion(choice14);
		topic14.addSuggestion(suggestion1);
		evaluation1.addTopic(topic11);
		evaluation1.addTopic(topic12);
		evaluation1.addTopic(topic13);
		evaluation1.addTopic(topic14);
		trainee1.addEvaluation(evaluation1);
		
		Choice choice21 = new Choice("การเตรียมตัวและความพร้อมของวิทยากร", 4);
		Choice choice22 = new Choice("การถ่ายทอดของวิทยากร", 4);
		Choice choice23 = new Choice("สถานที่สะอาดและมีความเหมาะสม", 3);
		Choice choice24 = new Choice("ความรู้ ความเข้าใจในเรื่องนี้ก่อนการอบรม", 5);
		Suggestion suggestion2 = new Suggestion("ควรจัดบ่อย ๆ");
		
		Topic topic21 = new Topic("ด้านวิทยากร");
		Topic topic22 = new Topic("ด้านสถานที่/ระยะเวลา");
		Topic topic23 = new Topic("ด้านความรู้ความเข้าใจ");
		Topic topic24 = new Topic("ข้อเสนอแนะอื่นๆ");
		
		Evaluation evaluation2 = new Evaluation("แบบประเมินหลักสูตรการอบรม Qtp");
		
		Trainee trainee2 = new Trainee("นางสาว", "สมหญิง ใจดี", "ต่ำกว่าปริญญาตรี", new String[] { "Tester", "Administrator" }, 
				"0836234763", "fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.2");
		
		topic21.addChoiceQuestion(choice21);
		topic21.addChoiceQuestion(choice22);
		topic22.addChoiceQuestion(choice23);
		topic23.addChoiceQuestion(choice24);
		topic24.addSuggestion(suggestion2);
		evaluation2.addTopic(topic21);
		evaluation2.addTopic(topic22);
		evaluation2.addTopic(topic23);
		evaluation2.addTopic(topic24);
		trainee2.addEvaluation(evaluation2);
		
		Register register = new Register("Qtp001", "1/7/2557", 5, "10/7/2557", 5, "20/7/2557", 2500);
		register.addTrainee(trainee1);
		register.addTrainee(trainee2);
		
//		2 - ระบบค้นหาจำนวนผู้เข้าอบรมของโครงการที่ผู้ใช้เลือก
//		3 - ระบบคืนค่าการค้นหาจากฐานข้อมูล
		int sumOfTrainee = register.sumOfTrainee();
//		4 - ระบบค้นหาผลรวมค่าของคำตอบในแต่ละหัวข้อคำถาม
//		5 - ระบบคืนค่าการค้นหาจากฐานข้อมูล
//		6 - ระบบคำนวณหาค่าเฉลี่ยในแต่ละหัวข้อคำถาม
//		7 - ระบบคืนค่าจากการคำนวณ
		double[] totalTopic = register.calculateTotalAllEvaluation(sumOfTrainee);

		System.out.println("จำนวนผู้เข้าร่วมอบรม " + sumOfTrainee);
		for(int i=0 ; i<totalTopic.length ; i++){
			System.out.println("หัวข้อที่ " + (i+1));
			System.out.println("\t" + totalTopic[i]);
		}
		System.out.println("ข้อเสนอแนะอื่น ๆ");
		System.out.println("\t" + register.totalSuggestion(sumOfTrainee));
	}

}
