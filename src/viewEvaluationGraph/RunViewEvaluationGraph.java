package viewEvaluationGraph;

import fillRegisterProfile.*;

public class RunViewEvaluationGraph {

	public static void main(String[] args) {
		Register register = new Register();
		//2 –ระบบอ้างอิงค่าเฉลี่ยจากการคำนวณภายในยูสเคส Calculate Evaluation
		double[] totalTopic = {4.25, 3.0, 4.5};
		
		double[] totalGraph = register.calculateGraph(totalTopic);
		//3 – ระบบแสดงค่าที่อ้างอิง โดยทำงานร่วมกับเครื่องมือ iReport
		for(int i=0 ; i<totalGraph.length ; i++){
			System.out.print("หัวข้อที่ " + (i+1));
			System.out.printf("\t %.2f ", totalGraph[i]);
			System.out.print("%\n");
		}
	}

}
