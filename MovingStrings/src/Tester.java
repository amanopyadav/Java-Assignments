import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

abstract class MovingStrings extends Frame implements Runnable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread t1;
	private int x1;
	public MovingStrings()
	{
		x1 = 200;
		t1 = new Thread(this, "t1");
		t1.start();
	}
	public void paint(Graphics g) {
		g.setFont(new Font("Tahoma", 30,30));
		g.setColor(Color.cyan);
		g.fillOval(x1, 200, 100, 100);
	}
	public void run() {
		int flag = 0;
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				if(flag==0)
					x1++;
				else if(flag==1)
					x1--;
				if(x1==this.getWidth()-100)
					flag=1;
				if(x1==0)
					flag=0;
				try {
					Thread.sleep(10);
				}catch (Exception e) {
				}
				}
			}repaint();
		}
	}
}


public class Tester{
	public static void main(Strings[] args) {
		MovingStrings ms=new MovingStrings();
		ms.setSize(500,500);
		ms.setVisible(true);
		
	}
	
}
	
