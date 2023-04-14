public class Person {
    String name;
    String gender;
    String email;
    int age;

    Person(String name, int age, String gender, String email ){
        
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;

    }

    String getDetails(){

        String details;
        details = "Name: " + name +  "\n" + "Age: " + age +  "\n" + "Gender: " + gender +  "\n" + "Email: " + email;
        return details;
    }

}
