package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			//인터페이스에 메소드는 run 하나(메소드는 하나)
			@Override
			public void run() {
				System.out.println("스레드에서 A 작업수행");
				
			}
		}).start();
		
		//위의 run 인터페이스 줄인 표현 
		new Thread(()->{
			System.out.println("test!");
		}).start();
	}
}	
