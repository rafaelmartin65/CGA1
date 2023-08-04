/**
 * 
 */
package HolaMundo;

/**
 * @author Rafael Martín
 * @version 1.0
 * @since 04 agosto 2023
 */
public class HolaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		System.out.println();
		System.out.println("chao!");
		
		int edad = 15;
		int tiempo = 12;
		
		@SuppressWarnings("unused")
		int y = 23;
		
		int x = edad + tiempo;
		
		String nombre = "Rafael";
		
		System.out.println("Mensaje: edad igual --> " + edad + " nombre:" + nombre );
		
		System.out.println("Resultado : " + (x + y));
		

	}

}
