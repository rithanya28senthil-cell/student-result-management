import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class person

{
    String name;
    int rollNumber;
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int mark5;
    person(String name,int rollNumber,int mark1,int mark2,int mark3,int mark4,int mark5)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;


    }
    String getName()
    {
        return name;
    }
    int getrollNumber()
    {
        return rollNumber;
    }
    int getMark1()
    {
        return mark1;
    }
    int getMark2()
    {
        return mark2;
    }
    int getMark3()
    {
        return mark3;
    }
    int getMark4()
    {
        return mark4;
    }
    int getMark5()
    {
        return mark5;
    }
    int getTotal()
    {
        return mark1 + mark2 + mark3 + mark4 + mark5;
    }
    double getPercentage()
    {
        return(getTotal()/500.0)*100;
    }
    String getGrade() {
    double percentage = getPercentage();
    if (percentage >= 90) {
        return "A+";
    } else if (percentage >= 80) {
        return "A";
    } else if (percentage >= 70) {
        return "B";
    } else if (percentage >= 60) {
        return "C";
    } else {
        return "Fail";
    }
}
}
    
public class student
{
    public static void main(String[] args)
    {
        ArrayList<person> students  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=3)
        {
            System.out.println("1.add student");
            System.out.println("2. view all students");
            System.out.println("3. exit");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            if(choice == 1)
            {
                
                             sc.nextLine();
                             System.out.print("Enter name: ");
                             String name = sc.nextLine();
                             System.out.print("Enter roll number: ");
                              int rollNumber = sc.nextInt();
                             System.out.print("Enter mark1: ");
                             int mark1 = sc.nextInt();
                             System.out.print("Enter mark2: ");
                             int mark2 = sc.nextInt();
                             System.out.print("Enter mark3: ");
                             int mark3 = sc.nextInt();
                            System.out.print("Enter mark4: ");
                              int mark4 = sc.nextInt();
                             System.out.print("Enter mark5: ");
                            int mark5 = sc.nextInt();

                       person p = new person(name, rollNumber, mark1, mark2, mark3, mark4, mark5);
                       students.add(p);

                  try {
                  FileWriter fw = new FileWriter("students.txt", true);
                  fw.write(name + "," + rollNumber + "," + mark1 + "," + mark2 + "," + mark3 + "," + mark4 + "," + mark5 + "\n");
                   fw.close();
    } catch (Exception e) {
        System.out.println("Error saving student!");
    }

    System.out.println("Student added successfully!");

} 

            
            else if(choice == 2)
            {
                if(students.size() == 0)
                {
                    System.out.println("no students added yet");

                }
                else
                {
                for(person student: students)
                    {

                       System.out.println("Name: " + student.getName());
                       System.out.println("Roll Number: " + student.getrollNumber());
                      System.out.println("Total: " + student.getTotal());
                       System.out.println("Percentage: " + student.getPercentage());
                       System.out.println("Grade: " + student.getGrade());
                       System.out.println("------------------------");

}
            }
        }
            else if(choice == 3)
            {
                System.out.println("goodbye");
            }
            else
            {
                System.out.println("invalid choice try again");
            }

        }


sc.close();

    }
    
    }
