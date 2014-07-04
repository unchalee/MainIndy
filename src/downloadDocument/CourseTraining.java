package downloadDocument;

import java.util.Vector;

import fillRegisterProfile.*;

public class CourseTraining {
	private String courseName;
	private int courseDuration;
	
	private Vector<TrainingDocument> trainingDocumentVector = new Vector<TrainingDocument>();
	private Vector<Register> registerVector = new Vector<Register>();

	public CourseTraining() {
		
	}

	public CourseTraining(String courseName, int courseDuration) {
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public Vector<Register> getRegisterVector() {
		return registerVector;
	}

	public Vector<TrainingDocument> getTrainingDocumentVector() {
		return trainingDocumentVector;
	}

	public Vector<TrainingDocument> addDocument(TrainingDocument trainingDocument) {
		 trainingDocumentVector.add(trainingDocument);
		 return trainingDocumentVector ;
	}

	public TrainingDocument searchTrainingDocument(String documentName){
		return null;
	}
	
	public Vector<TrainingDocument> listAllDocument() {
		return trainingDocumentVector;
	}
	
	public String downloadTrainingDocument(int documentNumber){
		return trainingDocumentVector.elementAt(documentNumber-1).toString();
	}
	
	public int sumOfRegister(){
		return registerVector.size();
	}
	
	public void addRegister(Register register) {
		registerVector.add(register);
	}

	public Vector<Register> listAllRegister() {
		return registerVector;
	}
	
	public String createRegisterNo(int registerAmount){
		return this.courseName+(registerAmount+1);
	}
	
}
