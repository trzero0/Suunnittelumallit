package factorymethod;

public class OpettajaTeella extends AterioivaOtus {
	public Juoma createJuoma(){
		return new Tee();
	};

}
