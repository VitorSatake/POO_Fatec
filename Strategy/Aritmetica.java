package Strategy;

public class Aritmetica implements ICalcMedia{
    
    @Override
    public double CalcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
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
   


