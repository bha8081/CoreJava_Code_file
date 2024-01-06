class Student {
    String collage_Name;
    String student_Name;
    int student_id;
    long student_Number;

    public String getCollage_Name() {
        return collage_Name;
    }

    public void setCollage_Name(String collage_Name) {
        this.collage_Name = collage_Name;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public long getStudent_Number() {
        return student_Number;
    }

    public void setStudent_Number(long student_Number) {
        this.student_Number = student_Number;
    }

}

public class Getter_Setter {
    public static void main(String[] args) {
        Student st = new Student();

        st.setCollage_Name("IET,Khandari Agra");
        st.setStudent_Name("Bhavesh");
        st.setStudent_id(17);
        st.setStudent_Number(80856846);

        System.out.println(st.getCollage_Name() + " : " + st.getStudent_Name() + " : " + st.getStudent_id() + " : "
                + st.getStudent_Number());
    }
}