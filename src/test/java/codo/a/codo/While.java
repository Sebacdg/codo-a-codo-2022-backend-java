package codo.a.codo;

public class While {

	public static void main(String[] args) {

		int contador = 10;
		
		while(contador >=0) {
			System.out.println("contador" + contador);
			/*contador--; //si esta linea no se pone es un loop
			
			//si quiero q se corte en 3
			if(contador ==3) {
				break;
			}*/
			//si quiero que pare en una linea, salte y siga
			
			if(contador % 2 == 0) {//preguntamos si es par o impar
				System.out.println(contador + "par");
			}
			else {
				System.out.println(contador +"impar");
			}
			contador--;
		}
		

	}

}
