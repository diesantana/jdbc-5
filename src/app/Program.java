package app;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnectionDb();
        DB.closeConcection();

        System.out.println("Terminei");
        
    }
}