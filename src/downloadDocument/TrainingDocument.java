package downloadDocument;

public class TrainingDocument {
	private String documentName;
	private String documentPath;
	
	public TrainingDocument(){
		
	}
	
	public TrainingDocument(String documentName, String documentPath){
		this.documentName = documentName;
		this.documentPath = documentPath;
	}
	
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	
	public String toString() {
		return "เอกสารประกอบการอบรม : " + documentName
				+ "  Path" + documentPath;
	}
	
	
}
