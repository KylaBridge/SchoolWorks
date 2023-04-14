public class Student extends Person{
    
    String id;
    String major;
    double gpa;

    Student(String name, int age, String gender, 
            String email, String id, String major, double gpa){
        
        super(name, age, gender, email);
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    String getDetails(){

        String details;
        details = "Name: " + name +  "\n" + "Age: " + age +  "\n" + "Gender: " + gender +  "\n" +
                 "Email: " + email + "\n" + "ID: " + id +  "\n" + "Major: " + major +  "\n" + "GPA: " + gpa;
        return details;
    }
}
