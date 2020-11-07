package edu.cientifica.metrofacilx.model;

public class Recarga {
	private int idRecarga;
	private int monto;
	public Recarga(int monto) {
		this.monto = monto;
	}
	
	public int getIdRecarga() {
		return idRecarga;
	}

	public void setIdRecarga(int idRecarga) {
		this.idRecarga = idRecarga;
	}

	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
}

