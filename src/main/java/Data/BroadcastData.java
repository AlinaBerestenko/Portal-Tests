package Data;

/**
 * Created by berestenko on 20.03.17.
 */
public class BroadcastData {

    private String ttl;
    private String text;
    private String title;
    private String actionUrl;
    private String caption;
    private String imageUrl;
    private String iosExpirityText;

    public BroadcastData(String ttl) {
        this.ttl = ttl;
    }

    public BroadcastData(String ttl, String text) {
        this.ttl = ttl;
        this.text = text;
    }

    public BroadcastData(String ttl, String text, String title){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
    }

    public BroadcastData(String ttl, String text, String title, String actionUrl){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
        this.actionUrl = actionUrl;
    }

    public BroadcastData(String ttl, String text, String title, String actionUrl, String caption){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
        this.actionUrl = actionUrl;
        this.caption = caption;
    }

    public BroadcastData(String ttl, String text, String title, String actionUrl, String caption, String imageUrl){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
        this.actionUrl = actionUrl;
        this.caption = caption;
        this.imageUrl = imageUrl;
    }

    public BroadcastData(String ttl, String text, String title, String actionUrl, String caption, String imageUrl, String iosExpirityText){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
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

    public String getTitle() {
        return title;
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
