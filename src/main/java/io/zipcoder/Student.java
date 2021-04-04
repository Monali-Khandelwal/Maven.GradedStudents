package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;
    int totalExams;

    public Student(String firstName, String lastName, Double [] testScore){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScore));
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getExamScores() {
        StringBuilder str = new StringBuilder();
        str.append("Exam scores: \n");
        double currentScore =0;
        for (int i = 0; i < examScores.size(); i++) {
            currentScore = examScores.get(i);
            str.append(String.format("%5s Exam %d -> %-3.0f \n", " ", i+1, currentScore));
        }
        //System.out.println(String.valueOf(str));
        return String.valueOf(str);
    }
    public void addExamScore(Double StudentScore) {
        examScores.add(StudentScore);
    }

    public void setExamScore(int examNumber, Double newScore) {
        examScores.set(examNumber-1,newScore);

    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        Iterator<Double> it = examScores.iterator();
        while(it.hasNext()){
            sum = sum + it.next();
        }
        return sum/getNumberOfExamsTaken();
    }

    @Override
    public String toString() {
        return String.format(
                "Student Name: " + firstName +" "+lastName+"\n"+
                        "> Average Score: " + getAverageExamScore() + "\n" +
                        "> Exam Scores: " +getExamScores());
    }

}
