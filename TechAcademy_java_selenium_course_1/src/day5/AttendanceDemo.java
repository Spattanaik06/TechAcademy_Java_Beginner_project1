package day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Student(String Name,String Attend) {};



public class AttendanceDemo {

	public static void main(String[] args) 
	{
		List<Student> listOfStudent=Arrays.asList(new Student("Suresh","Present"),
												new Student("surya","Absent"),
												new Student("Suryabardhan","Present"));
		//if we want only present student list
		listOfStudent.stream()
		.filter(s->s.Attend().equalsIgnoreCase("Present"))
		.collect(Collectors.toList())
		.forEach(s->System.out.println(s));
		
		//if we want sorted like first present and then absent
		listOfStudent.stream().sorted((s1,s2)-> {
			if(s1.Attend().equalsIgnoreCase(s2.Attend())) return 0;
			if(s1.Attend().equalsIgnoreCase("Present")) return -1;
			else return 1;
		}).collect(Collectors.toList()).forEach(s->System.out.println(s));                                                              

	}

}
