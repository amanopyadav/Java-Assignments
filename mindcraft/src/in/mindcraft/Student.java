package in.mindcraft;

public class Student {
	int age;
	String name,add, fn,mn;
	private String a;
	public Student(int e, char f, String b, String c, String d )
	{
		age = e;
		name = a;
		add = d;
		fn = b;
		mn = c;
	}
	
	public void display()
	{
		System.out.println("Student personal details");
		System.out.println("Name of the students:"+name);
		System.out.println("Roll no of student:"+add);
	}

}
