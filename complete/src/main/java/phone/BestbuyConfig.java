@ConfigurationProperties(prefix="bestBuy")
public class BestByConfig{
    private String developerKey;

    public String getDeveloperKey(){
    return this.developerKey;
    }
}