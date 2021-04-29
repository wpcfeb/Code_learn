package sliver;

/**
 * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝� 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝� Today the
 * best performance as tomorrow newest starter!
 *
 * @author : xiaomo github : https://github.com/xiaomoinfo email :
 *         xiaomo@xiaomo.info QQ : 83387856 Date : 2017/11/21 8:34 desc :
 *         Copyright(漏) 2017 by xiaomo.
 */
public class Question196 {
	abstract class X {
		public abstract void methodX();
	}

	interface Y {
		public void methodY();
	}

//	 abstract class Z extends X implements Y {
//		 	public void methodZ() {
//		 	}
//	}
	
//	 abstract class Z extends X implements Y {
//		 	abstract public void methodZ() {
//		 	}
//	}
	
	
	
	 
    class Z extends X implements Y{
    	public void methodX() {
    	}
    	public void methodY() {
    	}
    }

}
