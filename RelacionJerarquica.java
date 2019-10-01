public class RelacionJerarquica{
	public static void main(String[] args) {
		Punto punto = new Punto(30,50);
		Circulo circulo = new Circulo(120,89,2.7);
		System.out.println("Llamado a toString de Punto con Referenciaa la superclase apuntando al objeto de la superclase.\n");
		System.out.println(punto.toString());

		System.out.println("Llamado a to String de Circulo con Referencia a ka subclase apuntando ak objeto de la subclase.\n ");
		System.out.println(circulo.toString());

		Punto refPunto = circulo;
		System.out.println("Llamado a toString de Circulo con Referencia a la supoerclase apuntado al objeto de la subclase.\n");
		System.out.println(refPunto.toString());
	}
}
