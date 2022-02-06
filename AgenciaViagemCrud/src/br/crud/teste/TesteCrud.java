package br.crud.teste;

import br.com.crud.dao.AgenciaDAO;
import br.com.crud.dao.ClienteDAO;
import br.com.crud.dao.DestinoDAO;
import br.com.crud.model.Agencia;
import br.com.crud.model.Cliente;
import br.com.crud.model.Destino;


public class TesteCrud {

	public static void main(String[] args) {
		
		DestinoDAO destinoDAO = new DestinoDAO();
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		AgenciaDAO agenciaDAO = new AgenciaDAO();
		
		
		Cliente cliente = new Cliente();
		
		
		Destino destino = new Destino();
		
		Agencia agencia = new Agencia();
		
		
		
		

        //OPERAÇÕES NA TABELA AGENCIA
          
        //INSERT
			
		agencia.setPassaporte("Ok");
		agencia.setPrecoPromo("300rs");
		agencia.setClienteID(3);
		agencia.setDestinoID(3);
		
		
		agenciaDAO.save(agencia);
		
		//UPDATE
		
		agencia.setPassaporte("Negado");
		agencia.setPrecoPromo("Negado");
		agencia.setClienteID(2);
		agencia.setDestinoID(2);
		agencia.setAgenciaID(4);
		agenciaDAO.update(agencia);

		//DELETE
		agenciaDAO.removeById(5);
		
		//SELECT
		for (Agencia a: agenciaDAO.getAgencia()) {
			System.out.println("Passaporte: " + a.getPassaporte());
			System.out.println("Preço Promoção: " + a.getPrecoPromo());
			System.out.println("Cliente: " + a.getClienteID());
			System.out.println("Destino: " + a.getDestinoID());
		}

		//OPERAÇÕES NA TABELA DESTINO
		  
		//INSERT
		
		destino.setPais("França");
		destino.setData("22/02/22");
		destino.setHorario("10h");
		
		destinoDAO.save(destino);
		 
	    //UPDATE
		
		destino.setPais("Africa");
		destino.setData("01/01/01");
		destino.setHorario("08h");
		destino.setDestinoID(1);
		
		destinoDAO.update(destino);
		
		//DELETE
		
		destinoDAO.removeById(1);
		
		//SELECT
		
		
		for (Destino d: destinoDAO.getDestino()) {
			System.out.println("País: " + d.getPais());
		}
		 
		
		//OPERAÇÕES NA TABELA CLIENTE
		
		
		//INSERT
		
		cliente.setNome("Naruto Uzumaki");
		cliente.setTelefone("119999999");
		cliente.setEndereco("Japão Japones");
		cliente.setCpf("2992299229");
		
		clienteDAO.save(cliente);
		
		
		
		//UPDATE
		
		cliente.setNome("Marcos Quiesa");
		cliente.setTelefone("77777777");
		cliente.setEndereco("Brasil");
		cliente.setCpf("8888888");
		cliente.setClienteID(1);
		clienteDAO.update(cliente);
		
		
		//Delete
		clienteDAO.removeById(1);
		
		//Select
		
		for (Cliente c: clienteDAO.getCliente()) {
			System.out.println("Nome: " + c.getNome());
		}
		
		
	}

}
