package student_code.kettle;

public class App {


    public static void main(String[] args) {

        Kettle kettle = new Kettle(1, "Black", "x10", "Glass");
        useKettle(kettle);
        //kettle.boil();
        Samovar samovar = new Samovar();
        //samovar.boil();
        useKettle(samovar);
    }

    public static void useKettle (Boilable boilable){
        boilable.boil();
    }
}
