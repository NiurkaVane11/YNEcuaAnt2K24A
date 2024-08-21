package YNFWK;

public class YNConfiguration {

    private String dbConnectionString;
    private String dbUser;
    private String dbPassword;
    private String logFilePath;
    private String logLevel;
    private String securityProtocol;
    private String apiEndpoint;

    // Constructor
    public YNConfiguration(String dbConnectionString, String dbUser, String dbPassword,
            String logFilePath, String logLevel, String securityProtocol,
            String apiEndpoint) {
        this.dbConnectionString = dbConnectionString;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.logFilePath = logFilePath;
        this.logLevel = logLevel;
        this.securityProtocol = securityProtocol;
        this.apiEndpoint = apiEndpoint;
    }

    // Métodos getter y setter para cada propiedad
    public String getDbConnectionString() {
        return dbConnectionString;
    }

    public void setDbConnectionString(String dbConnectionString) {
        this.dbConnectionString = dbConnectionString;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }
}
