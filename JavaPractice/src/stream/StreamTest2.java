package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("고길동","김길동","이길동");
		List<String> list2 = Arrays.asList("둘리", "도우너", "마이콜");
		
		Stream.of(list1, list2).forEach(System.out::println);
		
	}

}
