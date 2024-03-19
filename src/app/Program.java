package app;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedSt = null;
        
        try {
            conn = DB.getConnectionDb();
            

            preparedSt = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE Id = ?"
            );
            
            preparedSt.setInt(1, 3);
            int changedRows = preparedSt.executeUpdate();

            System.out.println("Changed rows: " + changedRows);
            
            
        }catch (SQLException e) {
            throw  new DbException(e.getMessage());
        }

        System.out.println("Terminei");
        
    }
}
