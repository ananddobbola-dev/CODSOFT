import java.util.*;

class Student{
    String name;
    int rollNo;
    int marks[] = new int[3];
    int totalMarks;
    double avgPercent;
    String grade;
}

class StudentGradeCalculator{

    public static Student askStudentData(){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        while (true) {
        System.out.print("\nEnter Student Name : ");
        String str =sc.nextLine().trim();
       // s.name=sc.nextLine().trim();
        if(str.matches("^[a-zA-Z]+$")){
            s.name= str; break; }
        else{
            System.out.println("Enter valid Name");
            continue; }
        }
        
        while (true) {
        System.out.print("\nEnter Student Roll No. : ");
        String str = sc.nextLine().trim();
        if(str.matches("\\d+")){
            s.rollNo= Integer.parseInt(str);
            break;
        }
        else{
            System.out.println("Enter valid Roll No.");
            continue;
        }
     } 
        for(int i=0;i<3;i++){
            while (true) { 
        System.out.printf("\nEnter Student Marks in Subject %d : ",(i+1));
        String str = sc.nextLine().trim();
        if(str.matches("\\d+")){
            s.marks[i]= Integer.parseInt(str);
            s.totalMarks+=s.marks[i];
            break;
        }
        else{
            System.out.println("Enter valid Marks");
            continue;
        }
         }
        }
        System.out.println();
        calGrade(s);
        
       return s;
    }

    public static void displayStudent(Student s){
        System.out.println("\n-----STUDENT REPORT-----");
        System.out.println("\nStudent Name : "+s.name.toUpperCase());
        System.out.println("Student Roll No : "+s.rollNo);
        System.out.println("Student's Total Marks : "+ s.totalMarks);
        System.out.printf("Student's Average Percentage : %.2f",s.avgPercent);
        System.out.println("%");
        System.out.println("Student's Grade : "+s.grade);

        System.out.println("\n--------------------");

        System.out.println();
    }

    public static void calGrade(Student s) {
        s.avgPercent= s.totalMarks/s.marks.length;
        if(s.avgPercent>= 90 && s.avgPercent<=100)
            s.grade="A+";
        else if(s.avgPercent>= 80 && s.avgPercent<=89)
            s.grade="A";
        else if(s.avgPercent>= 70 && s.avgPercent<=79)
            s.grade="B";
        else if(s.avgPercent>= 60 && s.avgPercent<=69)
            s.grade="C";
        else if(s.avgPercent>= 50 && s.avgPercent<=59)
            s.grade="D";
        else if(s.avgPercent<=50)
            s.grade="Fail";
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> students = new HashMap<>();
        System.out.println("\n-----STUDENT GRADE CALCULATOR -----");
        System.out.println("\n1. To Add Student Data \n2. To Display Student Report \n3. To Exit\n");
        int choice;
        while (true) {
            System.out.print("Enter your Choice : ");
           try {
choice = sc.nextInt();
            } 
catch (InputMismatchException e) {
System.out.println("Invalid Choice... Please enter numbers only\n"); 
continue;
        }
        if(choice==1){
            Student s = askStudentData();
            students.put(s.rollNo, s);
            
        }
        else if(choice==2){
            System.out.printf("\nEnter Student Roll No : ");
            int r = sc.nextInt();
            if(students.containsKey(r))
            displayStudent(students.get(r));
        else{
            System.out.println("No match found...Try Again \n");
            continue;
        }
        }
        else if(choice==3){
            //System.out.println("choice 3");
            System.out.println("\n---- Thank you for using Student Grade Calculator ----");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Choice...Try Again\n");
            continue;
        }

        }//while
    }//main
}//cls