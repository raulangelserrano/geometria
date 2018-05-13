/**
 * 
 * @author Raul Serrano Sánchez
 * @version 1.1
 * @since 13/15/2018
 *
 */
public class Rectangulo_RSS extends FiguraGeometrica_RSS {
	private double l1;
	private double l2;
	
	/**
	 * Extiende el constructor añadiendo la inicialización de los parámetros l1 y l2,
	 * que son los lados del rectangulo
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_RSS(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	
	/**
	 * area: Calcula el area del rectángulo
	 * @return double, devuelve el área del rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Rerímetro: Calcula el perímetro del rectángulo
	 * @return double, devuelve el área del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
