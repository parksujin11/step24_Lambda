package test.main;

import test.mypac.PrintMsg;

public class MainClass02 {
	public static void main(String[] args) {
		usePrint(new PrintMsg(){

			@Override
			public void print(String msg) {
				System.out.println("출력:"+msg);
				
			}
			
		});
		//위에꺼 람다식으로 줄인 표현 람다식은 2년정도됨 어려우면 안쓰면 되여 
		usePrint((msg)->{
			System.out.println("출력2:"+msg);
		});
	}
	public static void usePrint(PrintMsg p) {
		p.print("hello");
	}
}
