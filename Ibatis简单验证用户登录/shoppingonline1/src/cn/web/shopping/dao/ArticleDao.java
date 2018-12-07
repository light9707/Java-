package cn.web.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.web.shopping.entity.Article;

public class ArticleDao extends BaseDao {

	public List<Article> findAllArticle() {  //泛型  集合
		
		String sql = "SELECT * FROM ec_article";
		
		Connection con = super.getConnection(); //得到连接
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Article> list = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(sql); //
			rs = pstmt.executeQuery();
			//执行insert，update，delet语句
	     	//获取rs数据   （通过循环获取）
			//使用游标操作 gab
			while(rs.next()) {  // 移动数据库的游标
			//分成两部分 get set
				//获取每行数据的每一列数据
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
