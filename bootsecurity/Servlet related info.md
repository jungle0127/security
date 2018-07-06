# Servlet, Filter, Listener, Interceptor Introduction

##Servlet
Servlet是用来处理客户端请求的动态资源，也就是当我们在浏览器中键入一个地址回车跳转后，请求就会被发送到对应的Servlet上进行处理。 

## Filter
filter与servlet在很多的方面极其相似，但是也有不同，例如filter和servlet一样都又三个生命周期方法，同时他们在web.xml中的配置文件也是差不多的、 但是servlet主要负责处理请求，而filter主要负责拦截请求，和放行。

filter四种拦截方式
   REQUEST：直接访问目标资源时执行过滤器。包括：在地址栏中直接访问、表单提交、超链接、重定向，只要在地址栏中可以看到目标资源的路径，就是REQUEST；
    FORWARD：转发访问执行过滤器。包括RequestDispatcher#forward()方法、< jsp:forward>标签都是转发访问；
    INCLUDE：包含访问执行过滤器。包括RequestDispatcher#include()方法、< jsp:include>标签都是包含访问；
    ERROR：当目标资源在web.xml中配置为< error-page>中时，并且真的出现了异常，转发到目标资源时，会执行过滤器。

## Listener
监听Application、Session、Request对象，当这些对象发生变化就会调用对应的监听方法。
 - ServletContext（监听Application）
 	生命周期监听：ServletContextListener
	属性监听：ServletContextAttributeListener
- HttpSession（监听Session） 
	生命周期监听：HttpSessionListener
	属性监听：HttpSessioniAttributeListener
-  ServletRequest（监听Request）
	生命周期监听：ServletRequestListener
	属性监听：ServletRequestAttributeListener
 - 感知Session监听：
1：HttpSessionBindingListener监听
⑴在需要监听的实体类实现HttpSessionBindingListener接口
⑵重写valueBound()方法，这方法是在当该实体类被放到Session中时，触发该方法
⑶重写valueUnbound()方法，这方法是在当该实体类从Session中被移除时，触发该方法
2：HttpSessionActivationListener监听
⑴在需要监听的实体类实现HttpSessionActivationListener接口
⑵重写sessionWillPassivate()方法，这方法是在当该实体类被序列化时，触发该方法
⑶重写sessionDidActivate()方法，这方法是在当该实体类被反序列化时，触发该方法

Refer:  https://blog.csdn.net/xiaojie119120/article/details/73274759

## Interceptor
SpringMVC 中的Interceptor 拦截器主要作用是拦截用户的请求并进行相应的处理
https://www.cnblogs.com/hy928302776/articles/6956747.html

## Filter & Interceptor 区别
https://blog.csdn.net/xiaoyaotan_111/article/details/53817918
