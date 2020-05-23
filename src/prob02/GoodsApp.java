package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] array = new Goods[COUNT_GOODS];
		// 상품 입력
		for(int i =0; i< COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] infos = info.split(" ");
			
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int countStock = Integer.parseInt(infos[2]);
			
			Goods g = new Goods();
			
			g.setName(name);
			g.setCountStock(countStock);
			g.setPrice(price);
			
			array[i] =g;
			
		}
	
		// 상품 출력
		for(Goods g : array) {
		System.out.println(g.getName() + ":" + g.getPrice() + ":" + g.getCountStock());
		}
		
		// 자원정리
		scanner.close();
	}
}
