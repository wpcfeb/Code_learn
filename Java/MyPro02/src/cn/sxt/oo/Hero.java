package cn.sxt.oo;

public class Hero {
	 public String name;
	    protected float hp;
	     
	    public void kill(Mortal m){
	        System.out.println(name + " ����һ������" );
	        m.die();
	    }
	 public static void main(String[] args) {
		 Hero h = new Hero();
		 h.name = "����";
		 ADHero ad = new ADHero();
		 ad.name = "��ϣ";
		 h.kill(ad);
		 
		 }

}
