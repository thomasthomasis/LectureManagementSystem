/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lecturemanagementsystem;

import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.*;

public class AppTest {

    private Student testStudent = new Student("Thomas", 20, new DateTime("2002-03-21"), 1);

    private Lecturer testLecturer = new Lecturer("Dr.Smith", 52, new DateTime("1970-01-01"), 1);

    CourseProgramme testCourse = new CourseProgramme("testCourse", null, null);
    Module testModule = new Module("testModule");

    //Student Tests
    @Test public void getUsernameStudentTest() {
        String username = testStudent.getName() + testStudent.getAge();
        assertEquals(username, testStudent.getUsername());
    }

    @Test public void getCoursesStudentTest(){
        testStudent.addCourse(testCourse);
        assertEquals(testCourse, testStudent.getCourses().get(0));
    }

    @Test public void getModulesStudentTest(){
        testStudent.addModule(testModule);
        assertEquals(testModule, testStudent.getModules().get(0));
    }

    //Lecturer Tests
    @Test public void getUsernameLecturerTest(){
        String username = testLecturer.getName() + testLecturer.getAge();
        assertEquals(testLecturer.getUsername(), username);
    }

    @Test public void getModulesLecturerTest(){
        testLecturer.addModules(testModule);
        assertEquals(testModule, testLecturer.getModules().get(0));
    }

    //Module Tests
    @Test public void addStudentsTest(){
        testModule.addStudents(testStudent);
        assertEquals(testStudent, testModule.getStudents().get(0));
        assertEquals(testModule, testStudent.getModules().get(0));
    }

    @Test public void addAssociatedCourseTest(){
        testModule.addAssociatedCourse(testCourse);
        assertEquals(testCourse, testModule.getAssociatedCourses().get(0));
        assertEquals(testModule, testCourse.getModules().get(0));
    }

    //CourseProgramme Tests
    @Test public void getModulesCourseProgrammeTest(){
        testCourse.addModule(testModule);
        assertEquals(testModule, testCourse.getModules().get(0));
    }

    @Test public void getStudentsCourseProgrammeTest(){
        testCourse.addStudent(testStudent);
        assertEquals(testStudent, testCourse.getStudents().get(0));
    }


    


}