package Lection3.Task3;

import java.util.Date;

/**
 * Created by Администратор on 04.09.2016.
 */
public class Solution {

    Course course1 = new Course(new Date(), "Java" );
    Course course2 = new Course(new Date(), "Android" );
    Course course3 = new Course("Java", 132, "Vasya");
    Course course4 = new Course("Android", 100, "Olga");
    Course course5 = new Course();

    Course [] courses = {course1, course2, course3, course4};

    Student student1 = new Student("Ivanov", courses );
    Student student2 = new Student("Ivan", "Ivanov", 1);

    CollegeStudent collegeStudent1 = new CollegeStudent("GoIt", 89, 875);
    CollegeStudent collegeStudent2 = new CollegeStudent("Ivan", "Ivanov", 1);
    CollegeStudent collegeStudent3 = new CollegeStudent("Ivanov", courses);

    SpecialStudent specialStudent1 = new SpecialStudent(1235);
    SpecialStudent specialStudent2 = new SpecialStudent("Ivan", "Ivanov", 1);
    SpecialStudent specialStudent3 = new SpecialStudent("GoIt", 89, 875);

}
