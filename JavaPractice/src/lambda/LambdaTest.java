package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaTest {
	
	public static void main(String[] args) {
		//Runnable 매개변수 0 return 0
		System.out.println("===Runnable===");
		Runnable r = () -> {
			System.out.println("lambda");
			System.out.println("Start");
		};
		r.run();
		
		//Consumer 매개변수 1 return 0
		System.out.println("===Consumer===");
		Consumer<String> c = (name) -> System.out.println(name + "입니다");
		c.accept("손종호");
		
		//Supplier 매개변수 0 return 1
		System.out.println("===Supplier===");
		Supplier<Integer> year = () -> 2000;
		System.out.println(year.get()+10);
		
		//Function 매개변수 1 return 1
		System.out.println("===Function===");
		Function<Integer, String> f  = (num) -> num+"개";
		System.out.println(f.apply(4));
		
		//Predicate 매개변수 1 return 1 (boolean)
		System.out.println("===Predicate===");
		Predicate<Integer> even = (num) -> (num%2)==0 ? true: false ;
		System.out.println(even.test(4));
		
		//UnaryOperator 매개변수1개 return 1 (매개변수와 return의 자료형이 동일)
		System.out.println("===UnaryOperator===");
		UnaryOperator<String> nameAdd = (name) -> name+" 올림";
		System.out.println(nameAdd.apply("홍길동"));
		
		//Bi가 들어가면 매개변수가 1개씩 추가된다
		System.out.println("===BiConsumer===");
		BiConsumer<String, String> bc = (name1, name2) -> System.out.println(name1+"와 "+name2);
		bc.accept("철수", "영희");
		
		System.out.println("===BiFunction===");
		BiFunction<String, String, String> bf = (name1, name2) -> (name1+"와 "+name2);
		System.out.println(bf.apply("영희", "철수"));
		
		System.out.println("===BiPredicate===");
		BiPredicate<Integer, Integer> equal = (num1, num2) -> (num1==num2)?true:false;
		System.out.println(equal.test(10, 10));
		
		System.out.println("===BinaryOperator===");
		BinaryOperator<String> bo = (name1, name2) -> (name1+"와 "+name2);
		System.out.println(bo.apply("길동", "춘향"));
	}
}
