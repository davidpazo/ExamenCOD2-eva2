package statustwitter;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 *
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {

        Twitter mitwitter = new TwitterFactory().getInstance();

        Query query = new Query("#Cangas");
        QueryResult result = mitwitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("9WKYJ6XIVJRVrJVcNIgs5GPFG")
                .setOAuthConsumerSecret("6UrWbAQORsDXOxP82BgTSuo23f2nQQEr228sFAK5AU0q79VP8o")
                .setOAuthAccessToken("2258833753-zZzwJ3egxm8TNsOHXfSp17m8GLPnftY2LimQgwu")
                .setOAuthAccessTokenSecret("VHvUE0RrLrgch9OjnUg8NwU117GciMG8gdZQ30LhBKzDb");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter gonzalo = tf.getInstance();
    }
}
