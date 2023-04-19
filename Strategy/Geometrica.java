package Strategy;
import java.lang.Math;

public class Geometrica implements ICalcMedia{

    @Override
    public double CalcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String Situacao() {
        return sqrt(p1+p1);
    }
}
