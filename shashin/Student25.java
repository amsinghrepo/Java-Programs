/*
write a program to create a class called student with name, roll number, and age and a function which print the name and roll number of the student whose age is more than 25 by creating three student object.
*/

class Student25{

String name;
int roll_number;
int age;

public Student25(String name, int roll_number, int age){

this.name = name;
this.roll_number = roll_number;
this.age = age;

}

public void printStudent(){

if(age>25){
System.out.println("\n Name = "+this.name+"\n Roll Number = "+roll_number);
}

}

public static void main(String args[]){
Student25 s1 = new Student25("Shashin", 234, 30);
Student25 s2 = new Student25("Ram", 235, 31);
Student25 s3 = new Student25("Sham", 236, 24);

s1.printStudent();
s2.printStudent();
s3.printStudent();

}

}