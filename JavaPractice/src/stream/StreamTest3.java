package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {

	public static void main(String[] args) {
		String[] arr1 = {"abc", "dc"};
		String[] arr2 = {"가", "나"};
		Stream.of(arr1, arr2).forEach(x-> System.out.println(Arrays.deepToString(x)));
		
		Stream.of("가나다", "라마바", "아자차").forEach(x -> System.out.println(x));
		
		Arrays.stream(arr1).forEach(System.out::println);
	}

}
