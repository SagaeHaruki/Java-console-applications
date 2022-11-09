// College List without Loop

import java.util.*;

class Person1 {
   private String name;
   private String contNum;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getContNum() {
      return contNum;
   }

   public void setContNum(String contNum) {
      this.contNum = contNum;
   }
}

class Employee1 extends Person1 {

   private String department;
   private double salary;

   public void setDepartment(String department) {
      this.department = department;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDepartment() {
      return department;
   }

   public double getSalary() {
      return salary;
   }

   void cEmployee(String name, String contactNum, double salary, String dummyString, String department) {

      setName(name);
      setContNum(contactNum);
      setSalary(salary);
      setDepartment(department);

      System.out.println("----------------------------");
      System.out.println("Name          : " + getName());
      System.out.println("Contact Number: " + getContNum());
      System.out.println("Salary        : " + getSalary());
      System.out.println("Departemnt    : " + getDepartment());
   }
}

class Student1 extends Person1 {

   private String program;
   private int yearLevel;

   public void setProgram(String program) {
      this.program = program;
   }

   public void setYearLevel(int yearLevel) {
      this.yearLevel = yearLevel;
   }

   public String getProgram() {
      return program;
   }

   public int getYearLevel() {
      return yearLevel;
   }

   void cStudent(String name, String contactNum, String program, int yearLevel) {

      setName(name);
      setContNum(contactNum);
      setProgram(program);
      setYearLevel(yearLevel);

      System.out.println("----------------------------");
      System.out.println("Name          : " + getName());
      System.out.println("Contact Number: " + getContNum());
      System.out.println("Program       : " + getProgram());
      System.out.println("Year Level    : " + getYearLevel());
   }
}

class Faculty1 extends Employee1 {

   private boolean inpt2us;
   boolean isRegular;

   boolean inpt2us() {
      if (isRegular == true) {
         return inpt2us = true;
      }
      if (isRegular == false) {
         return inpt2us = false;
      }
      return inpt2us;
   }

   void cFaculty(String name, String contactNum, double salary, String dummyString, String department) {

      setName(name);
      setContNum(contactNum);
      setSalary(salary);
      setDepartment(department);

      System.out.println("----------------------------");
      System.out.println("Name          : " + getName());
      System.out.println("Contact Number: " + getContNum());
      System.out.println("Salary        : " + getSalary());
      System.out.println("Departemnt    : " + getDepartment());
      if (inpt2us() == true) {
         System.out.println(name + "        : Regular");
      } else if (inpt2us() == false) {
         System.out.println(name + "        : Not Regular");
      }
   }
}

public class CollegeListV1 {
   public static void main(String[] args) throws exeException {

      String error = "Invalid";
      Scanner Scan = new Scanner(System.in);

      Person1 PersonI = new Person1();
      Employee1 EmployeeI = new Employee1();
      Student1 StudentI = new Student1();
      Faculty1 FacultyI = new Faculty1();

      System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
      String inpt = Scan.nextLine();

      if (inpt.equals("e") || inpt.equals("E")) {

         System.out.println("Type Employee's name, contact number, salary and department.");
         System.out.println("Press Enter every input");
         EmployeeI.cEmployee(Scan.nextLine(), Scan.nextLine(), Scan.nextDouble(), Scan.nextLine(),
               Scan.nextLine());
         new CollegeListV1();

      } else if (inpt.equals("s") || inpt.equals("S")) {

         System.out.println("Type Student's Name, contact number, Program and Year Level.");
         System.out.println("Press Enter every input");
         StudentI.cStudent(Scan.nextLine(), Scan.nextLine(), Scan.nextLine(), Scan.nextInt());
         new CollegeListV1();

      } else if (inpt.equals("f") || inpt.equals("F")) {

         String inpt2;

         System.out.println("Press Y if Regular/Tenured and N if not");
         inpt2 = Scan.nextLine();

         if (inpt2.equals("y") || inpt2.equals("Y")) {
            FacultyI.isRegular = true;

         } else if (inpt2.equals("n") || inpt2.equals("N")) {
            FacultyI.isRegular = false;
         }

         System.out.println("Type Employee's name, contact number, salary and department.");
         System.out.println("Press Enter every input");

         FacultyI.cFaculty(Scan.nextLine(), Scan.nextLine(), Scan.nextDouble(), Scan.nextLine(), Scan.nextLine());
         new CollegeListV1();
      } else {
         System.out.println(error);
         new CollegeListV1();
      }
   }
}
