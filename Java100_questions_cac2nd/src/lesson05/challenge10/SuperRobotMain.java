package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobotMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Rさん：博士、もっとすごいの作りましたよ！");
		System.out.println("G博士：ほう、SuperRobotじゃな。お手並み拝見といこうか。");

		// 入力処理
		System.out.print("\n小麦粉(g)＞");
		int f = Integer.parseInt(br.readLine());
		System.out.print("砂糖(g)＞");
		int s = Integer.parseInt(br.readLine());
		System.out.print("卵(個)＞");
		int e = Integer.parseInt(br.readLine());
		System.out.print("バター(g)＞");
		int b = Integer.parseInt(br.readLine());

		// 配列にまとめる
		int[] stocks = { f, s, e, b };

		// SuperRobotの登場
		SuperRobot sRobot = new SuperRobot();
		sRobot.makeFullCourse(stocks);

		System.out.println("\n--- 食後のお片付け ---");
		ClearRobot cRobot = new ClearRobot();
		cRobot.clearTable(stocks);

		System.out.println("残量確認：小麦粉=" + stocks[0] + "g, 卵=" + stocks[2] + "個");
		System.out.println("きれいになりました。");
	}
}
