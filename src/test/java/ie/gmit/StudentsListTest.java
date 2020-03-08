package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsListTest {
    Student myStudent;
    StudentsList myList;

    @BeforeEach
    void setup(){
        myStudent = new Student("Shane","shane@hg");
        myList = new StudentsList();
    }

    @Test
    void testAddStudent(){
        myList.addStudents(myStudent);
        assertEquals(1,myList.getSize());
    }

    @Test
    void testFindByNameStudent(){
        myList.addStudents(myStudent);
        assertEquals(myStudent,myList.findByName("Shane"));
    }

}
