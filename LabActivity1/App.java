public class App {
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Kyla Rosaldo", 19, "Female", "rosaldokl1@students.national-u.edu.ph");
        Student student = new Student("Jeremiya", 22, "Male", "jeremiyapanget@gmail.com",
                                     "JOJO", "BSIT-MWA", 4);

        System.out.println(person.getDetails()); 
        System.out.println(student.getDetails()); 

    }
}
