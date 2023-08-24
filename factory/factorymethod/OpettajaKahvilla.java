package factorymethod;


public class OpettajaKahvilla extends AterioivaOtus{

    public Juoma createJuoma(){
        return new Kahvi();
    };

}