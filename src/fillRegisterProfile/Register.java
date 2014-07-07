package fillRegisterProfile;

import java.util.Vector;

public class Register {
	private String registerNo;
	private String courseRegisterStartDate;
	private int courseRegisterDuration;
	private String paymentStartDate;
	private int paymentDuration;
	private String trainingStartDate;
	private int courseRegisterCosts;
	
	private Vector<Trainee> traineeVector = new Vector<Trainee>();

	public Register() {
		
	}

	public Register(String registerNo, String courseRegisterStartDate,
			int courseRegisterDuration, String paymentStartDate,
			int paymentDuration, String trainingStartDate,
			int courseRegisterCosts) {
		this.registerNo = registerNo;
		this.courseRegisterStartDate = courseRegisterStartDate;
		this.courseRegisterDuration = courseRegisterDuration;
		this.paymentStartDate = paymentStartDate;
		this.paymentDuration = paymentDuration;
		this.trainingStartDate = trainingStartDate;
		this.courseRegisterCosts = courseRegisterCosts;
	}

	public String getRegisterNo() {
		return registerNo;
	}
	
	public String getTrainingStartDate() {
		return trainingStartDate;
	}
	
	public int getCourseRegisterCosts() {
		return courseRegisterCosts;
	}

	public Vector<Trainee> getTraineeVector() {
		return traineeVector;
	}

	public Trainee addTrainee(Trainee trainee){
		traineeVector.addElement(trainee);
		return trainee;
	}
	
	public Trainee searchTraineeByName(String name) {
		int i=0;
		while (i<traineeVector.size()) {
			if(name.equals(traineeVector.elementAt(i).getName())){
				return traineeVector.elementAt(i);
			}
			i++;
		}
		return null;
	}

	public Trainee searchTraineeByUsername(String username) {
		int i=0;
		while (i<traineeVector.size()) {
			if(username.equals(traineeVector.elementAt(i).getLogin().getUsername())){
				return traineeVector.elementAt(i);
			}
			i++;
		}
		return null;
	}

	public int sumOfTrainee() {
		return traineeVector.size();
	}
	
	public String createFrangmentPayment(int sumOfTrainee) {
		String traineePayment = "";
		sumOfTrainee = sumOfTrainee+1;
		if(sumOfTrainee<100){
			traineePayment = courseRegisterCosts + "." + (sumOfTrainee);
		}else{
			int modCountTrainee = sumOfTrainee%100;
			int divideCountTrainee = sumOfTrainee/100;
			traineePayment = (courseRegisterCosts+divideCountTrainee)+"."+modCountTrainee;
		}
		return traineePayment;
	}
	
	public double[] calculateTotalAllEvaluation(int countTrainee) {
		double[] totalAllEvaluation = new double[traineeVector.elementAt(0).getEvaluation().calculateAllTopic().length] ;
		for(int i=0 ; i<countTrainee ; i++){
			double[] topicChoice = traineeVector.elementAt(i).getEvaluation().calculateAllTopic();
			for(int j=0 ; j<topicChoice.length ; j++){
				totalAllEvaluation[j] += topicChoice[j];
			}
		}
		for(int k=0 ; k<totalAllEvaluation.length ; k++){
			totalAllEvaluation[k] = totalAllEvaluation[k]/countTrainee;
		}
		return totalAllEvaluation;
	}
	
	public String totalSuggestion(int sumOfTrainee) {
		String totalSuggestion = "";
		int sizeTopic = traineeVector.elementAt(0).getEvaluation().getTopicVector().size()-1;
		for(int i=0 ; i<sumOfTrainee ; i++){
			totalSuggestion += traineeVector.elementAt(i).getEvaluation().getTopicVector().elementAt(sizeTopic).getSuggestion().getAnswerSuggestion() + ", ";
		}
		return totalSuggestion;
	}
	
	public double[] calculateGraph(double[] totalTopic){
		double[] totalGraph = new double[totalTopic.length];
		double sumTopic = 0.0;
		for(int i=0 ; i<totalTopic.length ; i++){
			sumTopic += totalTopic[i];
		}
		for(int j=0 ; j<totalTopic.length ; j++){
			totalGraph[j] = (totalTopic[j]*100)/sumTopic;
		}
		return totalGraph;
	}
	
	public Vector<Trainee> listTrainee() {
		return traineeVector;
	}

	public boolean removeInvalidTrainee(String name) {
		for(int i=0 ; i<traineeVector.size() ; i++){
			if(name.equals(traineeVector.elementAt(i).getName())){
				traineeVector.removeElementAt(i);
				return true;
			}
		}
		return false;
	}

	public boolean verifyLogin(String username, String password){
		for(int i = 0;i<this.getTraineeVector().size();i++){			
			if(this.getTraineeVector().elementAt(i).getLogin().getUsername().equals(username)&&
					this.getTraineeVector().elementAt(i).getLogin().getPassword().equals(password)){
				return true;
			}
		}
		return false;
		
	}
	
	public String searchUserAccessStatus(String username){
		for(int i  = 0 ;i<this.getTraineeVector().size() ;i++){
			if(this.getTraineeVector().elementAt(i).getLogin().getUsername().equals(username)){
				return this.getTraineeVector().elementAt(i).getLogin().getStatus();
			}
		}
		return null;
	}
	
}
