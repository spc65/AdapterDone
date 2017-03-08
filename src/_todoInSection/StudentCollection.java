package _todoInSection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import model.Student;

/**
 * StudentCollection is a collection class that keeps track of all our students.
 * 
 * @author Jorge Vergara, Rick Mercer, and Jeremy Mowery
 *         (jermowery@email.arizona.edu)
 * 
 */
// TODO 1: Adapt this class to a TableModel with the methods JTable needs.
// You can Google the methods or let Eclipse write the method stubs for you
// (after adding implements TableModel to the class heading).
//
// Note: Some TableModel methods need not be implemented.
public class StudentCollection implements TableModel {

	private List<Student> theStudents;

	/**
	 * The constructor for a StudentCollection. Initializes the list of
	 * students.
	 */
	public StudentCollection() {
		theStudents = new ArrayList<Student>();
		setUpDefaultList();
	}

	/**
	 * Initializes the list with a few hard-coded students
	 */
	private void setUpDefaultList() {
		theStudents.add(new Student("Kim", "Computer Science", 4.0, 23));
		theStudents.add(new Student("Chris", "Computer Science", 4.0, 23));
		theStudents.add(new Student("Devon", "Math", 2.7, 21));
		theStudents.add(new Student("Ashley", "Biology", 3.29, 27));
		theStudents.add(new Student("Taylor", "Economics", 3.9, 25));
		theStudents.add(new Student("Chris", "Economics", 3.8, 19));
		theStudents.add(new Student("Dakota", "Psychology", 1.99, 22));
	}

	public int size() {
		return theStudents.size();
	}

	public void add(Student newStudent) {
		theStudents.add(newStudent);
	}

	public Student get(int index) {
		return theStudents.get(index);
	}

	public Student getFirstStudentWithName(String name) {
		for (int index = 0; index < size(); index++) {
			if (name.equals(theStudents.get(index).getName()))
				return theStudents.get(index);
		}
		return null; // not found
	}

	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return Student.class;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		if(arg0 == 0)
			return "name";
		if(arg0 == 1)
			return "major";
		if(arg0 == 2)
			return "gpa";
			return "age";
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return theStudents.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		Student s = theStudents.get(arg0);
		if(arg1 == 0)
			return s.getName();
		if(arg1 == 1)
			return s.getMajor();
		if(arg1 == 2)
			return s.getGPA();
			return s.getAge();
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
