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
5.登录、退出功能  
&emsp;访问登录页面  
&emsp;登录  
&emsp;退出  
6.显示登录信息  
&emsp;拦截器  
&emsp;&emsp;请求开始时查询登录用户  
&emsp;&emsp;本次请求中持有用户信息  
&emsp;&emsp;在模板视图上显示用户信息  
&emsp;&emsp;请求结束时清理用户数据  
7.账号设置  
&emsp;上传文件  
&emsp;&emsp;通过MultipartFile上传文件  
&emsp;修改密码  
8.检查是否处于登录状态访问  
&emsp;拦截所有请求，处理带有自定义注解的方法    



