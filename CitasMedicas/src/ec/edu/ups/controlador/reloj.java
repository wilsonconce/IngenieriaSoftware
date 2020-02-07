package ec.edu.ups.controlador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import ec.edu.ups.vista.HistorialMedico;

public class reloj {

	

	public void generarHora(HistorialMedico hm) {
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
		Runnable runnable = new Runnable() {
		    @Override
		    public void run() {
		    	
		        while (true) {
		            try {
		                Thread.sleep(50);
		                
		                hm.label.setText(formateador.format(LocalDateTime.now()));
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		};
		
		Thread hilo = new Thread(runnable);
		
		hilo.start();

	}
}
