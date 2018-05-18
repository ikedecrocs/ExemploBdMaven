package view;

import java.sql.Connection;

import controller.ComandosSql;
import controller.Conexao;
import model.GetSet;

public class Exec {
	public static void main(String args[]) {
		GetSet alunos = new GetSet();
		try {
			
			alunos.setNome("Jeferson Roberto de Lima");
			alunos.setEndereco("Av Águia de Haia, 2600");
			alunos.setBairro("Jd São Nicolau");
			
			Connection connection = Conexao.getConnection();
			ComandosSql CSQL = new ComandosSql(connection);
			
			CSQL.salvar(alunos);
			//CSQL.listar();
			//CSQL.alterar(alunos);
			//CSQL.excluir(1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
