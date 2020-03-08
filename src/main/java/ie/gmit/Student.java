package ie.gmit;
/*
* Shane Higgins
* G00339730
* 07/03/2020
* What is this?
* */
public class Student {
    private static String name;
   // private String name;
    private String email;

    public Student(String name, String email) {
        if(name == "" || email == ""){
            throw new IllegalArgumentException("Missing information");
        }else {
            this.name = name;
            this.email = email;
        }
    }


    public static String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
