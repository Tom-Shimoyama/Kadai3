import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        System.out.println("バレンタインで上司や目上の方へ贈るチョコ-----------");

        //mapの要素
        Map<String, String> chocolateMap = new HashMap<>();
        chocolateMap.put("フランス産", "ピエール・エルメ");
        chocolateMap.put("ベルギー産", "ゴディバ");
        chocolateMap.put("日本産", "メリーチョコレート");

        //keyのList化
        List<String> choList1 = new ArrayList<>(chocolateMap.keySet());
        System.out.println(choList1);

        //valueのList化
        List<String> choList2 = new ArrayList<>(chocolateMap.values());
        System.out.println(choList2);


    }
}
