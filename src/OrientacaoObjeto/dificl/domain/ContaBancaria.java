package OrientacaoObjeto.dificl.domain;

public class ContaBancaria {
    private int numeroConta;
    private double SALDO = 0;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void imprime(){
        System.out.println("Informações da Conta");
        System.out.println("Numero da Conta: "+getNumeroConta());
        System.out.println("Saldo da conta: "+getSALDO());
        System.out.println("-------------");
    }


    public void depositar(double valor){
        this.SALDO = valor + this.SALDO;
        System.out.println("Valor do saldo atualizado");
    }
    public void sacar(double valor){
        if(valor > this.SALDO){
            System.out.println("Impossivel sacar esse valor: "+valor);
            System.out.println("Saldo na sua conta é de: "+SALDO);
            return;
        } else {
            this.SALDO = SALDO - valor;
        }
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSALDO() {
        return SALDO;
    }
}
