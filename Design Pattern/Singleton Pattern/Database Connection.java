
package singletonpattern;

/**
 *
 * @author Masum
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    
    private DatabaseConnection() {
        System.out.println(Connection Established);
    }
    
    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void query(String sql) {
        System.out.println(Executing Query...  + sql);
    }
}

