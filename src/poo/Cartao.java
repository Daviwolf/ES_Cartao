package poo;
/**
 * 
 * 
 * @author Daviw
 *
 *classe Cartão serve para criar o objeto cartão
 */
public class Cartao {
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * Um cartão só com nome de funcionario
	 * 
	 * @param nomeFuncionario String do nome do funcionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
    /**
     * Um cartão com 3 campos (nome de funcionario,serviço e cargo)
     * 
     * @param nomeFuncionario String do nome do funcionario
     * @param servico String do tipo de serviço
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
      * Permite alterar os serviços
      * 
      * @param servico Modifica o serviço 
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
	
	// Métodos
	 /**
	  * Põe o serviço como vazio
	  */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * Permite criar novos serviços
	 * 
	 * @param novoServico Cria novos serviços
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
	 * Despedir o funcionário
	 * 
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
