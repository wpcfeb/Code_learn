import java.awt.*;
import javax.swing.*;
	
public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x = 100;//С��ĺ�����
	double y = 100;//С���������
	double degree = 3.14/3; //���ȡ��˴����ǣ�60��
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		if(y>500-40-30||y<0+40+40) {//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������ĸ߶�
			degree = -degree;
		}
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
		}
		
	}
	
	//���ڼ���
		void launchFrame() {
			setSize(856,500);
			setLocation(50,50);
			setVisible(true);
	//�ػ�����,ÿ�뻭25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms 1s=1000ms 1s---draw 20 times
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	//main �����ǳ���ִ�е����
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
