package LanzaProceso;

import java.io.IOException;
import java.util.Arrays;

public class LanzaProceso {
	public static void main(String[] args) {
		if(args.length<=0) { 
			System.out.println("Debe indicarse comando a ejecutar");
			System.exit(1);
		}
		ProcessBuilder pb=new ProcessBuilder(args); //convertimos el argumento en un proceso, esto es necesario si queremos modificar, enviar datos, en el caso de solo abrir el argumento no seria necesario
		pb.inheritIO(); //este metodo no tiene control de excepciones por eso no tiene que estar dentro del try/Catch
		
		try {
			Process p=pb.start(); //arranca el proceso
			int codRet=p.waitFor(); //el programa se queda esperando, una vez acabo desvuleve un codigo
			System.out.println("La ejecucion de "+Arrays.toString(args)
			+ "devuelve "+codRet
			+" "+(codRet==0 ? "(ejecucion correcta)":"(ERROR"));
		}catch (IOException e) {
			System.err.println("Error durante la ejecución del proyecto");
			System.err.println("Información detallada");
			System.err.println("----------------------");
			e.printStackTrace();
			System.err.println("----------------------");
			System.exit(2);
			// TODO: handle exception
		} catch (InterruptedException e) {
			System.err.print("Proceso interrumpido");
			System.exit(3);
		}
		
		}

}