package lab_5;

import DateUtil.MyDate;
import DateUtil.DateUtil;
import lab_5.Models.Course;
import lab_5.Models.Student;
import lab_5.Models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses=readCourses("courses.csv");
        for (Course course: courses){
            System.out.println(course);
        }
        System.out.println("\n");

        ArrayList<Student> students=readStudents("students.csv");
        for (Student student : students){
            System.out.println(student);
        }

        Random rand = new Random();
        ArrayList<Training> trainings = new ArrayList<>();
        MyDate startDate= new MyDate(2022,03,21);
        MyDate endDate= new MyDate(2022,03,25);
        for (Course course : courses){
            trainings.add( new Training(course,startDate,endDate,rand.nextInt(1000,2000)));
            for (int i=0;i<10;i++){
                trainings.get(trainings.size()-1).enroll(students.get(rand.nextInt(0,students.size())));
            }
        }
        for (Training training:trainings){
            training.printToFile();
        }
        for(Student student:students){
            System.out.println("\n"+student.getFirstName() + student.getLastName() +": ");
            int test =0;
            for (Training training:trainings){
                if(training.findStudentById(student.getID())!=null){
                    ++test;
                    System.out.println("\t" + training.getCourse().getName() + ", " + training.getCourse().getDescription());
                }
            }
            if(test==0) System.out.println("Not enrolled to any course");
        }
    }

    public static ArrayList<Course> readCourses(String fileName){
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("labor-05/src/lab_5/courses.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public static ArrayList<Student> readStudents(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("labor-05/src/lab_5/students.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}