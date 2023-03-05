import java.util.Random;

public class ExceptionMain {
    public static void main(String[] args)  {
        System.out.println("年金受給または納付者を判定します。");

        // 乱数生成
        Random rnd = new Random();

        try {
            //繰り返し処理
            for (int i = 0; i < 10; i++) {

                //20~125までの値を出力
                int age = rnd.nextInt(20, 126);

                //条件分岐
                if (age < 65){
                    System.out.println(age + "歳、年金納付者です。");
                } else if (age < 119) {
                    System.out.println(age + "歳、年金受給者です。");
                } else {
                    throw new RuntimeException();
                }
            }

        } catch (RuntimeException e) {
            System.out.println("入力値が不正です。");
        } finally {
            System.out.println("処理を終了します。");
        }
    }
}
