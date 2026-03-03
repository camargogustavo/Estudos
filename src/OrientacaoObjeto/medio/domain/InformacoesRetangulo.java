package OrientacaoObjeto.medio.domain;

public class InformacoesRetangulo {
    private double base;
    private double altura;
    private double resultado;

    public InformacoesRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void imprime(){
        System.out.println("Informações do Retangulo");
        System.out.println("Base: "+getBase());
        System.out.println("Altura: "+getAltura());
        System.out.println("resultado"+getResultado());
    }

    public void calcularAreaR() {
        double areaTotal = base * altura;
        this.resultado = areaTotal;
    }

    public void calcularPerimetroR() {
        double perimetroTotal = 2 * (base * altura);
        this.resultado = perimetroTotal;
    }

    public double getResultado() {
        return resultado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
