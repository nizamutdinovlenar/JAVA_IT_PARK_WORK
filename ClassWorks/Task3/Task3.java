import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();

		for(int i = 0; i < 120; i++) {
			ages[i] = random.nextInt(120);
		i = (int)(Math.random()*120+1);
		System.out.print(i);
		Sysytem.out.println("количество людей, с возрастами от 0 до 120" + i);
		}

	}
		

	
}