package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		useRemocon(()->{
			System.out.println("TV�� �ѿ� ");
		});
		
		useRemocon(()->{
			System.out.println("������ �ѿ� ");
		});
		
		useRemocon(()->{
			System.out.println("���� �ѿ� ");
		});
	}
	//Remocon type �� �������� ���� �޴� �޼ҵ� 
	public static void useRemocon(Remocon r) {
		r.turnOn();
	}
}
