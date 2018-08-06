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
/*
        !!!!! BONUS - not done yet...!!!!!!
Continue Working on The Grading Application... (from the collections exercise)

- Modify your CLI to provide an option to view the overall class average
- Modify your CLI to provide an option to print a csv report of all the
  students;
    Example Output

        name,github_username,average
        Zach,zgulde,81.2
        Ryan,ryanorsinger,88.3
        Fernando,fmendozaro,90.4
        ...

- Add an attendance property to your Student objects. It should be a
  HashMap<String, String>. The keys should be strings representing the date,
  in the format "2017-10-02", and the values should be Strings that are one
  of "A" (Absent) or "P" (Present).

    - Add a method named `recordAttendance(String date, String value)` that adds
      records to the attendance HashMap. This method should make sure `value` is
      an an acceptable string (one of "A" or "P").
    - Create an instance method on your Student class to calculate a
      student's attendance percentage -- (Total Days - Absences) / Total Days
    - Add the attendance information to the output of your command line
      interface, this should require only a small change
    - Create an instance method on Student that finds the specific days a
      student was absent. This method should return a List of Strings, where
      each string is the date of the absence
 */
