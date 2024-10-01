package br.com.coldigogeladeiras.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import br.com.coldigogeladeiras.jdbcinterface.MarcaDAO;
import br.com.coldigogeladeiras.modelo.Marca;

public class JDBCMarcaDAO implements MarcaDAO{
	
	private Connection conexao;
	
	public JDBCMarcaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public List<Marca> buscar(){
		
		//Criação da instrução SQL para busca de todas as marcas
		String comando = "SELECT * FROM marcas";
		
		//Criação de uma lista para armazenar cada marca encontrada
		List<Marca> listMarcas = new ArrayList<Marca>();
		
		//Criação do objeto marca com valor null (ou seja, sem instanciá-lo)
		Marca marca = null;
		
		try {
			Statement stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(comando);
			
			//Enquanto houver uma próxima linha no resultado
			while(rs.next()) {
				marca = new Marca();
				int id = rs.getInt("id");
				String nome = rs.getString("nome");

				marca.setId(id);
				marca.setNome(nome);
				listMarcas.add(marca);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return listMarcas;
	}

	public List<JsonObject> buscarPorNome(String nome) {
		
		String comando = "SELECT marcas.*, marcas.nome as marca FROM marcas ";
		
		if(!nome.equals("")) {
			comando +="WHERE nome LIKE '%" + nome + "%' ";
		}
		
		comando += "ORDER BY nome ASC, marcas.nome ASC";
		
		List<JsonObject> listaMarcas = new ArrayList<JsonObject>();
		JsonObject marca = null;
		
		try {
			Statement stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(comando);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String marcaNome = rs.getString("marca");
									
				marca = new JsonObject();
				marca.addProperty("id", id);
				marca.addProperty("marcaNome", marcaNome);
				
				listaMarcas.add(marca);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return listaMarcas;
	}

	public boolean inserir(Marca marca) {
		
		String comando = "INSERT INTO marcas "
				+"(id, nome) "
				+"VALUES (?,?)";
		PreparedStatement p;
		
		try {
			p = this.conexao.prepareStatement(comando);
			p.setInt(1, marca.getId());
			p.setString(2, marca.getNome());
			p.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean deletar(int id) {
		
		String comando = "DELETE FROM marcas WHERE id = ?";
		PreparedStatement p;
		try {
			p = this.conexao.prepareStatement(comando);
			p.setInt(1, id);
			p.execute();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public Marca buscarPorId(int id) {
		
		String comando = "SELECT * FROM marcas WHERE marcas.id =?";
		Marca marca = new Marca();
		
		try {
			PreparedStatement p = this.conexao.prepareStatement(comando);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				String nomeMarca = rs.getString("nome");
				
				marca.setNome(nomeMarca);
				marca.setId(id);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return marca;
	}
	
	public boolean alterar(Marca marca) {
		
		String comando = "UPDATE marcas "
				+"SET nome=?" 
				+" WHERE id=?";
		
		PreparedStatement p;
		try {
			p = this.conexao.prepareStatement(comando);
			p.setString(1, marca.getNome());
			p.setInt(2, marca.getId());
			p.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean verificaExistencia(int id) {
		
		boolean retorno = true;
		
		String comando = "SELECT * FROM marcas WHERE id = ?";
		PreparedStatement p;
		try {
			p = this.conexao.prepareStatement(comando);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			
			if(rs.next()) {
				retorno = true;
			}else {
				retorno = false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			retorno = false;
		}
		
		return retorno;
	}
	
	public boolean verificaProdutosCadastrados(int id) {
		
		String comando = "SELECT count(*) as quantidade_produtos FROM produtos WHERE marcas_id = ?";
		PreparedStatement p;
		int quantidade_produtos = 0;
		try {
			p = this.conexao.prepareStatement(comando);
			p.setInt(1, id);			
			ResultSet rs = p.executeQuery();
			
			if(rs.next()){
				quantidade_produtos = rs.getInt("quantidade_produtos");
			}
			
			return quantidade_produtos <= 0;
			
		}catch(SQLException e) {	
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verificaMarcaExistente(Marca marca) {
		
		String comando = "SELECT marcas.nome FROM marcas";
		PreparedStatement p;
		
		try {
			p = this.conexao.prepareStatement(comando);
			ResultSet rs = p.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("nome").equals(marca.getNome())) {
					return false;
				}
			}
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
