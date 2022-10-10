package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf+" Bir kalın sesli harf.");
			break;
			default:
				System.out.println(harf+" Bir ince sesli har.");
		
		}

	}

}
