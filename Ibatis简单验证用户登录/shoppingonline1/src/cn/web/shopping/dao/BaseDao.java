package cn.web.shopping.dao;
import java.sql.Connection; //Connection��
import java.sql.*;

  /*
        *  �߱����ӹر����ݿ�Ĺ���
  */
public class BaseDao {
//����������ݵĲ�����DriverName	 url username password�� ������Ϊ����
	public static final String DRIVERNAME="com.mysql.jdbc.Driver";//�������ݿ�����
	public static final String URL="jdbc:mysql://localhost:3306/shopdb?useUnicode=true&characterEncoding=UTF-8";
    public static final String USERNAME="root";//������������
    public static final String PASSWORD="";//�����
 
    public Connection getConnection() {
    	Connection con=null; //conΪ�գ�Ȼ����getConnection������ȡ
    	try {
			Class.forName(DRIVERNAME);//��������д�� ����Try catch
			 con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return con;
    }
    public void closeDB(Connection con,Statement stmt,ResultSet rs) {     //�ر����ݿ������
    	try {
    		if(rs!=null) {  //�жϷǿգ���rs��stmt ��con���ιر����ݿ�
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
