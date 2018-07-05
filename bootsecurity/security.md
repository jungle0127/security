#CSRF
- Cross-Site Request Forgery
Http无状态请求： Http的第一次请求都是独立无关之前操作的。
	但每次Http请求都会将本域下的所有cookie作为http请求头的一部分发送给服务端，服务器就可以取得保存在cookie中的sessionid.
	Sessionid也可以保存在其他地方，内存，reids, mongoDB

- CSRF攻击
	在用户不知情的情况下，利用保存在cookie中的session信息攻击已登录的网站。
- CSRF防御
	* 通过refer,token或者验证码来检测用户提交
	* 尽量不要在页面链接中暴露用户信息
	* 对面用户修改删除等操作尽量使用post
	* 避免全站通知cookie,严格设置cookie域

#XSS
- Cross-Site Scripting
是网站安全漏洞攻击，是代码注入的一种。
如发帖中包含JS代码。
- XSS防御
	* 在不需要HTML输入的地方对HTML标签及一些特殊字符做过滤
	* 
