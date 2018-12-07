package cn.web.shopping.dao;
import java.sql.Connection; //Connection包
import java.sql.*;

  /*
        *  具备连接关闭数据库的功能
  */
public class BaseDao {
//定义访问数据的参数：DriverName	 url username password； 均定义为常量
	public static final String DRIVERNAME="com.mysql.jdbc.Driver";//加载数据库驱动
	public static final String URL="jdbc:mysql://localhost:3306/shopdb?useUnicode=true&characterEncoding=UTF-8";
    public static final String USERNAME="root";//服务器的名字
    public static final String PASSWORD="";//密码空
 
    public Connection getConnection() {
    	Connection con=null; //con为空，然后用getConnection方法获取
    	try {
			Class.forName(DRIVERNAME);//加载驱动写法 附带Try catch
			 con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return con;
    }
    public void closeDB(Connection con,Statement stmt,ResultSet rs) {     //关闭数据库的链接
    	try {
    		if(rs!=null) {  //判断非空，从rs后stmt 再con依次关闭数据库
    			rs.close();
    		}
		 if(stmt!=null) {
			 stmt.close();
		 }
		 if(con!=null) {
			 con.close();
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
