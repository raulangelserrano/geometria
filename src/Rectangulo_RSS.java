/**
 * 
 * @author Raul Serrano S�nchez
 * @version 1.1
 * @since 13/15/2018
 *
 */
public class Rectangulo_RSS extends FiguraGeometrica_RSS {
	private double l1;
	private double l2;
	
	/**
	 * Extiende el constructor a�adiendo la inicializaci�n de los par�metros l1 y l2,
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
	 * area: Calcula el area del rect�ngulo
	 * @return double, devuelve el �rea del rect�ngulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Rer�metro: Calcula el per�metro del rect�ngulo
	 * @return double, devuelve el �rea del rect�ngulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
