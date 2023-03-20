package FirstSteps;

public class Main {

	public static void main(String[] args) {
		
		No<String> no1 = new No<String>("No de string");
		No<Integer> no2 = new No<Integer>(5);
		No<Double> no3 = new No<Double>(9.3);
		
		no1.setProximo(no2);
		no2.setProximo(no3);
		
		System.out.println(no1);
		System.out.println(no1.getProximo());
		System.out.println(no1.getProximo().getProximo());
	}

}
