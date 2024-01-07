class Student {
	String studentName;
	String studentFather;
	int studentAge;

	Student(String studentName, String studentFather, int studentAge) {
		System.out.println("Constructor is create now");
		this.studentName = studentName;
		this.studentFather = studentFather;
		this.studentAge = studentAge;
	}

	public static void main(String[] args) {
		Student st1 = new Student("Raja", "Ramkishor", 24);
		Student st2 = new Student("Manoj", "kishori", 20);

		System.out.println(st1.studentName + " : " + st1.studentFather + " : " + st1.studentAge);
		System.out.println(st2.studentName + " : " + st2.studentFather + " : " + st2.studentAge);
	}
}