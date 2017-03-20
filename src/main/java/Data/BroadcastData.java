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



        public BroadcastData(String username){
            this.username = username;
        }

        public String getTTL() {
            return ttl;
        }

        public String getPassword() {
            return password;

        }

}
