package iter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import vo.Member;

public class IterPractice {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("멸치", "참치", "고등어", "연어");
		for(String val : list) {
			System.out.println(val);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		List<Member> mList = Arrays.asList(new Member("홍길동", "hong", 30),
											new Member("고길동", "ko", 40),
											new Member("김길동", "kim", 20));
		
		Iterator<Member> mIter = mList.iterator();
		while(mIter.hasNext()) {
			Member vo = mIter.next();
			System.out.printf("%s, %s, %d\n", vo.getName(), vo.getId(), vo.getAge());
		}
		System.out.println();
		
		for(Member info : mList) {
			System.out.printf("%s, %s, %d\n", info.getName(), info.getId(), info.getAge());
		}
		System.out.println();
		
		Stream<Member> stream = mList.stream();
		stream.forEach((e)->System.out.printf("%s, %s, %d\n", e.getName(), e.getId(), e.getAge()));
	}

}
