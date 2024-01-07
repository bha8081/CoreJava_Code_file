class Constructoer_Demo3 {
    String name;
    int age;

    public Constructoer_Demo3() {
        name = "Jone";
        age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Constructoer_Demo3 d = new Constructoer_Demo3();

        // d.setName("Bhavesh Yadav");
        // d.setAge(24);

        System.out.println(d.getName() + " : " + d.getAge());
    }

}