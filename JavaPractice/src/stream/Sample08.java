package stream;

import java.util.stream.IntStream;

public class Sample08 {

	public static void main(String[] args) {
		
		IntStream.range(12, 19).forEach(i -> System.out.print(" "+i));
		System.out.println();
		IntStream.rangeClosed(12, 18).forEach(i -> System.out.print(" "+i));
	}
}
