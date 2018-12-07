package cn.web.shopping.entity;
  
/* ec_User映射实体类
 * 
 * 
 */
public class User {
  private int id;  //驼峰命名
  private String loginName;
  private String password;
  private String name;
  private int sex;
  private String email;
  private String phoneNo;
  private String address;
  public int getId() {
	return id;
   }
  public void setId(int id) {
	this.id = id;
   }
  public String getLoginName() {
	return loginName;
   }
  public void setLoginName(String loginName) {
	this.loginName = loginName;
   }
  public String getPassword() {
	return password;
   }
  public void setPassword(String password) {
	this.password = password;
   }
  public String getName() {
	return name;
   }
  public void setName(String name) {
	this.name = name;
   }
  public int getSex() {
	return sex;
   }
  public void setSex(int sex) {
	this.sex = sex;
   }
  public String getEmail() {
	return email;
   }
  public void setEmail(String email) {
	this.email = email;
   }
  public String getPhoneNo() {
	return phoneNo;
   }
  public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
   }
  public String getAddress() {
	return address;
   }
  public void setAddress(String address) {
	this.address = address;
   }  
   }
