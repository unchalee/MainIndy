package viewEvaluateByCriteria;

import java.util.Vector;

import evaluation.*;
import fillRegisterProfile.*;

public class RunViewEvaluateByCriteria {

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
		
		//ถ้าเลือก 1 ต้องการดูผลการประเมินของทุกคน
		//ถ้าเลือก 2 ต้องการดูรายบุคคล
		int selectedForm = 2;
		//2 – ระบบรับข้อมูลหลักสูตรการอบรมและรูปแบบการผลการประเมินที่ผู้ใช้เลือก
		//3 – ระบบค้นหาผลการประเมินจากฐานข้อมูล
		//4 – ระบบคืนค่าผลการประเมิน
		if(selectedForm == 1){
			Vector<Trainee> traineeVector = register.listTrainee();
			
			//5 – ระบบแสดงผลการประเมินบนหน้าจอ
			for(int i=0 ; i<traineeVector.size() ; i++){
				System.out.println(traineeVector.get(i).getEvaluation().getEvaluationName());
				System.out.println((i+1) + "-" + traineeVector.get(i).getTitle() + traineeVector.get(i).getName());
				
				for(int j=0 ; j<traineeVector.get(i).getEvaluation().getTopicVector().size() ; j++){
					System.out.println(traineeVector.get(i).getEvaluation().getTopicVector().get(j).getTopicName());
					
					for(int k=0 ; k<traineeVector.get(i).getEvaluation().getTopicVector().get(j).getChoiceVector().size() ; k++){
						System.out.println(traineeVector.get(i).getEvaluation().getTopicVector().get(j).getChoiceVector().get(k).toString());
					}
					
					if(traineeVector.get(i).getEvaluation().getTopicVector().get(j).getTopicName().equals("ข้อเสนอแนะอื่นๆ")){
						System.out.println(traineeVector.get(i).getEvaluation().getTopicVector().get(j).getSuggestion().toString());
					}
				}
			}
		}else if(selectedForm == 2){
			Trainee theTrainee = register.searchTraineeByName("สมหญิง ใจดี");
			
			System.out.println(theTrainee.getEvaluation().getEvaluationName());
			System.out.println(theTrainee.getTitle() + theTrainee.getName());
			
			for(int i=0 ; i<theTrainee.getEvaluation().getTopicVector().size() ; i++){
				System.out.println(theTrainee.getEvaluation().getTopicVector().get(i).getTopicName());
				
				for(int j=0 ; j<theTrainee.getEvaluation().getTopicVector().get(i).getChoiceVector().size() ; j++){
					System.out.println(theTrainee.getEvaluation().getTopicVector().get(i).getChoiceVector().get(j).toString());
				}
				
				if(theTrainee.getEvaluation().getTopicVector().get(i).getTopicName().equals("ข้อเสนอแนะอื่นๆ")){
					System.out.println(theTrainee.getEvaluation().getTopicVector().get(i).getSuggestion().toString());
				}
			}
		}
	}
}
