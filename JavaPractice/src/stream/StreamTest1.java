package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
	
	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("홍길동", 30),
									new Member("김길동", 20),
									new Member("고길동", 50));
		Stream<Member> strm = list.stream();
		strm.forEach(System.out::println);
	}
}

class Member{
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}