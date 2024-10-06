// Source code is decompiled from a .class file using FernFlower decompiler.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class One {
   private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
   private static final String USER = "root";
   private static final String PASS = "";

   public One() {
   }

   public static void main(String[] var0) {
      Connection var1 = null;

      try {
         var1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
         System.out.println("Connected to the database successfully!");
      } catch (SQLException var11) {
         var11.printStackTrace();
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (SQLException var10) {
            var10.printStackTrace();
         }

      }

   }
}
