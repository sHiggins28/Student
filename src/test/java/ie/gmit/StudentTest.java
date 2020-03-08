package ie.gmit;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void testConstructor(){
        Student myStudent = new Student("Shane","Shane@gmit");
        assertEquals("Shane", myStudent.getName());
    }

    @Test
    void testConstructorNoName(){

        assertThrows(IllegalArgumentException.class, () -> new Student("","Shane@gmit"));
    }
    
    @Test
    void testConstructorNoEmail(){

        assertThrows(IllegalArgumentException.class, () -> new Student("Shane",""));
    }

}
