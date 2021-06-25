package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sample11 {

	public static void main(String[] args) {
		int[] numbers = IntStream.rangeClosed(1, 100).toArray();
		
		Arrays.stream(numbers).forEach((x) -> System.out.println(x));

		List<String> list = Arrays.asList("빵형", "광명컴쟁이");
		Object[] results = list.stream().toArray();
		Arrays.stream(results).forEach(x-> System.out.println(x));
		
	}

}
