package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;

public class ClienteDAO {
	public void save(Cliente cliente) {
		

		String sql = "INSERT INTO Cliente(Nome, Telefone, Endereco, Cpf)" + "VALUES(?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, cliente.getNome());

			
			pstm.setString(2, cliente.getTelefone());

			
			pstm.setString(3, cliente.getEndereco());
			
			pstm.setString(4, cliente.getCpf());

			
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removeById(int id) {
		String sql = "DELETE FROM Cliente WHERE ClienteID = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void update(Cliente cliente) {
		String sql = "UPDATE Cliente SET Nome = ?, Telefone = ?, Endereco = ?, Cpf = ? WHERE ClienteID = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, cliente.getNome());

			
			pstm.setString(2, cliente.getEndereco());
			
			
			pstm.setString(3, cliente.getTelefone());
			

			pstm.setString(4, cliente.getCpf());
			
			
            pstm.setInt(5, cliente.getClienteID());

			
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public List<Cliente> getCliente() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> clientes = new ArrayList<Cliente>();

		Connection conn = null;
		PreparedStatement pstm = null;

		
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			
			while (rset.next()) {
				Cliente cliente = new Cliente();

				cliente.setClienteID(rset.getInt("ClienteID"));
				
				cliente.setNome(rset.getString("Nome"));

				
				cliente.setTelefone(rset.getString("Telefone"));

				
				cliente.setEndereco(rset.getString("Endereco"));
				
				cliente.setCpf(rset.getString("Cpf"));

				
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}
}
