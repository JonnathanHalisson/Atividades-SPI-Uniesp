public class FuncionarioComissionado {
    public String nome;
    public long cpf;
    public int percentualSobVendas;
    public double totalVendas;


    public FuncionarioComissionado(String nome, long cpf, int percentualSobVendas, double totalVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.percentualSobVendas = percentualSobVendas;
        this.totalVendas = totalVendas;
    }


    public double getSalario() {
        return (totalVendas * percentualSobVendas) / 100;
    }
}
