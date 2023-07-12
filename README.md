# community
社区项目技术路线  
&emsp;Spring Boot：简化Spring、起步依赖、自动配置、端点监控  
&emsp;Spring、Spring MVC、MyBatis：管理项目中的对象，整合其他技术、处理浏览器请求、访问数据库(注册、登录、发帖、私信、评论)  
&emsp;Redis、Kafka、Elasticsearch：操作内存数据库(提高性能)、高性能消息队列服务器、搜索引擎  
&emsp;Spring Security、Spring Actuator：管理系统权限，提高安全性、上线后系统监控  
1.社区首页  
&emsp;开发分页组件分页显示所有帖子  
2.发送邮件功能  
&emsp;Spring Email  
&emsp;&emsp;JavaMailSender发送邮件  
&emsp;Themeleaf发送HTML邮件  
3.注册功能  
&emsp;访问注册页面  
&emsp;提交注册数据  
&emsp;&emsp;commons lang判断常用数据空值情况  
&emsp;&emsp;加salt进行MD5加密  
&emsp;激活注册账号  
4.生成验证码  
&emsp;Kaptcha生成验证码图片  

