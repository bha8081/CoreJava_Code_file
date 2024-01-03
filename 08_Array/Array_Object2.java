class Student{
    int rollNumber;
    String name;
    int marks;
}

public class Array_Object2{
    public static void main(String[] args){
        Student st1 = new Student();
        st1.rollNumber = 15;
        st1.name = "Bhavesh";
        st1.marks = 70;

        Student st2 = new Student();
        st2.rollNumber = 16;
        st2.name = "Shubham";
        st2.marks = 80;

        Student st3 = new Student();
        st3.rollNumber = 20;
        st3.name = "Nitesh";
        st3.marks = 82;

        // System.out.println(st1.name + " : " + st1.marks);

        Student st[] = new Student[3];
        st[0] = st1;
        st[1] = st2;
        st[2] = st3;

       for(int i = 0; i < st.length; i++){
        System.out.println(st[i].name + " : " + st[i].marks);
       }
      
    }
}