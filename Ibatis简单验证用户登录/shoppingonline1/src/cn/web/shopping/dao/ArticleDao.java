package cn.web.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.web.shopping.entity.Article;

public class ArticleDao extends BaseDao {

	public List<Article> findAllArticle() {  //����  ����
		
		String sql = "SELECT * FROM ec_article";
		
		Connection con = super.getConnection(); //�õ�����
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Article> list = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(sql); //
			rs = pstmt.executeQuery();
			//ִ��insert��update��delet���
	     	//��ȡrs����   ��ͨ��ѭ����ȡ��
			//ʹ���α���� gab
			while(rs.next()) {  // �ƶ����ݿ���α�
			//�ֳ������� get set
				//��ȡÿ�����ݵ�ÿһ������
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String supplier = rs.getString("supplier");
				double price = rs.getDouble("price");
				String local = rs.getString("locality");
				String putawayDate = rs.getString("putaway_date");
				String image = rs.getString("image");
				double discount = rs.getDouble("discount");
				
				Article article = new Article();
				article.setId(id);
				article.setTitle(title);
				article.setSupplier(supplier);
				article.setPrice(price);
				article.setPutawayDate(putawayDate);
				article.setLocality(local);
				article.setImage(image);
				article.setDiscount(discount);
				
				list.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeDB(con, pstmt, rs);
		}
		return list;	
	}
}
