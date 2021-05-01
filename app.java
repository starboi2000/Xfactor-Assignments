import java.util.ArrayList;
import java.util.Scanner;

import org.graalvm.compiler.nodes.NodeView.Default;

import jdk.nashorn.internal.ir.BreakableNode;

class Student{
    String name;
    int age;
    String gender;
    String address;
    Student(String name, int age, String gender, String address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    Student()
    {
        System.out.println("******   Enter Student Details   *******");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Enter gender: ");
        gender = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        //input.close();
    }
    void show()
    {
        System.out.println("Sudent details: ");
        System.out.println("Name: "+name+", Age: "+age+", Gender: "+gender+", Address: "+address);
    }

}

class Department{
    String name;
    String HOD;
    Department(String name, String HOD)
    {
        this.name = name;
        this.HOD = HOD;
    }
    Department()
    {
        System.out.println("******   Enter Dept Details   ********");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter HOD: ");
        HOD = input.next();
    }
    void show()
    {
        System.out.println("Department details: ");
        System.out.println("Name: "+name+", HOD: "+HOD);
    }
}

class app{
    public static void main(String[] args)
    {
        ArrayList<Department> dept_list = new ArrayList<Department>();
        ArrayList<Student> student_list = new ArrayList<Student>();
        boolean condition = true;
        Scanner input = new Scanner(System.in);
        int index;
        while(condition == true)
        {
            System.out.println("Enter your choice:\n1. Add Student \n2. List Student \n3. Add Department \n4. List Department \n5. Remove Student \n6. Remove Department \n7. Exit");
            int choice = input.nextInt();
            switch(choice)
            {
                case 1: student_list.add(new Student());
                        break;
                case 2: for(Student s : student_list)
                            s.show();
                        break;
                case 3: dept_list.add(new Department());
                        break;
                case 4: for(Department d : dept_list)
                            d.show();
                        break;
                case 5: System.out.print("****** Student deletion *********\nEnter index: ");
                        index = input.nextInt();
                        student_list.remove(index);
                        break;
                case 6: System.out.print("****** Department deletion *********\nEnter index: ");
                        index = input.nextInt();
                        dept_list.remove(index);
                        break;
                case 7: condition = false;
                        break;
                default: System.out.println("Not valid choice enter correct choice");
            }

        }
        input.close();
    }
}