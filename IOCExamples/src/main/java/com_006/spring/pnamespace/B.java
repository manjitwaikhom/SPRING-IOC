package com_006.spring.pnamespace;

public class B extends A{
int b;
String msg2;
public void setMsg2(String msg2) {
	this.msg2 = msg2;
}
public void setB(int b) {
	this.b = b;
}

public void showB()
{
	System.out.println(msg2);
	System.out.println(b);
	System.out.println(msg1);
	System.out.println(a);
}
}
