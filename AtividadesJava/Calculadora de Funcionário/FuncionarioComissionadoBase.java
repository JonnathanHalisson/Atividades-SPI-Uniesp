public class FuncionarioComissionadoBase {
    public String nome;
    public long cpf;
    public int percentualSobVendas;
    public double totalVendas;
    public double valorFixo;


    public FuncionarioComissionadoBase(String nome, long cpf, int percentualSobVendas, double totalVendas, double valorFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.percentualSobVendas = percentualSobVendas;
        this.totalVendas = totalVendas;
        this.valorFixo = valorFixo;
    }
    

    public double getSalario() {
        return ((totalVendas * percentualSobVendas) / 100) + valorFixo;
    }
}
