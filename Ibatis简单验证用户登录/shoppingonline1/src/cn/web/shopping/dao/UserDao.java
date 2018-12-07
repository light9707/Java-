package cn.web.shopping.dao;
import java.sql.*;
import cn.web.shopping.entity.User;

public class UserDao  extends BaseDao{
 /*用户名和密码作为判断条件:
	SELECT * FROM ec_user WHERE login_name='test1' AND PASSWORD='123456';
	*/
	public  User login(String loginName,String password) {  //user实例。如果User为空，登陆失败。反之登陆成功。
		String sql="SELECT * FROM ec_user WHERE login_name=? AND PASSWORD=?";
		User user=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//连接数据库
			 con=super.getConnection();
			//创建PreparedStament 声明操作SQL
			pstmt=con.prepareStatement(sql);
			//设置？的占位符的参数
			pstmt.setString(1,loginName);
			pstmt.setString(2,password);
			//执行sql
           rs=pstmt.executeQuery(); //用ResultSet封装  查询条件
            if(rs.next()) {  
            	user=new User();
            	user.setId(rs.getInt("id"));
            	user.setLoginName(rs.getString("login_name"));
            	user.setPassword(rs.getString("password"));
            	user.setName(rs.getString("name"));
            	user.setSex(rs.getInt("sex"));
            	user.setEmail(rs.getString("email"));
            	user.setPhoneNo(rs.getString("phone"));
            	user.setAddress(rs.getString("address"));
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeDB(con,pstmt,rs);
		}
		return user;
	}
}
