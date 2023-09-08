

public class OOPS{
    

    //-------------------------Example of copy constructor

//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Harshit";
//         s1.roll = 23;
//         s1.password = "abcd";

//         Student s2 = new Student(s1);
//         s2.password = "Singh";

//     }
// }

// class Student{
//     String    name;
//     int   roll;
//     String password;

//     //Copy constructor
//     Student(Student s1){
//         this.name = s1.name;
//         this.roll = s1.roll;

//         System.out.println(name);
//         System.out.println(roll);
//     }

//     Student(){

//     }


    //----------------------------------------------------------------------

    //que --- if we change the marks of s1 would it also change for s2 object? 

    // ----Shallow copy
    //Changes reflect
    //Shallow copy --- references pass of array

        public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Harshit";
        s1.roll = 23;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 95;
        s1.marks[2] = 98;



        Student s2 = new Student(s1);
        s2.password = "Singh";
        s1.marks[2] =200; //change marks ---still refects in s2

        //Print marks of s2
        for(int i=0;i<3;i++){
            //Marks Wont change same marks printed coz array passes refrence
            System.out.println("Marks of s2:"+s2.marks[i]);
        }

    }
}

class Student{
    String    name;
    int   roll;
    String password;
    int marks[];

    //Copy constructor
    //Shallow Copy
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

        System.out.println(name);
        System.out.println(roll);
    }

    Student(){
        marks = new int[3]; 
    }





   
}