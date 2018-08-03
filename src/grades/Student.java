package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades; //INITIALIZES NEW ARRAYLIST

    //Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(); //MAKES A NEW ARRAYLIST
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property - CALL THIS ADD GRADES
    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double grd = 0;
        for(int i = 0; i < grades.size(); i++){
            System.out.println(grades.get(i)); //this line prints out every grade w/ .get(i)
            grd += grades.get(i);
        }
        return Math.round((grd / grades.size()) * 10) / 10;
    }

    public static void main(String[] args) {
        Student stu1 = new Student("Bob");
        stu1.addGrade(80);
        stu1.addGrade(98);

        Student stu2 = new Student("Sue");
        stu2.addGrade(20);
        stu2.addGrade(50);

        System.out.println(stu1.getName() + " Grade Avg: " + stu1.getGradeAverage() + "\n");
        System.out.println(stu2.getName() + " Grade Avg: " + stu2.getGradeAverage() + "\n");
    }
}
