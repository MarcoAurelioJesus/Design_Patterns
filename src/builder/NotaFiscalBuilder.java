package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.xml.sax.helpers.ParserAdapter;

import observer.EnviadorDeEmail;
import observer.EnviadorDeImpressao;
import observer.EnviadorDeSms;
import observer.NotaFiscalDAO;

public class NotaFiscalBuilder extends EnviadorDeEmail {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		
		return this;
		
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;;
		
		return this;
		
	}
	
	public NotaFiscalBuilder naDataAtual(Calendar data) {
		this.data = data;
		
		return this;
	}
	
	public NotaFiscal constroi() {
		
		NotaFiscal nf = new  NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		new EnviadorDeEmail().enviarPorEmail(nf);
		new NotaFiscalDAO().salvarNoBando(nf);
		new EnviadorDeSms().enviarPorSms(nf);
		new EnviadorDeImpressao().imprimir(nf);
		
		
		return nf;
	}
}
