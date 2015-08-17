package phone;


// @ConfigurationProperties(prefix="bestBuy")
public class BestByConfig{
    private String developerKey;
    private String test;

    public String getDeveloperKey(){
    return this.developerKey;
    }
}