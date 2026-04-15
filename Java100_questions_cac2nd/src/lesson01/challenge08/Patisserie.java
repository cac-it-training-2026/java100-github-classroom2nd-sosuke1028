package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.println("シトロン>");
		String str1 = reader.readLine();
		int num1 = Integer.parseInt(str1);

		System.out.println("ショコラ>");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);

		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);

		int sum1 = (num1 + num2 + num3);

		int sum2 = (num1 * 250 + num2 * 280 + num3 * 320);

		System.out.println("シトロン" + num1 + "個");
		System.out.println("ショコラ" + num2 + "個");
		System.out.println("ピスターシュ" + num3 + "個");
		System.out.println("\n合計個数" + sum1);
		System.out.println("合計金額" + sum2 + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。");

		int stocknum1 = 30 - num1;
		int stocknum2 = 30 - num2;
		int stocknum3 = 30 - num3;

		System.out.println("シトロン      \\250 ・・・ 残り" + stocknum1 + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + stocknum2 + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + stocknum3 + "個");

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計       \\" + sum2);
		System.out.println("\n内訳");

		System.out.println("シトロン     \\" + num1 * 250 + "・・・" + (int) (num1 * 250 * 100.0) / sum2 + "％");
		System.out.println("ショコラ     \\" + num2 * 280 + "・・・" + (int) (num2 * 280 * 100.0) / sum2 + "％");
		System.out.println("ピスターシュ \\" + num3 * 320 + "・・・" + (int) (num3 * 320 * 100.0) / sum2 + "％");

	}

}
