package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn() {
		
		this.tv.turnOn();
	}
	
	public void turnOff() {
		
		this.tv.turnOff();
	}
	
	public void canalUp() {
		
		if (this.tv.estado = true && this.tv.canal <= 119 ) {
			
			this.tv.canal += 1;
    		
    	}
		
	}
	
	public void canalDown() {
		
		if (this.tv.estado = true && this.tv.canal >= 2) {
			
			this.tv.canal -= 1;
		
		}
	}
	
	public void volumenUp() {
		
		if (this.tv.estado = true && this.tv.volumen <= 6) {
			
			this.tv.volumen += 1;
		}
	}
	
	public void volumenDown() {
		
		if (this.tv.estado = true && this.tv.volumen >= 1) {
			
			this.tv.volumen -= 1;
			
		}
	}
	
	public void setCanal(int canal) {
		
		this.tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		
		this.tv.setVolumen(volumen);
	}
	
	public void enlazar(TV televisor) {
		
		this.tv = televisor;
		
		this.tv.control = this;
		
	}
	
	public TV getTV() {
		
		return this.tv;
	}
	
	public void setTV(TV tv) {
		
		this.tv = tv;
	}

}
