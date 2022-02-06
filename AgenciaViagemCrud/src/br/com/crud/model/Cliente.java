package br.com.crud.model;

public class Cliente {
	private int ClienteID;
	private String Nome;
	private String Telefone;
	private String Endereco;
	private String Cpf;
	
	
	
	public int getClienteID() {
		return ClienteID;
	}
	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
