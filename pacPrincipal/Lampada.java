package pacPrincipal;

public class Lampada {
	
	private boolean estado;
	
	public Lampada() {
		this.estado = false;
	}
	
	public void ligar() {
		if (this.estado == false) {
			this.estado = true;
		}
	}
	
	public void desligar() {
		if (this.estado == true) {
			this.estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
}