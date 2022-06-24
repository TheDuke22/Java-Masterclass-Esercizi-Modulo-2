public class FormeQuadrato {
   private double lato;
    public FormeQuadrato (double l) {
        lato = l;
    }

    public static void main(String[] args) {
        FormeQuadrato quadrato = new FormeQuadrato(5);
        quadrato.getPerimetro();
        quadrato.getQuadrato();
        quadrato.stampaQuadratoPerMelvin();

    }
    public void getPerimetro(){
        double perimetro = lato*4;
        System.out.println(perimetro);
    }
    public void getQuadrato (){
        double quadrato = lato * lato;
        System.out.println(quadrato);
    }
    public void stampaQuadratoPerMelvin(){
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


}
