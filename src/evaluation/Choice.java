package evaluation;

public class Choice {
	private String choiceQuestion;
	private int selectedValue;
	
	public Choice() {
		
	}

	public Choice(String choiceQuestion, int selectedValue) {
		this.choiceQuestion = choiceQuestion;
		this.selectedValue = selectedValue;
	}

	public String getChoiceQuestion() {
		return choiceQuestion;
	}

	public void setChoiceQuestion(String choiceQuestion) {
		this.choiceQuestion = choiceQuestion;
	}

	public int getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(int selectedValue) {
		this.selectedValue = selectedValue;
	}
}
