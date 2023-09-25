import java.util.Scanner;
 class MyThread implements Runnable
 {
	 private int num;
	 private Thread t1, t2;
	 public MyThread(int num)
	 {
		 this.num = num;
		 t1 = new Thread(this, "incr");
		 t2 = new Thread(this, "table");
		 t1.start();
		 t2.start();
	 }
	 
	 public void run() {
		 for(int i=1; i<10; i++)
		 {
			 if(Thread.currentThread()==t1)
				 System.out.println("increment value-"+(num+i));
			 else if(Thread.currentThread()==t2)
				 System.out.println("Table value-"+(num*i));
			 
		 }
	 }
 }
 public class Tester {
	 public static void main(String[] args) {
		 int num;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entern number-");
		 num = sc.nextInt();
		 MyThread m = new MyThread(num);
	 }
}
 