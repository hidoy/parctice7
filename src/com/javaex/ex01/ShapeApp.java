package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		
		
		sr1.draw();
		
		sr1.showInfo();
		
		//sr1의 가로크기 출력
		
	}
}

	
	