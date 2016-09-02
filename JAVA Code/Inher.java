public class Inher {

	public static void main(String[] args) {

		VV obj = new VV();
		obj.a = 50;
		obj.b = 10;
		obj.Sum();
		System.out.println("Sum is "+obj.c);
		obj.Sub();
		System.out.println("Sub is "+obj.c);
	}

}

class Add {
	int a, b, c;

	public void Sum() {

		c = a + b;

	}
}

class VV extends Add {
	public void Sub() {
		c = a - b;

	}
}