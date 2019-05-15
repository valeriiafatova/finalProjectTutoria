package com.epam.model;

import java.time.LocalDateTime;

public class Consultation {
    private int id;
    private Teacher teacher;
    private Student student;
    private LocalDateTime date;

    public Consultation(int id, Teacher teacher, Student student, LocalDateTime date) {
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.date = date;
    }

    public Consultation(int id) {
        this.id = id;
    }

    public Consultation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consultation that = (Consultation) o;

        if (id != that.id) return false;
        if (teacher != null ? !teacher.equals(that.teacher) : that.teacher != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", student=" + student +
                ", date=" + date +
                '}';
    }
}
