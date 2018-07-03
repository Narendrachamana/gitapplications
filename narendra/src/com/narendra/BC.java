package com.narendra;

 class ThisSup
{
int x=10;
}
class BC extends ThisSup
{
int x=20;
void put()
{
	int x=30;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(super.x);
}
public static void main(String args[]) {
	
BC obj=new BC();
obj.put();



	
}
}
