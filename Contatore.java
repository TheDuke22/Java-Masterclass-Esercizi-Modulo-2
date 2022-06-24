public class Contatore {
    private static int count;

    public Contatore(int initialValue) {
        count = initialValue;
    }

    public static void main(String[] args) {
        Contatore conto = new Contatore(1);
        System.out.println(conto.getCount());

        conto.setContatore(10);
        System.out.println(conto.getCount());
        conto.setCount(22);
        conto.printContatore();
        conto.increaseContatore();
        conto.printContatore();
        conto.changeContatoreValue(100);
        conto.printContatore();
        conto.setContatoreTo0();
        conto.printContatore();

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int setContatore (int a){
        count = a;
        return count;
    }

    public void increaseContatore(){
        count++;
    }

    public void printContatore(){
        System.out.println(count);
    }

    public void setContatoreTo0 (){
        count = 0;
    }

    public void changeContatoreValue(int a){
        count = a;
    }
}
