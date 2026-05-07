import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    private Map<Integer, String> codes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return this.codes;    
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!(codes.containsKey(code) || codes.containsValue(country))) {
            codes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        if(codes.containsValue(country)) {
            for(Integer code: codes.keySet()) {
                if(codes.get(code).equals(country)) {
                    return code;
                }
            }
        }
        return null;
        
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(codes.containsValue(country)) {
            codes.remove(findDialingCode(country));
            codes.put(code, country);
        }
    }
}
