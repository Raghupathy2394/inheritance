/*package inheritance;

class Lap {

int nosystems=4;
void system() {
	
	System.out.println("hp" + " dell"+ " asus"+ " acer");
}
void best() {
	System.out.println("best:" +"hp");
}}
class Tap extends Lap{
	boolean good=true;
	}
public class Inher {
public static void main(String[] args) {
	Tap obj=new Tap();
	System.out.println("system; " +obj.nosystems);
	obj.system();
	obj.best();
     System.out.println(obj.good);

	}

}*/
// single inheritance//
/*
package inheritance;
class parent{
	int a;
	void show()
	{
		System.out.println("in showing");
	}
}
class child extends parent{
	int b;
	void disp() {
		System.out.println("in displaying");
	}
}
	public class Inher {
		public static void main(String[] args) {
child obj=new child();
obj.a=5;
obj.b=6;
System.out.println(obj.a);
System.out.println(obj.b);
obj.disp();
obj.show();
		}}   */ 

/*
//multilevel///
package inheritance;
class Grandparent{
	int a;
	void show()
	{
		System.out.println("in showing");
	}
}
class parent extends Grandparent{
	int c;
	void play() {
		System.out.println("in playing");
	}
}
class child extends parent{
	int b;
	void disp() {
		System.out.println("in displaying");
	}
}
	public class Inher {
		public static void main(String[] args) {
child obj=new child();
obj.a=5;
obj.b=6;
obj.c=8;
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
obj.disp();
obj.show();
obj.play();
}}*/

//////hyerarchical

package inheritance;
class A{
	void deer() {
		System.out.println("catch the deer");
}}
class B extends A{
	void tiger() {
		System.out.println("Tiger");
	}}
class C extends A{
		void lion() {
			System.out.println(" Lion");}}
	public class Inher {
		public static void main(String[] args) {
			B obj=new B();
			obj.tiger();
			obj.deer();
		C ob=new C();
		
	//	ob.lion();
	//  ob.deer();
		
		}}
		