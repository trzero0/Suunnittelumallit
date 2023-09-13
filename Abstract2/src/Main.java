
public class Main {

	public static void main(String[] args) {
		JasperFactory jasperfact = new OpiskelijaFactory();
		Jasper jasp = jasperfact.getJasper();
		System.out.println(jasp);
		
		jasperfact = new InsinooriFactory();
		jasp = jasperfact.getJasper();
		System.out.println(jasp);

	}

}
