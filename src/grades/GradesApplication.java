package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static boolean keepGoing = true;
    public static void main(String[] args) {
        //Create Scanner Obj from imported Input Class
        Input newIn = new Input();
        //Create new Student Obj w/ .addGrade 's
        Student stu1 = new Student("Joseph");
        stu1.addGrade(100);
        stu1.addGrade(98);
        stu1.addGrade(91);
        Student stu2 = new Student("Samantha");
        stu2.addGrade(89);
        stu2.addGrade(85);
        stu2.addGrade(80);
        Student stu3 = new Student("Gregory");
        stu3.addGrade(78);
        stu3.addGrade(72);
        stu3.addGrade(75);
        Student stu4 = new Student("Brittany");
        stu4.addGrade(69);
        stu4.addGrade(61);
        stu4.addGrade(66);

        //Create new HashMap with usernames as Key, & Student Obj createde above as Value
        HashMap<String, Student> students = new HashMap<>();
        students.put("joedabomb", stu1);
        students.put("saMasta", stu2);
        students.put("gregossom", stu3);
        students.put("britapoli", stu4);

        System.out.println("\nWelcome!\nHere are the github usernames of our students:\n");
        //prints out list of usernames from students HashMap
        for(String stud: students.keySet()){
            System.out.print("|" + stud + "| ");
        }
        System.out.println();

        //Will exit loop on cAnotherStudent() if user does not type 'y' to continue
        while(keepGoing){
            String pickUser = newIn.getString("\nWhat student would you like information on? ");
            if(!students.containsKey(pickUser)){
                System.out.println("\nSorry, no student found with the gihub username of " + pickUser);
                cAnotherStudent(newIn);
            } else {
                System.out.printf("Name: %s - Gihub Username: %s\n" + "Current Average: %f\n",
                        students.get(pickUser).getName(), pickUser, students.get(pickUser).getGradeAverage() );

                cAnotherStudent(newIn);
            }
        }
    }

    public static void cAnotherStudent(Input inVar){
        String pickAgain = inVar.getString("\nWould you like to see another student? (y/n) ");
        //while loop stop/ break point if user does not type 'y' to continue
        if(!pickAgain.equalsIgnoreCase("y")){
            System.out.println("Thank you, Bye!");
            keepGoing = false;
        }
    }
}
