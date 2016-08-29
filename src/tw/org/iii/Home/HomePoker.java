package tw.org.iii.Home;

import java.util.Arrays;

public class HomePoker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52]; // 0,0,...0
		int rand;
		boolean Ok;
		for (int i=0; i<poker.length; i++ ){
			do {
				rand = (int)(Math.random()*poker.length);
				// 檢查機制
				Ok = true;
				for (int j=0; j<i; j++){
					if (poker[j] == rand){
						Ok = false;
						break;
					}
				}
				
			}while (!Ok);
			poker[i] = rand;
//			System.out.println(poker[i]);
			
		}
		
		System.out.println("-----");
		// 發牌 => 4個玩家
		
		int[][] player = new int[4][13];
		for (int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
			
		}
		
		// 理牌 => 攤牌
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A","2","3","4","5",
				"6","7","8","9","10","J","Q","K"};
		for (int[] cards : player){
			Arrays.sort(cards);
			for (int card : cards){
				System.out.print(suit[card/13] + 
						value[card%13] + " ");
			}
			System.out.println();
		}

	}

}
