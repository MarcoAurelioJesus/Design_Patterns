package builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoScial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String observacoes;

	public NotaFiscal(String razaoScial, String cnpj, Calendar dataDeEmissao, double voalorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		super();
		this.razaoScial = razaoScial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = voalorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	/**
	 * @return the razaoScial
	 */
	public String getRazaoScial() {
		return razaoScial;
	}

	/**
	 * @param razaoScial the razaoScial to set
	 */
	public void setRazaoScial(String razaoScial) {
		this.razaoScial = razaoScial;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the dataDeEmissao
	 */
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	/**
	 * @param dataDeEmissao the dataDeEmissao to set
	 */
	public void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	/**
	 * @return the voalorBruto
	 */
	public double getVoalorBruto() {
		return valorBruto;
	}

	/**
	 * @param voalorBruto the voalorBruto to set
	 */
	public void setVoalorBruto(double voalorBruto) {
		this.valorBruto = voalorBruto;
	}

	/**
	 * @return the impostos
	 */
	public double getImpostos() {
		return impostos;
	}

	/**
	 * @param impostos the impostos to set
	 */
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	/**
	 * @return the itens
	 */
	public List<ItemDaNota> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}

	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
