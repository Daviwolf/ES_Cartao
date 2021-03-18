package poo;
/**
 * 
 * 
 * @author Daviw
 *
 *classe Cart�o serve para criar o objeto cart�o
 */
public class Cartao {
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * Um cart�o s� com nome de funcionario
	 * 
	 * @param nomeFuncionario String do nome do funcionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
    /**
     * Um cart�o com 3 campos (nome de funcionario,servi�o e cargo)
     * 
     * @param nomeFuncionario String do nome do funcionario
     * @param servico String do tipo de servi�o
     * @param cargo String do tipo de cargo
     */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * Obter o nome de funcionario
	 * 
	 *  @return Retorna a string com o nome do funcionario
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
     /**
      * Permite alterar os servi�os
      * 
      * @param servico Modifica o servi�o 
      */
	public void setServico(String servico) {
		this.servico = servico;
	}
     /**
      * Permite alterar o cargo
      *  
      * @param cargo Modifica o cargo
      * 
      */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// M�todos
	 /**
	  * P�e o servi�o como vazio
	  */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * Permite criar novos servi�os
	 * 
	 * @param novoServico Cria novos servi�os
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * Promove novo cargo
	 * 
	 * @param novoCargo o cargo que se pretende
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * Despedir o funcion�rio
	 * 
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
