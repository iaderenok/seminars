import java.util.LinkedHashMap;
import java.util.Map;


public class prog5 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("surname","Ivanov");
        map.put("name","Ivan");
        map.put("country","Russia");
        map.put("city","Moscow");
        map.put("age",null);
        map.put("phone","384613");
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> p) {
        StringBuilder result = new StringBuilder();
        if (p == null){
            return result.toString();
        }
        for (Map.Entry<String, String> kv : p.entrySet()) {
            if (kv.getKey() == null || kv.getValue() == null){
                continue;
            }
            result.append(kv.getKey()).append(" = ").append(kv.getValue()).append(" and ");
        }
        if (result.length() > 5){
            result.delete(result.length() - 5, result.length());
        }
        return result.toString();
    }
}