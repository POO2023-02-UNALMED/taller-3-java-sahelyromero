package taller3.televisores;

public class TV {
	
	static int numTV;
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	
	public TV (Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		numTV += 1;
	}
	
	public Marca getmarca() {
		
		return marca;
	}
	
	public void setmarca(Marca marca) {
		
		this.marca = marca;
	}
	
    public int getcanal() {
		
		return canal;
	}
	
	public void setcanal(int canal) {
		
		if (this.estado == true && canal >= 1 && canal <= 1 ) {
			
			this.canal = canal;
		}
	}
	
	public int getprecio() {
		
		return precio;
	}
	
	public void setprecio(int precio) {
		
		this.precio = precio;
	}
	
    public int getvolumen() {
		
		return volumen;
	}
	
	public void setvolumen(int volumen) {
		
		if (this.estado == true && canal >= 0 && canal <= 7 ) {
			
			this.volumen = volumen;
		}
	}
	
    public Control getcontrol() {
		
		return control;
	}
	
	public void setcontrol(Control control) {
		
		this.control = control;
	}
	
	public void turnOn() {
		
		this.estado = true;
		
	}
	
	public void turnOff() {
		
		this.estado = false;
		
	}
}
