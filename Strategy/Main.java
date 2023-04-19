package Strategy;

public class Main {
    public static void main(String[] args) {

        Aritmetica calculo = new Aritmetica();
        // Geometrica calculo = new Geometrica();
        Disciplina d = new Disciplina(calculo);

        d.setNome( "Padroes de Desenvolvimento");
        d.setp1(10); d.setp2(5);
        d.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
        d.getp1(),d.getp2(), d.getMedia(), d.getSituacao()));}
    }

