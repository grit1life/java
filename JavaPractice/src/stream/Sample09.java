package stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sample09 {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();
		IntStream.rangeClosed(1, 100)
				.forEach(i -> {
					boardList.add(
							new Board(i, "title "+i, "user"+i, LocalDateTime.now())
					);
				});
		boardList.forEach(System.out::println);
	}
}

class Board{
	int no;
	String title;
	String user;
	LocalDateTime createdate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public LocalDateTime getCreatedate() {
		return createdate;
	}
	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", user=" + user + ", createdate=" + createdate + "]";
	}
	public Board(int no, String title, String user, LocalDateTime createdate) {
		super();
		this.no = no;
		this.title = title;
		this.user = user;
		this.createdate = createdate;
	}
	
}