package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610402213", "boom");
        list.addNewStudent("6610402211", "jun");

        assertEquals(2, list.getStudents().size());
    }

    @Test
    void secondTestAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610402213", "boom", 15);
        list.addNewStudent("6610402211", "jun", 5);

        assertEquals(2, list.getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610402213", "boom");
        list.addNewStudent("6610402212", "jun");
        list.giveScoreToId("6610402213", 49);
        Student s1 = list.findStudentById("6610402213");
        assertEquals(49, s1.getScore());
    }

    @Test
    void testViewGrade(){
        StudentList list = new StudentList();
        list.addNewStudent("6610402213", "boom");
        list.addNewStudent("6610402212", "jun");
        list.giveScoreToId("6610402213", 74);
        Student s1 = list.findStudentById("6610402213");
        assertEquals("B", s1.grade());
    }
}