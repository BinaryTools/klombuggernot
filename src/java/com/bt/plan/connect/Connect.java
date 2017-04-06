package com.bt.plan.connect;



import com.xpc.connect.BaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class Connect extends BaseConnection {
  public Connect() {
//    if (ConnectionManager.TryConnection())
      ConnectionManager.resetConnection();
  }
  public Connection getConnection() throws SQLException {
    return ConnectionManager.getConnection();
  }
}
