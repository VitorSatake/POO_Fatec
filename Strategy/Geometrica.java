package Strategy;
import java.lang.Math;

public class Geometrica implements ICalcMedia{

    @Override
    public double CalculaMedia(double p1, double p2) {
        double media;
        media = Math.sqrt(p1*p2);
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
