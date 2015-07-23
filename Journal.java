public class Journal {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Money m = new Money();
		m.nm = 1200; //今のお金1200円
		m.rm = 200;  //収入200円
		m.sm = 500;  //出費500円


		int money = m.getMoney();


		System.out.println("持っているお金：" + m.nm);
		System.out.println("入ったお金：" + m.rm);
		System.out.println("使ったお金：" + m.sm);
		System.out.println("残額：" + money);
	}


}
