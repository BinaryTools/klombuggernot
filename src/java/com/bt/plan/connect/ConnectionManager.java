package com.bt.plan.connect;

import com.config.Defaults;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleConnectionPoolDataSource;
 
public class ConnectionManager  extends com.xpc.connect.ConnectionManager {

    private static OracleConnectionPoolDataSource dataSource = null;
    private static Connection con = null;
    /*  protected String AddrIp = "64.76.51.13";
     protected String PortNo = "1521";
     protected String Driver = "thin";
     protected String User = "";
     protected String Pass = "";
     protected String Database = ""; */

    public static synchronized Connection getConnection() throws SQLException {
        Connection retorno = null;
        /*
         if ((dataSource != null)  &&  (!com.bt.xprac.util.D.TryConnection(con))) {
         try {
         System.out.print("***** Reconectando");
         con.close();
         con = null;
         } catch (Exception e) {}
         dataSource = null;
         }
         */
        if (dataSource == null) {
            dataSource = new OracleConnectionPoolDataSource();
            dataSource.setDriverType(Defaults.DRIVER_TYPE);
            dataSource.setPortNumber(Defaults.CONNECT_PORT);
            dataSource.setDatabaseName(Defaults.SERVICE_PLAN);
            dataSource.setServerName(Defaults.IP_PRODUCTION);
            dataSource.setUser(Defaults.USER_PLAN);
            dataSource.setPassword(Defaults.PASS_PLAN);
            con = dataSource.getConnection();
        } else {
            if (MUST_CLOSE || con == null) {
                con = dataSource.getConnection();
            }
        }
        retorno = con;
        return retorno;
    }
}
