package modelo;


public class Dados {

	private boolean vuelveAjugar;
    private int combinacion[];

	public Dados() {
	    this.combinacion = new int[]{0, 0}; //Nadie tiro
		this.vuelveAjugar= true;
	}

	public boolean sonIguales(){
        return this.combinacion[0] == combinacion[1];
	}

    public void combinacionDeDados() {
        this.combinacion[0] = 1 + (int)(Math.random() * 6);
        this.combinacion[1] = 1 + (int)(Math.random() * 6);
	}

	public boolean puedeVolverAJugar(){
	    if (this.combinacion[0] == 0 ){
	        return false;
        }
        boolean puede = this.sonIguales() && this.vuelveAjugar;
        if (puede) {
            this.vuelveAjugar = false;
        }
//        this.vuelveAjugar = (puede)? false:true;
        return puede;
    }

    public int sumaDeDados() {
	    return this.combinacion[0] + this.combinacion[1];
    }
}
