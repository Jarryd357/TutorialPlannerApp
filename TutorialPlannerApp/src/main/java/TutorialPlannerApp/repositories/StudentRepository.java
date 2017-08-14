
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Student;

public interface StudentRepository 
{
    Student create(Student student);

    Student read(String studentID);

    Student update(Student student);

    void delete(String studentID);   
}
