package lambda;

import java.util.Arrays;
import java.util.List;

public class Sample22 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,5,6,7,10);
		
		list.forEach(x -> Writer.doWrite(x));
		System.out.println();
		list.forEach(Writer::doWrite);
	}

}

class Writer{
	public static void doWrite(Object msg) {
		System.out.println(msg+"번");
	}
}
