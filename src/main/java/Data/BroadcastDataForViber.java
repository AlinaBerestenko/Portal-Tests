package Data;

/**
 * Created by berestenko on 28.03.17.
 */
public class BroadcastDataForViber {

    private String ttl;
    private String text;
    private String actionUrl;
    private String caption;
    private String imageUrl;
    private String iosExpirityText;

    public BroadcastDataForViber(String ttl, String text, String actionUrl, String caption, String imageUrl, String iosExpirityText){
        this.ttl = ttl;
        this.text = text;
        this.actionUrl = actionUrl;
        this.caption = caption;
        this.imageUrl = imageUrl;
        this.iosExpirityText = iosExpirityText;
    }

    public String getTTL() {
        return ttl;
    }

    public String getText() {
        return text;
    }


    public String getActionUrl() {
        return actionUrl;
    }

    public String getCaption() {
        return caption;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getIosExpirityText() {
        return iosExpirityText;
    }
}
