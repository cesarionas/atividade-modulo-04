package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;
import br.com.crud.model.Destino;

public class DestinoDAO {
	
public void save(Destino destino) {
		

		String sql = "INSERT INTO Destino(Pais, Data, Horario)" + "VALUES(?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, destino.getPais());

			
			pstm.setString(2, destino.getData());

			
			pstm.setString(3, destino.getHorario());
			
			

			
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
	
	public void removeById(int id) {
		String sql = "DELETE FROM Destino WHERE DestinoID = ?";
		
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
	public void update(Destino destino) {
		String sql = "UPDATE Destino SET Pais = ?, Data = ?, Horario = ? WHERE DestinoID = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, destino.getPais());

			
			pstm.setString(2, destino.getData());
			

			pstm.setString(3, destino.getHorario());
			
			pstm.setInt(4, destino.getDestinoID());
			
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
	public List<Destino> getDestino() {

		String sql = "SELECT * FROM Destino";

		List<Destino> destinos = new ArrayList<Destino>();

		Connection conn = null;
		PreparedStatement pstm = null;

		
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			
			while (rset.next()) {
				Destino destino = new Destino();

				destino.setDestinoID(rset.getInt("DestinoID"));
				
				destino.setPais(rset.getString("Pais"));

				
				destino.setData(rset.getString("Data"));

				
				destino.setHorario(rset.getString("Horario"));
			
				
				destinos.add(destino);
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
		return destinos;
	}
}
