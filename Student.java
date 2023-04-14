public class Student extends Person{
    
    String id;
    String major;
    double gpa;

    Student(String studentName, int studentAge, String studentGender, 
            String email, String id, String major, double gpa){
        
        super(studentName, studentAge, studentGender, email);
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    String getDetails(){

        String details;
        details = "Student Name: " + name +  "\n" + "Age: " + age +  "\n" + "Gender: " + gender +  "\n" +
                 "Student Email: " + email + "\n" + "ID: " + id +  "\n" + "Major: " + major +  "\n" + "GPA: " + gpa;
        return details;
    }
}
