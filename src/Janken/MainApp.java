package Janken;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		while (true) {
			System.out.println("**あなたのじゃんけんの手を入力して下さい**");
			System.out.println("(０：グー，１：チョキ、２：パー) >> ");

			int user = oneselfUser();
			int cpu = opponentCpu();
			String result = judgeJanken(user, cpu);
			showResult(user, cpu, result);

			System.out.println();
			System.out.print("【続けますか？】");
			System.out.print("1：はい　2：いいえ >>");
			int end = new Scanner(System.in).nextInt();
			if (end == 2) {//終了
				System.out.println("終了しました");
				break;
			}
		}
	}

	public static int oneselfUser() {

		Scanner ready = new Scanner(System.in);

		while (true) { // 無限ループ

			if (ready.hasNext()) { // 入力データが整数判定

				int number = ready.nextInt(); // 入力データを整数で読込

				if (number <= -1 || number >= 3) { // 整数0～2のみ有効

					System.out.println("【エラー】入力できるのは「０～２」です");
					continue; //やり直し
				} else {
					return number;
				}
			}
		}
	}

	public static int opponentCpu() {
		Random rand = new Random(); // 乱数準備

		return rand.nextInt(3);
	}

	public static String judgeJanken(int user, int cpu) {
		String result = ""; // 勝負結果

		if ((user == 0 && cpu == 1) || (user == 1 && cpu == 2) || (user == 2 && cpu == 0)) {
			result = "勝ち";
		} else if ((user == 0 && cpu == 2) || (user == 1 && cpu == 0) || (user == 2 && cpu == 1)) {
			result = "負け";
		} else {
			result = "引き分け";
		}

		return result;
	}

	public static void showResult(int user, int cpu, String result) {
		String[] janken = { "グー", "チョキ", "パー" };

		System.out.println(">>あなた：" + janken[user]);
		System.out.println(">>ＣＰＵ：" + janken[cpu]);
		System.out.println("---結果：" + result + "---");

	}

}
