package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass06 {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("�ֵ���");
		names.add("�ڼ���");
		names.add("������");
		
		for(String tmp:names){
			System.out.println(tmp);
		}
		System.out.println("-----------------");
		
		names.forEach((tmp)->{
			System.out.println(tmp);	
		});
		}
	}
