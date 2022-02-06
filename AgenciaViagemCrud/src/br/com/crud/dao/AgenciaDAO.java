package br.com.crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Agencia;
import br.com.crud.model.Cliente;

public class AgenciaDAO {
	public void save(Agencia agencia) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Agencia(Passaporte, PrecoPromo, ClienteID, DestinoID)" + "VALUES(?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, agencia.getPassaporte());

			
			pstm.setString(2, agencia.getPrecoPromo());

			
			pstm.setInt(3, agencia.getClienteID());
			
			pstm.setInt(4, agencia.getDestinoID());

			
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
		String sql = "DELETE FROM Agencia WHERE AgenciaID = ?";
		
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
	public void update(Agencia agencia) {
		String sql = "UPDATE Agencia SET Passaporte = ?, PrecoPromo = ?, ClienteID = ?, DestinoID = ? WHERE AgenciaID = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
		
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, agencia.getPassaporte());

			
			pstm.setString(2, agencia.getPrecoPromo());

			
			pstm.setInt(3, agencia.getClienteID());
			
			pstm.setInt(4, agencia.getDestinoID());

			pstm.setInt(5, agencia.getAgenciaID());

			
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
	public List<Agencia> getAgencia() {

		String sql = "SELECT * FROM Agencia";

		List<Agencia> agencias = new ArrayList<Agencia>();

		Connection conn = null;
		PreparedStatement pstm = null;

		
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			
			while (rset.next()) {
				Agencia agencia = new Agencia();

				agencia.setAgenciaID(rset.getInt("AgenciaID"));
				
				agencia.setPassaporte(rset.getString("Passaporte"));

				
				agencia.setPrecoPromo(rset.getString("PrecoPromo"));

				
				agencia.setClienteID(rset.getInt("ClienteID"));
				
				agencia.setDestinoID(rset.getInt("DestinoID"));

				
				agencias.add(agencia);
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
		return agencias;
	}
}

