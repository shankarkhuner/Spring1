package model;

import java.util.Map;

public class Collage {
	private String collageName;
	private Map<Integer, Student> students;
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public Map<Integer, Student> getStudents() {
		return students;
	}
	public void setStudents(Map<Integer, Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Collage [collageName=" + collageName + ", students=" + students + "]";
	}
	
	


}
