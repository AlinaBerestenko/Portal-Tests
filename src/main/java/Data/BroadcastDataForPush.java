package Data;

/**
 * Created by berestenko on 20.03.17.
 */
public class BroadcastDataForPush {

    private String ttl;
    private String text;
    private String title;
    private String actionUrl;
    private String caption;
    private String imageUrl;




    public BroadcastDataForPush(String ttl, String text, String title, String actionUrl, String caption, String imageUrl){
        this.ttl = ttl;
        this.text = text;
        this.title = title;
        this.actionUrl = actionUrl;
        this.caption = caption;
        this.imageUrl = imageUrl;
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


}
