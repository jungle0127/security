# Servlet, Filter, Listener, Interceptor Introduction

##Servlet
Servlet����������ͻ�������Ķ�̬��Դ��Ҳ���ǵ�������������м���һ����ַ�س���ת������ͻᱻ���͵���Ӧ��Servlet�Ͻ��д��� 

## Filter
filter��servlet�ںܶ�ķ��漫�����ƣ�����Ҳ�в�ͬ������filter��servletһ�����������������ڷ�����ͬʱ������web.xml�е������ļ�Ҳ�ǲ��ġ� ����servlet��Ҫ���������󣬶�filter��Ҫ�����������󣬺ͷ��С�

filter�������ط�ʽ
   REQUEST��ֱ�ӷ���Ŀ����Դʱִ�й��������������ڵ�ַ����ֱ�ӷ��ʡ����ύ�������ӡ��ض���ֻҪ�ڵ�ַ���п��Կ���Ŀ����Դ��·��������REQUEST��
    FORWARD��ת������ִ�й�����������RequestDispatcher#forward()������< jsp:forward>��ǩ����ת�����ʣ�
    INCLUDE����������ִ�й�����������RequestDispatcher#include()������< jsp:include>��ǩ���ǰ������ʣ�
    ERROR����Ŀ����Դ��web.xml������Ϊ< error-page>��ʱ��������ĳ������쳣��ת����Ŀ����Դʱ����ִ�й�������

## Listener
����Application��Session��Request���󣬵���Щ�������仯�ͻ���ö�Ӧ�ļ���������
 - ServletContext������Application��
 	�������ڼ�����ServletContextListener
	���Լ�����ServletContextAttributeListener
- HttpSession������Session�� 
	�������ڼ�����HttpSessionListener
	���Լ�����HttpSessioniAttributeListener
-  ServletRequest������Request��
	�������ڼ�����ServletRequestListener
	���Լ�����ServletRequestAttributeListener
 - ��֪Session������
1��HttpSessionBindingListener����
������Ҫ������ʵ����ʵ��HttpSessionBindingListener�ӿ�
����дvalueBound()�������ⷽ�����ڵ���ʵ���౻�ŵ�Session��ʱ�������÷���
����дvalueUnbound()�������ⷽ�����ڵ���ʵ�����Session�б��Ƴ�ʱ�������÷���
2��HttpSessionActivationListener����
������Ҫ������ʵ����ʵ��HttpSessionActivationListener�ӿ�
����дsessionWillPassivate()�������ⷽ�����ڵ���ʵ���౻���л�ʱ�������÷���
����дsessionDidActivate()�������ⷽ�����ڵ���ʵ���౻�����л�ʱ�������÷���

Refer:  https://blog.csdn.net/xiaojie119120/article/details/73274759

## Interceptor
interceptor ��struts2 �ṩ��filter��