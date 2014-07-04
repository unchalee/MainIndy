package evaluation;

import java.util.Vector;

public class Topic {
	private String topicName;
	
	private Suggestion suggestion;
	private Vector<Choice> choiceVector = new Vector<Choice>();
	
	public Topic(){
		
	}
	
	public Topic(String topicName){
		this.topicName = topicName;
	}

	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public Suggestion getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}
	
	public Vector<Choice> getChoiceVector() {
		return choiceVector;
	}
	public void setChoiceVector(Vector<Choice> choiceVector) {
		this.choiceVector = choiceVector;
	}
	
	public void addChoiceQuestion(Choice choice) {
		this.choiceVector.addElement(choice);
	}
	
	public void addSuggestion(Suggestion suggestion) {
		this.setSuggestion(suggestion);
	}
	
	public double calculateValueSelected(){
		double sumSelectedValue = 0.0;
		for(int i=0 ; i<choiceVector.size() ; i++){
			sumSelectedValue = sumSelectedValue + choiceVector.get(i).getSelectedValue();
		}
		sumSelectedValue = sumSelectedValue/choiceVector.size();
		return sumSelectedValue;
	}
}
