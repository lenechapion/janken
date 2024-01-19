package hit_Game;

public class GameMainApp {

	public static void main(String[] args) {
		String title = "～ Hit & Blow ～";      //タイトル
		System.out.println(title);
		//ルール説明
		System.out.println("隠された４つの数字を当てます");
		System.out.println("１つの数字は”０～４”です。");
		System.out.println("答えに同じ数字は存在しません。");
		System.out.println("入力した数字の");
		System.out.println("位置と場所が一致していれば”ヒット”");
		System.out.println("数字だけ合ってたら”ブロー”");
		System.out.println("全て一致すればしていれば（４つともヒット）");
		System.out.println("ゲームクリアとなります");
		
		int[] answer = new int[5];   //答え
		int[] input = new int[5];   //入力した答え
		
		int hit = 0;                //ヒットのカウント
		int blow = 0;               //ブローのカウント
		int count = 0;              //チャレンジのカウント
		
		
		
		for(int i = 0; i < answer.length; i++) {   //ランダムな答え作成
			boolean flag = false;               //同じ数字が無いようにすること
			answer[i] =  (int) Math.random();  //自分より前のかぶる数字がないか
			                                    //あったら再抽選
			do {
				flag = false;
				for(int j = i-1; j > 0; i--) {
					if(answer[i] == answer[j]) {
						flag = true;	
					}
				}while(flag == true) {
			
			System.out.println(count + "回目");
			for(int k = 0; k < answer.length; k++) {
				System.out.println(( k + 1) + "個目");
				
					
				
			}
		}
		
		
		
		
		
		
	}

}
