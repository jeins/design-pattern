package mja.designpattern.creational.Singleton;

public class Connection {
    private String host;
    private String username;
    private String password;

    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void runSql(String query){
        System.out.println(this + " - " + query);
    }
}
