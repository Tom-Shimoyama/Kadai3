import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        System.out.println("バレンタインで上司や目上の方へ贈るチョコ-----------");

        //mapの要素
        Map<String, String> chocolateMap = new HashMap<>();
        chocolateMap.put("フランス産", "ピエール・エルメ");
        chocolateMap.put("ベルギー産", "ゴディバ");
        chocolateMap.put("日本産", "メリーチョコレート");

        //keyのList化
        List<String> chocolateList1 = new ArrayList<>(chocolateMap.keySet());
        System.out.println(chocolateList1);

        //valueのList化
        List<String> chocolateList2 = new ArrayList<>(chocolateMap.values());
        System.out.println(chocolateList2);

        //key、valueのリスト化
        List<Object> chocolateList3 = new ArrayList<>(chocolateMap.entrySet());
        System.out.println(chocolateList3);

    }
}
