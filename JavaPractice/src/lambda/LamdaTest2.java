package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaTest2 {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("출력");
		r.run();
		
		Consumer<String> cons = (name) -> System.out.println(name+"님");
		cons.accept("홍길동");
		
		Supplier<Member> supp = () -> {
			return (new Member("louw0", "홍길동"));
		};
		System.out.println(supp.get().toString());
		
		Function<Integer, String> f = (money) -> {
			return money+"원";
		};
		System.out.println(f.apply(1000));
	}

}

class Member{
	String id;
	String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}