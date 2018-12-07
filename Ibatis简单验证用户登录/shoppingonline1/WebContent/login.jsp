<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<form name="loginform" method="post" action="UserServlet" id="loginform">
		<br />
		<input type="hidden" name="method" value="submitTable"/>
			<div class="login_panel">
			    <div>
			    	<span class="hint" id="login_error"></span>
			    </div>
				<div class="right_panel">
					<div class="login_frame_border">
						<div class="login_frame">
							<div class="login_title">
								<font color="red">${message}</font>还不是商城用户？&nbsp;&nbsp;<a href="register.action">立即注册</a>
							</div>
							<div class="login_frist clearfix" id="user_div_name">
								<label>登录名</label> 
								<span class="login_input"> 
									<input name="loginName" type="text" maxlength="40" id="loginName" class="tip"/>
								</span> 
								<span class="hint" id="login_loginname_error" style="display: none"></span> 
							</div>
							<p class="clearfix" id="password_div">
								<label>密&nbsp;&nbsp;码</label> 
								<span class="login_input">
									<input name="password" type="password" maxlength="20" id="password"/>
								</span> 
								<span class="hint" id="login_password_error" style="display: none"></span> 
								<span class="hint" id="passwordMessage" style="display: block">请输入6-16位密码</span>
							</p>
							<div class="login_btn" id="submit_signin_div">
								<input id="btnSignCheck" type="submit" value="登 录" style="width: 94px; height: 27px; float: left; 
 									"/>
									&nbsp;&nbsp;
							</div>
						</div>
					</div>
				</div>
			</div>
	</form>
</body>
</html>