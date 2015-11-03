import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
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
		//Facebook facebook = new FacebookFactory(createConfiguration()).getInstance();
		//facebook;
		/*facebook.setOAuthPermissions(commaSeparetedPermissions);
		facebook.setOAuthAccessToken(new AccessToken(accessToken, null));*/
		
		/*try {
			facebook.getOAuthAppAccessToken();
			facebook.postStatusMessage("Hello World from Facebook4J.");
		} catch (FacebookException e) {
			e.printStackTrace();
		}*/
	}
}