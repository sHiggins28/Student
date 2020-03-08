package ie.gmit;

import java.util.ArrayList;

public class StudentsList {

    private ArrayList<Student> list;

    public StudentsList(){
        list = new ArrayList<Student>();
    }

    public void addStudents(Student myStudent){
        list.add(myStudent);
    }

    public int getSize(){
        list.size();
        return list.size();
    }

    public Student findByName(String name){
        for(Student student:list){
            if (Student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
