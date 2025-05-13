package tekito;

public class Main {

	public static void showTriangle(int size) {
        for (int i = 4; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 改行
        }
    }

    // メインメソッド（動作確認用）
    public static void main(String[] args) {
        showTriangle(5); // 例: 5段の三角形を表示
    }
		
	}
	


