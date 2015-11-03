import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;
import facebook4j.conf.Configuration;
import facebook4j.conf.ConfigurationBuilder;

public class Facebook1 {
	
	public static  Configuration createConfiguration() {
	    ConfigurationBuilder confBuilder = new ConfigurationBuilder();

	    confBuilder.setDebugEnabled(true);
	    confBuilder.setOAuthAppId("1662868470624680");
	    confBuilder.setOAuthAppSecret("d789c622be4db18ad7de24b64118cd85");
	    confBuilder.setUseSSL(true);
	    confBuilder.setJSONStoreEnabled(true);
	    Configuration configuration = confBuilder.build();
	    return configuration;
	} 
	
	//PostUpdate a = new PostUpdate"hi";
	public static void main(String[] args) {
		/*Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId("1662868470624680", "d789c622be4db18ad7de24b64118cd85");
		//facebook;
		String commaSeparetedPermissions ="user_status, user_posts, publish_checkins, status_update, photo_upload, video_upload, create_note, share_item, publish_stream, publish_actions, public_profile";
		facebook.setOAuthPermissions(commaSeparetedPermissions);
		// AccessToken token=(new DefaultFacebookClient().obtainAppAccessToken("1662868470624680", "d789c622be4db18ad7de24b64118cd85"));
		facebook.setOAuthAccessToken(new AccessToken("CAACEdEose0cBAP4ZA2twlia2NJLvXaLP3SbqFp1xpDqILYQxxgZCPYzFTCOffkWN9EEEvQZAXiLZBZAUWgTZBi9gNAUNggRZBFCbuIKrSbZCjJ7po9FCIfruqeX1dTUWEeeGkOZAQHkNBNLJkMT4UlVwSdj2UgxJv6c9NB9ivV7sZCl0RBUziMf9xKkV4TU9G2ZAGgFR7JUwgYiEmrqgVZAv4bqCy1ZCBgVBET4YZD", null));
		
		try {
			//facebook.getOAuthAppAccessToken();
			facebook.postStatusMessage("Hello World from Facebook4J.");
		} catch (FacebookException e) {
			e.printStackTrace();
		}*/
		
		//"BUT IT WORKED ON MY SYSTEM!"
		//YES THIS CODE IS NOT GONNA WORK ON YOUR SYSTEM. REASONS - APP_ID, APP_SECRET AND THE ACCESS TOKENS.
		
		Facebook facebook = new FacebookFactory().getInstance();
		String appId = "1662868470624680";
		String appSecret = "d789c622be4db18ad7de24b64118cd85";
		facebook.setOAuthAppId(appId, appSecret);
		//String commaSeparetedPermissions ="user_birthday, user_location, user_likes, user_photos, user_videos, user_photo_video_tags, user_friends, user_status, user_posts, public_profile, basic_info";
		String commaSeparetedPermissions = "user_birthday, user_location, user_likes, user_photos, user_videos, user_photo_video_tags, user_friends, user_status, user_posts, publish_checkins, status_update, photo_upload, video_upload, create_note, share_item, publish_stream, publish_actions, public_profile, basic_info";
		facebook.setOAuthPermissions(commaSeparetedPermissions);
		String accessToken = "CAACEdEose0cBAI1iTjV5b8tTaDUp3DftbqsmgZCc5efJfX9gaFepssZC8lE8whqFDOaNxpJV6MiJhZANCfHBo5ugwB7h3G6PiWZA7V2VWIn1wwikKPpfwFj2uzoeI7CUElN0YsCEwZB5pwY2YjZCOv1lEJPmXwHGDViccruJFPhZAykQpvV6Qarf9Qjh87Ewqk9XocqHirdPim6TvTzGI3TBWV28jtRFFkZD";
		facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
		try {
			//facebook.postStatusMessage("Hello World from Facebook4J From Java Programming....");
			System.out.println(facebook.users().getMe().getBirthday());
			facebook.postStatusMessage("yello");			
			
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Entered Catch");
		}
	}
}