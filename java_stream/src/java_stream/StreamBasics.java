package java_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics 
{

	public static void main(String[] args) 
	{
		
		//creating a stream from set of values
		Stream <Integer> stream = Stream.of(10,20,30,40,50,60,70,80);
		
		//counting number of elements
		System.out.println("No. of elements: "+stream.count());
		//stream.forEach(System,out::println);
		
		Integer[] values = new Integer[] {10,20,30,14,78,100,100,50};
		//create a stream from array
		stream = Arrays.stream(values);
		
		//map
		System.out.println("Squres of" +Arrays.toString(values)+ "is as follows");
		//stream.map(num -> num*num),forEach(System.out::println);
		stream = stream.map(m->m*m);
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("First 2 elements are: ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Elements expect first 4: ");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct elements are: ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello","Stream", "Learning");
			//words.add("In java");
			
			//creating a stream from list
			Stream <String> stream1 = words.stream();
			
			//map
			System.out.println("String in Uppercase: ");
			List<String> s1 = stream1.map(str ->str.toUpperCase()).collect(Collectors.toList());
			System.out.println(s1);
			
			stream1 = words.stream();
			stream1.map(str ->str.toLowerCase()).forEach(System.out::println);
			System.out.println(words);
	}

}
