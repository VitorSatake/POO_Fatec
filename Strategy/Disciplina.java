package Strategy;

public class Disciplina {

    private ICalcMedia CalcMedia;
    
    private double p1 ;
    private double p2 ;
    private double Media;
    private String Nome;
    private String Situacao;


    

    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }
   

    public double getMedia() {
        return Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }

    public double getp1() {
        return p1;
    }

    public void setp1(double p1) {
        this.p1 = p1;
    }

    public double getp2() {
        return p2;
    }

    public void setp2(double p2) {
        this.p2 = p2;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    public void CalcularMedia(){

        this.CalcMedia.CalculaMedia(this.p1, this.p2);
        this.CalcMedia.Situacao(this.Media);

    }

    
    public Disciplina(Aritmetica calculo) {
    }

   

    //public void Situacao()
    //{
        
        
        
        //return 
    //}

}
