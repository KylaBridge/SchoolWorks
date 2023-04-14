public class App {
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Kate Rosaldo", 19, "Female", "katerosaldo@gmail.com");
        Student student = new Student("Bibi", 19, "Female", "bibiciao@gmail.com",
                                     "Wilbert", "BSIT-MWA", 3.5);

        System.out.println(person.getDetails()); 
        System.out.println(student.getDetails()); 

    }
}
