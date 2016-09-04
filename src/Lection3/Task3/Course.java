package Lection3.Task3;

import java.util.Date;

/**
 * Created by Администратор on 03.09.2016.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(Date startDate, String name) {

        this.startDate = startDate;
        this.name = name;
    }

    public Course() {
    }
}
