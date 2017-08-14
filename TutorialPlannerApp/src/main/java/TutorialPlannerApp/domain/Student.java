/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class Student 
{
    private String studentID;
    private String firstName;
    private String lastName;
    private String studyYear;
    private String email;

    public Student() 
    {
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getStudyYear() {
        return studyYear;
    }
    
    public String getEmail() {
        return email;
    }

    public Student (Builder builder)
    {
        this.studentID = builder.studentID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.studyYear = builder.studyYear;
        this.email = builder.email;
    }  

    public static class Builder {

        private String studentID;
        private String firstName;
        private String lastName;
        private String studyYear;
        private String email;

        public Builder studentID(String value) {
            this.studentID = value;
            return this;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }
        
        public Builder studyYear(String value) {
            this.studyYear = value;
            return this;
        }
        
        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentID.equals(student.studentID);
    }

    @Override
    public int hashCode() {
        return studentID.hashCode();
    }
}
