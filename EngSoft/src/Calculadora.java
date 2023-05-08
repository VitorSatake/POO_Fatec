
public class Calculadora {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int diferenca(int a, int b){

        return a-b;
       // throw  new java.lang.UnsupportedOperationException("Erro");
    }

    public int divisao(int a, int b){

        return a/b;
        //throw  new java.lang.UnsupportedOperationException("Erro");
    }

    public int produto(int a, int b){

        return a*b;
       // throw  new java.lang.UnsupportedOperationException("Erro");
    }

    public int soma(int a, int b){

        return a+b;
        //throw  new java.lang.UnsupportedOperationException("Erro");
    }
}
