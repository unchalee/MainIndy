package downloadDocument;

import java.util.Vector;

public class SearchCourseTraining {
	private Vector<CourseTraining> courseTrainingVector = new Vector<CourseTraining>();

	public Vector<CourseTraining> getCourseTrainingVector() {
		return courseTrainingVector;
	}

	public void setCourseTrainingVector(
			Vector<CourseTraining> courseTrainingVector) {
		this.courseTrainingVector = courseTrainingVector;
	}

	public Vector<CourseTraining> addCourseTraining(
			CourseTraining courseTraining) {
		courseTrainingVector.add(courseTraining);
		return courseTrainingVector;
	}

	public Vector<CourseTraining> listCourseTraining() {
		return null;
	}

	public boolean verifyCourseTraining(String courseName, int courseDuration) {
		for (int i = 0; i < courseTrainingVector.size(); i++) {
			if (courseName.equals(courseTrainingVector.elementAt(i)
					.getCourseName())
					&& courseDuration == courseTrainingVector.elementAt(i)
							.getCourseDuration()) {
				return true;
			}
		}
		return false;
	}

	public int searchCourseId(String courseName, int courseDuration) {
		for (int i = 0; i < courseTrainingVector.size(); i++) {
			if (courseName.equals(courseTrainingVector.elementAt(i)
					.getCourseName())
					&& courseDuration == courseTrainingVector.elementAt(i)
							.getCourseDuration()) {
				return i;
			}
		}
		return -1;
	}

}
