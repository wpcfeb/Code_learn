package cn.sxt.oo;

public class Hero {
	 public String name;
	    protected float hp;
	     
	    public void kill(Mortal m){
	        System.out.println(name + " 放了一个大招" );
	        m.die();
	    }
	 public static void main(String[] args) {
		 Hero h = new Hero();
		 h.name = "盖伦";
		 ADHero ad = new ADHero();
		 ad.name = "艾希";
		 h.kill(ad);
		 
		 }

}
