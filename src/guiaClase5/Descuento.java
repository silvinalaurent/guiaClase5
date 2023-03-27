package guiaClase5;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Descuento {

		private Date comienzo;
		private Date fin;
		private float valor;
		
		
		public abstract float getValor();
		public abstract void setValor(float valor);
		public abstract float descuento(float base);
		
}

