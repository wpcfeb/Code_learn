package cn.sxt.oo;

public class ADHero extends Hero implements Mortal,AD{

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println(name+ " 这个物理英雄挂了");
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		
	}
	

}
