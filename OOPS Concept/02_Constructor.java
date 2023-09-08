public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();

        //If we define any one constructor-- then define all other also to avoid error,, 
        // default constructor won't work if any of the constructor is defined
        Student s2 = new Student("Harshit");

        Student s3 = new Student(789);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
       // this.name = name;
        System.out.println(name);
    }

    Student(int roll){
        System.out.println(roll);
    }
}