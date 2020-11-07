package edu.cientifica.metrofacilx.model;

public class Tarjeta {
	private String idTarjeta;
	private int saldo;
	public Tarjeta(String idTarjeta, int saldo) {
		super();
		this.idTarjeta = idTarjeta;
		this.saldo = saldo;
	}
	public String getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(String idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setMonto(int saldo) {
		this.saldo = saldo;
	}
	

}
