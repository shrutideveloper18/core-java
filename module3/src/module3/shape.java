package module3;

public class shape {
	void draw() {
		System.out.println("drawing a shape");
	}
}
class circle extends shape{
	void drawcircle() {
		System.out.println("drawing a circle");
	}
}
class coloredcircle extends circle{
	void drawcolouredcircle() {
		System.out.println("drawing a colored circle");
	}
}

