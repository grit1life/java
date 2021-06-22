package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample05{
	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		list1.add("dog");
		list1.add("cat");
		list1.add("dog");
		list1.add("cat");
		
		var list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(1);
		list2.add(5);
		list2.add(5);
		list2.add(6);
		list2.add(6);

		Stream<String> arrStrm1 = list1.stream();
		Stream<Integer> arrStrm2 = list2.stream();
		
		arrStrm1.distinct().forEach(System.out::println);
		arrStrm2.distinct().forEach(System.out::println);
	}
}