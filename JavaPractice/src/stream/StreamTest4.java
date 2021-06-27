package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest4 {

	public static void main(String[] args) {
		IntStream.rangeClosed(5, 10).forEach(x -> System.out.println(x+"일"));
		
		Stream.of("가", "나", "다").forEach(x -> System.out.println(x));
		
	}

}
