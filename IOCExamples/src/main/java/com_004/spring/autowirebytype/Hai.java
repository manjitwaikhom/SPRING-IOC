package com_004.spring.autowirebytype;

public class Hai {
String msg;
int no;
public void setMsg(String msg) {
	this.msg = msg;
}
public void setNo(int no) {
	this.no = no;
}

public void show()
{
	System.out.println(msg);
	System.out.println(no);
}
}
