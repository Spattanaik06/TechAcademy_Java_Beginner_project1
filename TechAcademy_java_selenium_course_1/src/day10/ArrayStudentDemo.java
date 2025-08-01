package day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record  Student(String name,Integer age)
{
	
};


public class ArrayStudentDemo {

	public static void main(String[] args) 
	{
		
		List<Student> list=new ArrayList<>();
		Student s1=new Student("Suresh",24);
		Student s2=new Student("Surya",23);
		Student s3=new Student("Suryabardhan",22);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.sort((a,b)->a.age().compareTo(b.age()));
		System.out.println(list);
		
		list.sort((a,b)->a.name().compareTo(b.name()));
		System.out.println(list);
		list.sort(Comparator.comparing(Student::age));
		System.out.println(list);
		
		list.sort(Comparator.comparing(Student::age).reversed());
		
	}

}
