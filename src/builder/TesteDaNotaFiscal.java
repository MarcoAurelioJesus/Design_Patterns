package builder;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Inovações")
		.comCnpj("111.111.111.11")
		.comItem(new ItemDaNota("x1", 100.0))
		.comItem(new ItemDaNota("x2", 200.0))
		.comItem(new ItemDaNota("x3", 300.0))
		.comItem(new ItemDaNota("x4", 400.0))
		.comObservacoes("xxxxxxxxxx,xxx,xxxx")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.observacoes + "\n" +nf.getCnpj() + "\n" + nf.getDataDeEmissao());
	}
}
