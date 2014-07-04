package evaluation;

import java.util.Vector;

public class Evaluation {
	private String evaluationName;
	
	private Vector<Topic> topicVector = new Vector<Topic>();
	
	public Evaluation() {
		
	}

	public Evaluation(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public String getEvaluationName() {
		return evaluationName;
	}
	public void setEvaluationName(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public Vector<Topic> getTopicVector() {
		return topicVector;
	}
	public void setTopicVector(Vector<Topic> topicVector) {
		this.topicVector = topicVector;
	}

	public void addTopic(Topic topic) {
		this.topicVector.addElement(topic);
	}
	
	public double[] calculateAllTopic(){
		double[] totalSelectedValue = new double[topicVector.size()-1];
		for(int i=0 ; i<topicVector.size()-1 ; i++){
			totalSelectedValue[i] = topicVector.elementAt(i).calculateValueSelected();
		}
		return totalSelectedValue;
	}
}
