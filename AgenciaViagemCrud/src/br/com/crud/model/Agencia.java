package br.com.crud.model;

public class Agencia {
	
	private int AgenciaID;
	private String Passaporte;
	private String PrecoPromo;
	private int ClienteID;
	private Cliente cliente;
	private int DestinoID;
	private Destino destino;
	
	
	
	public int getAgenciaID() {
		return AgenciaID;
	}
	public void setAgenciaID(int agenciaID) {
		AgenciaID = agenciaID;
	}
	public String getPassaporte() {
		return Passaporte;
	}
	public void setPassaporte(String passaporte) {
		Passaporte = passaporte;
	}
	public String getPrecoPromo() {
		return PrecoPromo;
	}
	public void setPrecoPromo(String precoPromo) {
		PrecoPromo = precoPromo;
	}
	public int getClienteID() {
		return ClienteID;
	}
	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getDestinoID() {
		return DestinoID;
	}
	public void setDestinoID(int destinoID) {
		DestinoID = destinoID;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public void add(Agencia agencia) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
