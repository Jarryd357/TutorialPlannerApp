
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.Student;
import TutorialPlannerApp.repositories.StudentRepository;
import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository
{
    private static StudentRepositoryImpl respository = null;

    private Map<String,Student> studentTable;

    private StudentRepositoryImpl() {
        studentTable = new HashMap<String, Student>();
    }

    public static StudentRepositoryImpl getInstance(){
        if(respository==null)
            respository = new StudentRepositoryImpl();
        return respository;
    }

    public Student create(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public Student read(String studentID) {
        Student student = studentTable.get(studentID);
        return student;
    }

    public Student update(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public void delete(String studentID) {
        studentTable.remove(studentID);

    }
}
