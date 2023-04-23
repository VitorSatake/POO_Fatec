package Strategy;

public class Aritmetica implements ICalcMedia{
    
    @Override
    public double CalculaMedia(double p1, double p2) {
        double media;
        media = (p1 + p2) / 2;
        return media;
    }

    @Override
    public String Situacao(double media) {
        if(media > 5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
    }
    }
}
