package br.com.coldigogeladeiras.rest;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import br.com.coldigogeladeiras.bd.Conexao;
import br.com.coldigogeladeiras.jdbc.JDBCMarcaDAO;
import br.com.coldigogeladeiras.jdbc.JDBCProdutoDAO;
import br.com.coldigogeladeiras.modelo.Marca;
import br.com.coldigogeladeiras.modelo.Produto;

@Path("marca")
public class MarcaRest extends UtilRest {

    @GET
    @Path("/buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscar() {
        try {
            List<Marca> listaMarcas = new ArrayList<Marca>();

            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);
            listaMarcas = jdbcMarca.buscar();
            conec.fecharConexao();
            return this.buildResponse(listaMarcas);
        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

    @GET
    @Path("/buscarMarcas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarMarcas(@QueryParam("valorBusca") String nome) {
        System.out.println("Passou por buscarMarcas");
        try {
            List<JsonObject> listaMarcas = new ArrayList<JsonObject>();

            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);
            listaMarcas = jdbcMarca.buscarPorNome(nome);
            conec.fecharConexao();

            String json = new Gson().toJson(listaMarcas);

            return this.buildResponse(json);
        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

    @POST
    @Path("/inserir")
    @Consumes("application/*")
    public Response inserir(String marcaParam) {
        try {
            System.out.println("Passou pelo inserir");
            Marca marca = new Gson().fromJson(marcaParam, Marca.class);
            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);

            boolean verificaMarcaExistente = jdbcMarca.verificaMarcaExistente(marca);

            if (verificaMarcaExistente == true) {

                boolean retorno = jdbcMarca.inserir(marca);

                String msg = "";

                if (retorno) {
                    msg = "Marca cadastrada com sucesso!";
                } else {
                    msg = "Erro ao cadastrar marca.";
                }

                conec.fecharConexao();

                return this.buildResponse(msg);
            } else {
                conec.fecharConexao();
                return this.buildResponse("Marca já existente. Tente novamente!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

    @DELETE
    @Path("/excluir/{id}")
    @Consumes("application/*")
    public Response excluir(@PathParam("id") int id) {
        try {
            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);

            boolean verificaExistencia = jdbcMarca.verificaExistencia(id);

            if (verificaExistencia == true) {
                boolean verificaContemProdutos = jdbcMarca.verificaProdutosCadastrados(id);

                if (verificaContemProdutos == true) {
                    boolean retorno = jdbcMarca.deletar(id);

                    String msg = "";
                    if (retorno) {
                        msg = "Marca excluida com sucesso!";
                    } else {
                        msg = "Erro ao excluir a Marca!";
                    }

                    conec.fecharConexao();
                    return this.buildResponse(msg);
                } else {
                    conec.fecharConexao();
                    return this.buildResponse("Erro ao excluir a Marca! ela possui itens cadastrados");
                }
            } else {
                conec.fecharConexao();
                return this.buildResponse("Erro ao excluir a Marca! ela não existe no banco de dados.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

    @GET
    @Path("/buscarPorId")
    @Consumes("application/*")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPorId(@QueryParam("id") int id) {
        try {
            Marca marca = new Marca();
            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);

            marca = jdbcMarca.buscarPorId(id);

            conec.fecharConexao();
            return this.buildResponse(marca);

        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

    @PUT
    @Path("/alterar")
    @Consumes("application/*")
    public Response alterar(String marcaParam) {
        try {
            Marca marca = new Gson().fromJson(marcaParam, Marca.class);
            Conexao conec = new Conexao();
            Connection conexao = conec.abrirConexao();
            JDBCMarcaDAO jdbcMarca = new JDBCMarcaDAO(conexao);

            System.out.println("marcaparam: " + marcaParam);

            boolean retorno = jdbcMarca.alterar(marca);

            String msg = "";

            if (retorno) {
                msg = "Marca alterada com sucesso!";
            } else {
                msg = "Erro ao alterar a marca.";
            }

            conec.fecharConexao();
            return this.buildResponse(msg);

        } catch (Exception e) {
            e.printStackTrace();
            return this.buildErrorResponse(e.getMessage());
        }
    }

}
