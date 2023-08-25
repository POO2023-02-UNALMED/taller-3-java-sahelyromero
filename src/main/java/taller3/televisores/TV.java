package taller3.televisores;

public class TV {
	
	private static int numTV;
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	
	public TV (Marca obj, boolean encendido) {

		numTV++;
		marca = obj;
		estado = encendido;
	}
	
	public Marca getMarca() {
		
		return marca;
	}
	
	public void setMarca(Marca obj) {
		
		marca = obj;
	}
	
        public int getCanal() {
		
		return canal;
	}
	
	public void setCanal(int num) {
		
		if (this.estado == true) {

			if (num >= 1 && num <= 120 ) {

				canal = num;
			
			}
		}
	}
	
	public int getPrecio() {
		
		return precio;
	}
	
	public void setPrecio(int valor) {
		
		precio = valor;
	}
	
        public int getVolumen() {
		
		return volumen;
	}
	
	public void setVolumen(int num) {
		
		if (this.estado == true && num >= 0 && num <= 7 ) {
			
			volumen = num;
		}
	}
	
    public Control getControl() {
		
		return control;
	}
	
	public void setControl(Control obj) {
		
		control = obj;
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
		
		if (this.estado = true) {

			if (this.canal > 1){
				
				this.canal -= 1;
			}
		}
	}
	
    public void volumenDown() {
		
		if (this.estado = true && this.volumen > 1) {
			
			this.volumen -= 1;
		}
	}
    
    public void canalUp() {
    	
    	if (this.estado = true) {

		if (this.canal < 120){
			this.canal++;
		}
    	}
    }
    
    public void volumenUp() {
    	
    	if (this.estado = true && this.volumen < 7) {
    		
    		this.volumen += 1;
    	}
    }
    
    public static void setNumTV(int num) {
	    
	    TV.numTV = num;
    }
    
    public static int getNumTV() {
    	
    	return TV.numTV;
    }
}
