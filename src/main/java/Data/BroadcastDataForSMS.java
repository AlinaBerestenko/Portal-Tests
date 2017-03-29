package Data;

/**
 * Created by berestenko on 29.03.17.
 */
public class BroadcastDataForSMS {
    private String ttl;
    private String text;
    private String optionText;

    public BroadcastDataForSMS(String ttl, String text, String optionText){
        this.ttl = ttl;
        this.text = text;
        this.optionText = optionText;
    }

    public String getTTL() {
        return ttl;
    }


    public String getText() {
        return text;
    }

    public String getOptionText() {
        return optionText;
    }




}
