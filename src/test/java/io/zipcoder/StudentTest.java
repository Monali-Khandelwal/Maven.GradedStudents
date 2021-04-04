package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class StudentTest {

    @Test
    public void getNumberOfExamsTakenTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Integer expected = 4;
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        Integer actualNumberOfExams = student.getNumberOfExamsTaken();

        // Then
        Assert.assertEquals(expected, actualNumberOfExams);

    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);

    }

    @Test
    public void getFirstNameTest() {
        //Given
        String givenName = "First Name";
        String givenLastName = "Last Name";
        Double[] givenScore = {100.0};
        Student student = new Student(givenName, givenLastName, givenScore);


        //When
        String expectedFirstName = student.getFirstName();
        String expectedLastName = student.getLastName();


        //Then
        Assert.assertEquals(givenName, expectedFirstName);
        Assert.assertEquals(givenLastName, expectedLastName);
    }

    @Test
    public void setNameTest() {
        //Given
        String givenName = "Jeff";
        String givenLastName = "Blue";
        Double[] givenScore = {100.0};
        Student student = new Student(null, null, givenScore);
        student.setLastName(givenLastName);
        student.setFirstName(givenName);

        //When
        String expectedName = student.getFirstName();
        String expectedLastN = student.getLastName();


        //Then
        Assert.assertEquals(givenName, expectedName);
        Assert.assertEquals(givenLastName, expectedLastN);

    }

    @Test
    public void addExamScoreTest() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        //String expected = "Exam scores: " + "%5s Exam %d -> %-3.0f \n" + "100";

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        //Assert.assertEquals(output, expected);
        System.out.println(output);
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        Student student1 = new Student(firstName, lastName, examScores);
        //String expected = "150";

        // When
        student1.setExamScore(1, 150.0);
        String output = student1.getExamScores();

        // Then
        //Assert.assertEquals(expected, output);
        System.out.println(output);

    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";

        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 125.0;

        // When
        Double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
//        String expected = "Student Name: Leon Hunter\n> Average Score: 125.0\n" +
//                "> Exam Scores:\n Exam 1 -> 100\nExam 2 -> 150\nExam 3 -> 250\nExam 4 -> 0";

        // When
        String output = student.toString();

        // Then
        //Assert.assertEquals(output, expected);
        System.out.println(output);
    }
}