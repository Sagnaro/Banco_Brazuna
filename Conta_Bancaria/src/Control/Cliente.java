package Control;

public class Cliente {
//    Criando atributos da classe

    private String cliente;
    private String cpf;
    private String email;

    //    Criando um contador
    /*O Static na variável garante que o valor dela seja sempre
o mesmo/único para todas as instâncias da classe.*/
    private static int counter = 1;

//    criando um costrutor

    public Cliente(String cliente, String cpf, String email) {
        this.cliente = cliente;
        this.cpf = cpf;
        this.email = email;
        counter++;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    Retornar criando o metodo toString
    public String toString() {
        return "\nNome: " + this.getCliente() + "\nCPF: " + this.getCpf() + "\nEmail: " + this.getEmail();
    }
}
