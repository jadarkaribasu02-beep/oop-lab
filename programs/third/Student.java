package programs.third;

import java.util.Scanner;

class Student {
    String usn, name, branch;
    long phone;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of students");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        
        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nStudent"+ (i+1));
            System.out.println("enter the usn: ");
            s[i].usn = sc.next();
            System.out.println("enter the name: ");
            s[i].name = sc.next();
            System.out.println("enter the branch: ");
            s[i].branch = sc.next();
            System.out.println("enter the phone number:");
            s[i].phone = sc.nextLong();

        }

        System.out.println("\n----------------------Student Details--------------");
        for (int i = 0; i<n; i++){
            System.out.println(s[i].usn + "\t " + s[i].name + "\t " + s[i].branch + "\t" + s[i].phone);
        } // reduced number of print statements by using a single print statement to display all the details of each student in one line.

        sc.close();



    }
}
