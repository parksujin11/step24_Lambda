package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			//�������̽��� �޼ҵ�� run �ϳ�(�޼ҵ�� �ϳ�)
			@Override
			public void run() {
				System.out.println("�����忡�� A �۾�����");
				
			}
		}).start();
		
		//���� run �������̽� ���� ǥ�� 
		new Thread(()->{
			System.out.println("test!");
		}).start();
	}
}	
