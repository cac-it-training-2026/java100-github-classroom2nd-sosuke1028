package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ymanotesen {

	public static void main(String[] args) throws IOException {

		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		System.out.println("「※※※ 山手線ゲーム ※※※");
		System.out.println("「　　　　　ゲームスタート！　　　　　」");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int opponent = 0;

		Boolean hitflag = false;

		int gamecount = 0;

		Boolean[] judgearray = new Boolean[stations.length];

		Arrays.fill(judgearray, true);

		do {
			String str = reader.readLine();
			for (int i = 0; i < stations.length; i++) {

				if (stations[i].equals(str)) {
					if (judgearray[i] == true) {
						hitflag = true;
						judgearray[i] = false;
						break;
					} else {
						break;
					}

				}

			}

			gamecount++;
			if (!hitflag || gamecount == stations.length) {
				break;
			}

			hitflag = false;

			do {
				opponent = (int) (Math.random() * 10) % 30;
				for (int i = 0; i < judgearray.length; i++) {

					if (judgearray[opponent]) {

						System.out.println(stations[opponent]);
						judgearray[opponent] = false;
						hitflag = true;
						break;

					}
				}

			} while (!hitflag);

			gamecount++;
			hitflag = false;

		} while (gamecount < stations.length);

		if (gamecount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}
}
