package Control;

public class Conta {
    //    Atributos da conta
    private int numeroConta;
    private Cliente cliente;
    private Double saldo = 0.0;

    private static int contadorDeContas = 1;

    public Conta(Cliente cliente) {
        this.numeroConta = contadorDeContas;
        this.cliente = cliente;
        this.saldo = saldo;
        contadorDeContas++;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //    criando metodo ToString
    public String toString() {
        return "\n Número da Conta: " + this.getNumeroConta() +
                "\n Cliente : " + this.cliente.getCliente() +
                "\n CPF : " + this.cliente.getCpf() +
                "\n Email : " + this.cliente.getEmail() +
                "\n Saldo : " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    //    implementar metodos
    public void depositar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu valor depositado com sucesso");
        } else {
            System.out.println("Não foi possivel realizar o deposito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o saque");
        }
    }

    public void transferir(Conta contaParaDeposito, Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
//            Aqui pegamos o valor que tem na conta e subtrai do valor que tem na conta
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Tranferencia realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar a transferencia!");
        }
    }

}
