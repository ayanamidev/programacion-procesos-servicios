package lanzaProceso02;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class lanzarProceso {
	
	public static int MAX_TIEMPO=2000;//CONSTANTE para expresas el tiempo maximo que el programa esperara por el proceso antes de terminarlo 
	
	public static void main(String[] args) {
		
		ProcessBuilder pb=new ProcessBuilder(new String[] {"notepad.exe"});
		
		System.out.printf("Se ejecuta comando:%s\n",Arrays.toString(args));
		
		pb.inheritIO();
		pb.redirectErrorStream(true);
		
		try {
			Process p=pb.start();
			if(!p.waitFor(MAX_TIEMPO, TimeUnit.MILLISECONDS)) {
				p.destroy();
				System.out.printf("AVISO: no ha terminado en %d ms\n",MAX_TIEMPO);
			}
			
		} catch (IOException e) {
			System.err.println("Error durante la ejecucion. Infromacion detallada");
			System.err.println("--------------------");
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("--------------------");
			System.exit(1);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Proceso interrumpido");
			System.exit(2);
		}
	}
}
