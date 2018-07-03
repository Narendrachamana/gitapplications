
public class Array_Object {

	public static void main(String[] args) {

		Object []a=new Object[3];
		a[0]=10;
		a[1]="nani";
		a[2]=123.2;
		for(int i=0;i<a.length;i++)
		//for(Object i:a) {
		System.out.println(a[i]);
		}
		
	}

