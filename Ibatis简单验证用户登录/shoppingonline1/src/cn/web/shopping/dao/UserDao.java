package cn.web.shopping.dao;
import java.sql.*;
import cn.web.shopping.entity.User;

public class UserDao  extends BaseDao{
 /*�û�����������Ϊ�ж�����:
	SELECT * FROM ec_user WHERE login_name='test1' AND PASSWORD='123456';
	*/
	public  User login(String loginName,String password) {  //userʵ�������UserΪ�գ���½ʧ�ܡ���֮��½�ɹ���
		String sql="SELECT * FROM ec_user WHERE login_name=? AND PASSWORD=?";
		User user=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//�������ݿ�
			 con=super.getConnection();
			//����PreparedStament ��������SQL
			pstmt=con.prepareStatement(sql);
			//���ã���ռλ���Ĳ���
			pstmt.setString(1,loginName);
			pstmt.setString(2,password);
			//ִ��sql
           rs=pstmt.executeQuery(); //��ResultSet��װ  ��ѯ����
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
