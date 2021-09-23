
class MathClass{
	public static void main(String[] args) {
private MathClass() {
        double random = Math.random();
		int winner = (int) (random * 100) + 1;
		
		System.out.println(random);
		System.out.println(winner);
}
}
}
