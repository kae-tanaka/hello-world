public class kensyu {
	public static void main(String[] args) {
		int score = 71;
		//String judgment;
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 50) {
			System.out.println("良");
		} else if (score >= 30) {
			System.out.println("可");
		} else {
			System.out.println("不合格");
		}
		System.out.println("指定された数値は『" + judgment + "』判定ですよ");
	}
}

