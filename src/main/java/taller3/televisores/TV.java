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
		numTV = numTV + 1;
	}
	
	public Marca getMarca() {
		
		return marca;
	}
	
	public void setMarca(Marca marca) {
		
		this.marca = marca;
	}
	
    public int getCanal() {
		
		return canal;
	}
	
	public void setCanal(int canal) {
		
		if (this.estado == true && canal >= 1 && canal <= 120 ) {
			
			this.canal = canal;
		}
	}
	
	public int getPrecio() {
		
		return precio;
	}
	
	public void setPrecio(int precio) {
		
		this.precio = precio;
	}
	
    public int getVolumen() {
		
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		
		if (this.estado == true && volumen >= 0 && volumen <= 7 ) {
			
			this.volumen = volumen;
		}
	}
	
    public Control getControl() {
		
		return control;
	}
	
	public void setControl(Control control) {
		
		this.control = control;
	}
	
	public void turnOn() {
		
		this.estado = true;
		
	}
	
	public void turnOff() {
		
		this.estado = false;
		
	}
	
	public boolean getEstado() {
		
		return estado;
	}
	
	public void canalDown() {
		
		if (this.estado = true && this.canal >= 2) {
			
			this.canal -= 1;
		}
	}
	
    public void volumenDown() {
		
		if (this.estado = true && this.volumen >= 1) {
			
			this.volumen -= 1;
		}
	}
    
    public void canalUp() {
    	
    	if (this.estado = true && this.canal <= 119 ) {
    		
    		this.canal += 1;
    		
    	}
    }
    
    public void volumenUp() {
    	
    	if (this.estado = true && this.volumen <= 6) {
    		
    		this.volumen += 1;
    	}
    }
    
    public void setNumtv() {
    	
    	return;
    }
    
    public static int getNumtv() {
    	
    	return TV.numTV;
    }
}
