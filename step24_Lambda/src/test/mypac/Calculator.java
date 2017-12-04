package test.mypac;

//메소드 수정 못하게->@Fun ctrl space
//람다 함수로 쓰일 인터페이스 라고 명시해 놓는다.
@FunctionalInterface
public interface Calculator {
	public int calc(int num1, int num2);
}

