public class FormeCerchio {
   private double raggio;

    public FormeCerchio(double Raggio) {
        raggio=Raggio;
    }

    public static void main(String[] args) {

        FormeCerchio cerchietto = new FormeCerchio(4);
        cerchietto.getCirconferenza();
        cerchietto.getArea();

    }

    public void getCirconferenza (){
        double circonferenza = Math.PI*(raggio*2);
        System.out.println(circonferenza);
    }
    public void getArea (){
        double area = (raggio*raggio)*Math.PI;
        System.out.println(area);
    }

}
