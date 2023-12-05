package org.example;

import java.sql.Time;

public class Lessons {

    private int id;
    private String lesson;
    private Time start;  // 'int' helyett 'Time' típusúra változtatva
    private Time finish; // 'int' helyett 'Time' típusúra változtatva
    private String student;
    private int grade;

    public Lessons() {
        // Paraméter nélküli konstruktor
    }

    // Módosított konstruktor a 'Time' típusok elfogadására
    public Lessons(int id, String lesson, Time start, Time finish, String student, int grade) {
        this.id = id;
        this.lesson = lesson;
        this.start = start;
        this.finish = finish;
        this.student = student;
        this.grade = grade;
    }

    // Getterek és Setterek, módosítva a 'Time' típusok kezelésére
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLesson() { return lesson; }
    public void setLesson(String lesson) { this.lesson = lesson; }

    public Time getStart() { return start; } // 'Time' típusúra változtatva
    public void setStart(Time start) { this.start = start; } // 'Time' típusúra változtatva

    public Time getFinish() { return finish; } // 'Time' típusúra változtatva
    public void setFinish(Time finish) { this.finish = finish; } // 'Time' típusúra változtatva

    public String getStudent() { return student; }
    public void setStudent(String student) { this.student = student; }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    @Override
    public String toString() {
        // A 'toString' metódus frissítése a 'Time' típusok megjelenítésére
        return "Lessons{" +
                "id=" + id +
                ", lesson='" + lesson + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                ", student='" + student + '\'' +
                ", grade=" + grade +
                '}';
    }
}
