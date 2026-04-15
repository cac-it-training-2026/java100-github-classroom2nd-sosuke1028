/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.println("シトロン>");
		String str1 = reader.readLine();
		double f1 = Double.parseDouble(str1);

		System.out.println("ショコラ>");
		String str2 = reader.readLine();
		double f2 = Double.parseDouble(str2);

		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		double f3 = Double.parseDouble(str3);

		double sum1 = (f1 + f2 + f3);

		int sum2 = (int) (f1 * 250 + f2 * 280 + f3 * 320);

		System.out.println("シトロン" + f1 + "個");
		System.out.println("ショコラ" + f2 + "個");
		System.out.println("ピスターシュ" + f3 + "個");
		System.out.println("\n合計個数" + sum1);
		System.out.println("合計金額" + sum2 + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。");

		double stocknum1 = (30 - f1);
		double stocknum2 = (30 - f2);
		double stocknum3 = (30 - f3);

		System.out.println("シトロン      \\250 ・・・ 残り" + stocknum1 + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + stocknum2 + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + stocknum3 + "個");

	}

}
