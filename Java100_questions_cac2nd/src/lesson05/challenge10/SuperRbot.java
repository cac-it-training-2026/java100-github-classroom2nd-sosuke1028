package lesson05.challenge10;

import java.util.Arrays;

// --- 既存のRobotクラス (変更なし) ---
class Robot {
	int energy;
	int water;
	String name;
	int eggNum;
	int butterNum;
	int flourNum;
	int sugarNum;

	public void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}

	public void pumpwater() {
		System.out.println("水を" + water + "リットル出しました。");
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void makeOmelet(int eggNum, int butterNum) {
		double judge = (double) eggNum / butterNum;
		if (judge == 0.4) {
			System.out.println(eggNum / 2 + "人分のオムレツを作成しました。");
		}
	}

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		int flour = flourNum - 170;
		int sugar = sugarNum - 50;
		int egg = eggNum - 2;
		int butter = butterNum - 80;

		if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0))
			return "クッキー";
		if ((egg >= 0) && (butter >= -75))
			return "オムレツ";
		if (egg >= -1)
			return "ゆで卵";
		return null;
	}
}

class SuperRobot extends Robot {
	// 独自の豪華料理メソッド: フルコース作成
	public void makeFullCourse(int[] ingredients) {
		System.out.println("【SuperRobot】高級フルコース調理を開始します...");

		// 配列の中身(小麦粉, 砂糖, 卵, バター)が一定以上あれば豪華になる
		if (ingredients[0] >= 500 && ingredients[2] >= 10) {
			System.out.println("特製デコレーションケーキとオムライスセットが完成しました！");
		} else {
			System.out.println("材料が少し足りませんが、心を込めたスペシャルプレートが出来ました！");
		}
	}
}

class ClearRobot {
	void clearTable(int[] ingredients) {
		Arrays.fill(ingredients, 0);
	}
}