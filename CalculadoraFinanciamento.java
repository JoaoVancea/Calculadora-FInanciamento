public class CalculadoraFinanciamento {
    public static void main(String[] args) {
        int valorDoCarro = 10000;
        int duracaoDoEmprestimo = 3;
        int taxaDeJuros = 5;
        int valorEntrada = 2000;

        //condição if que calcula o empréstimo ou não, caso ele seja inválido ou o valor de entrada já pague o valor do carro
        if (duracaoDoEmprestimo <= 0 || taxaDeJuros <= 0) {
            System.out.println("Erro! Você deve fazer um empréstimo de carro válido. Para mais informações, entre em contato conosco.");
        } else if(valorEntrada >= valorDoCarro) {
            System.out.println("O carro pode ser pago integralmente.");
        } else {
            int valorRestante = valorDoCarro - valorEntrada;
            int numeroDeMeses = duracaoDoEmprestimo * 12;
            int saldoMensal = valorRestante / numeroDeMeses;
            int valorJuros = (saldoMensal * taxaDeJuros) / 100;
            int pagamentoMensal = saldoMensal + valorJuros;
            
            System.out.println(pagamentoMensal);
        }
    }
}