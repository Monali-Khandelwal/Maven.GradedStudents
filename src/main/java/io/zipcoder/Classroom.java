package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    Student [] students;

    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }


    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student s : students) {
            sum += s.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
    }


    public String toString() {
        String room = "[";
        for (Student s : students) {
            if (s == null) {
                room += "]";
            }
            room += s.toString() + "]";
        }
        return room;
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName) {
                for (int j =0; j < students.length -1; j++){
                    students[j] = students[j+1];
                }
                students[students.length -1] =null;
                break;
            }
        }
    }

    public Student[] getStudentByScore(Comparator<Student> comparator) {
        Arrays.sort(students, comparator);
        return students;
    }

    public Double[] getGrades() {
        Double[] scores = new Double[students.length];
        for (int i = 0; i < students.length; i++) {
            scores[i] = students[i].getAverageExamScore();
        }
        Arrays.sort(scores);
        return scores;
    }

//    public Map getGradeBook(Student[] students) {
//        double percentile = 0;
//        String grade = "";
//        HashMap<String, ArrayList<Student>> book = new HashMap<>();
//        students = getStudentsByScore(new ScoreComparator());
//        ArrayList<Student> studentList = new ArrayList<>();
//        Double[] studentsGrade = getGrades();
//        for (int i = 0; i < students.length; i++) {
//            percentile = 100 * ((i + 1) / (double) (students.length));
//
//            assignGrade(book, students[students.length - i - 1], percentile);
//
//        }
//        return book;
//    }
//
//
//    public void getGradeBook () {
//
//      HashMap <Student, String> gradeBook = new HashMap <Student, String>();
//        String grade = "";
//
//        if (percentile < 10) {
//            grade = "F"; }
//        if (percentile <= 51) {
//            grade = "D";
//        } else if (percentile <= 71) {
//            grade = "C";
//        } else if (percentile <= 89) {
//            grade = "B";
//        } else {
//            grade = "A";
//        }
//
//
//    }


    }
