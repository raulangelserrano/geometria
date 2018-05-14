import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_RSSTest {

	@Test
	void areavalor7() {
		Circulo_RSS circulo1 = new Circulo_RSS(7,"circulo");
		double area1 = circulo1.area();
		assertEquals(153.86,area1,0.1);
	}
	@Test
	void perimetrovalor7() {
		Circulo_RSS circulo1 = new Circulo_RSS(7,"circulo");
		double perimetro1 = circulo1.perimetro();
		assertEquals(43.96,perimetro1,0.1);
	}
	@Test
	void areavalor0() {
		Circulo_RSS circulo1 = new Circulo_RSS(0,"circulo");
		double area1 = circulo1.area();
		assertEquals(0,area1,0.1);
	}
	@Test
	void perimetrovalor0() {
		Circulo_RSS circulo1 = new Circulo_RSS(0,"circulo");
		double perimetro1 = circulo1.perimetro();
		assertEquals(0,perimetro1,0.1);
	}
	@Test
	void areavalornegativo() {
		Circulo_RSS circulo1 = new Circulo_RSS(-3,"circulo");
		double area1 = circulo1.area();
		assertEquals(28.26,area1,0.1);
	}
	@Test
	void perimetrovalornegativo() {
		Circulo_RSS circulo1 = new Circulo_RSS(-3,"circulo");
		double perimetro1 = circulo1.perimetro();
		assertEquals(18.84,perimetro1,0.1);
	}

}
