/*
create a student class which display name, roll number, age and markes in three subjects.write a program to find the total marks of each student and then find the topper in the class.use constructor apriopritely.
*/

class Student{

String name;
int rollNumber;
int age;
int marks[] = new int[3];
long totalMarks;

public Student(String name, int rollNumber, int age){

this.name = name;
this.rollNumber = rollNumber;
this.age = age;
}

public void setMarks(int subject1, int subject2, int subject3){
marks[0] = subject1;
marks[1] = subject2;
marks[2] = subject3;

totalMarks = marks[0]+marks[1]+marks[2];
}


public static void main(String args[]){

Student s1 = new Student("Shashin", 101, 28);
s1.setMarks(66,78,59);

Student s2 = new Student("Ram", 102, 27);
s2.setMarks(44,55,66);

Student s3 = new Student("Sham", 101, 28);
s3.setMarks(47,70,58);


System.out.println("\n Name= "+s1.name+"\n Roll Number= "+s1.rollNumber+"\n Age= "+s1.age+"\n Markes in Subject 1= "+s1.marks[0]+", Subject 2= "+s1.marks[1]+", Subject 3= "+s1.marks[2]);


System.out.println("\n Name= "+s2.name+"\n Roll Number= "+s2.rollNumber+"\n Age= "+s2.age+"\n Markes in Subject 1= "+s2.marks[0]+", Subject 2= "+s2.marks[1]+", Subject 3= "+s2.marks[2]);


System.out.println("\n Name= "+s3.name+"\n Roll Number= "+s3.rollNumber+"\n Age= "+s3.age+"\n Markes in Subject 1= "+s3.marks[0]+", Subject 2= "+s3.marks[1]+", Subject 3= "+s3.marks[2]);


if(s1.totalMarks >s2.totalMarks && s1.totalMarks > s3.totalMarks){

System.out.println("\n "+s1.name+" is Topper of the Class");

}

else if(s2.totalMarks > s1.totalMarks && s2.totalMarks > s3.totalMarks){

System.out.println("\n "+s2.name+" is Topper of the Class");
}

else if(s3.totalMarks > s1.totalMarks && s3.totalMarks > s2.totalMarks){

System.out.println("\n "+s2.name+" is Topper of the Class");
}

}

}