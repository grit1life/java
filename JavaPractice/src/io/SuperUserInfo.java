package io;

public class SuperUserInfo {
	String name;
	String password;
	
	SuperUserInfo(){
		this("Unknown", "111");
	}
	SuperUserInfo(String name, String password){
		this.name = name;
		this.password = password;
	}
}
