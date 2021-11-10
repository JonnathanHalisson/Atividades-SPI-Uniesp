import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.println("Tem salário base? s/n ");
        String base = ver.next();
        if (base.equals("n")) {
            FuncionarioComissionado f = new FuncionarioComissionado("jonnathan", 44400899955L, 10, 50000);
            System.out.print(f.nome + " seu salário é de " + f.getSalario());
        } else if (base.equals("s")) {
            FuncionarioComissionadoBase f = new FuncionarioComissionadoBase("jonnathan", 40540540544400L, 10, 50000, 500);
            System.out.print(f.nome + " seu salário é de " + f.getSalario());
        }
    }
}
