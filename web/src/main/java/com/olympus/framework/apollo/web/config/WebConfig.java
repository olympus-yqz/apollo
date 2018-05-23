package com.olympus.framework.apollo.web.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 22:44
 **/
@Configuration
public class WebConfig {

    @Bean
    /*
     * 负载均衡标签
     * 配置链接超时时间，重试机制
     * */
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

/*
 * java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method) ~[na:1.8.0_161]
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:79) ~[na:1.8.0_161]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_161]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_161]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_161]
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172) ~[na:1.8.0_161]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_161]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_161]
	at java.net.Socket.connect(Socket.java:538) ~[na:1.8.0_161]
	at sun.net.NetworkClient.doConnect(NetworkClient.java:180) ~[na:1.8.0_161]
	at sun.net.www.http.HttpClient.openServer(HttpClient.java:463) ~[na:1.8.0_161]
	at sun.net.www.http.HttpClient.openServer(HttpClient.java:558) ~[na:1.8.0_161]
	at sun.net.www.http.HttpClient.<init>(HttpClient.java:242) ~[na:1.8.0_161]
	at sun.net.www.http.HttpClient.New(HttpClient.java:339) ~[na:1.8.0_161]
	at sun.net.www.http.HttpClient.New(HttpClient.java:357) ~[na:1.8.0_161]
	at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:1220) ~[na:1.8.0_161]
	at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1156) ~[na:1.8.0_161]
	at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1050) ~[na:1.8.0_161]
	at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:984) ~[na:1.8.0_161]
	at org.springframework.http.client.SimpleBufferingClientHttpRequest.executeInternal(SimpleBufferingClientHttpRequest.java:78) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.AbstractBufferingClientHttpRequest.executeInternal(AbstractBufferingClientHttpRequest.java:48) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.AbstractClientHttpRequest.execute(AbstractClientHttpRequest.java:53) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.InterceptingClientHttpRequest$InterceptingRequestExecution.execute(InterceptingClientHttpRequest.java:112) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.cloud.client.loadbalancer.LoadBalancerRequestFactory$1.apply(LoadBalancerRequestFactory.java:63) ~[spring-cloud-commons-1.3.3.RELEASE.jar:1.3.3.RELEASE]
	at org.springframework.cloud.client.loadbalancer.LoadBalancerRequestFactory$1.apply(LoadBalancerRequestFactory.java:52) ~[spring-cloud-commons-1.3.3.RELEASE.jar:1.3.3.RELEASE]
	at org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient.execute(RibbonLoadBalancerClient.java:98) ~[spring-cloud-netflix-core-1.4.4.RELEASE.jar:1.4.4.RELEASE]
	at org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient.execute(RibbonLoadBalancerClient.java:80) ~[spring-cloud-netflix-core-1.4.4.RELEASE.jar:1.4.4.RELEASE]
	at org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor.intercept(LoadBalancerInterceptor.java:55) ~[spring-cloud-commons-1.3.3.RELEASE.jar:1.3.3.RELEASE]
	at org.springframework.http.client.InterceptingClientHttpRequest$InterceptingRequestExecution.execute(InterceptingClientHttpRequest.java:88) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.InterceptingClientHttpRequest.executeInternal(InterceptingClientHttpRequest.java:72) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.AbstractBufferingClientHttpRequest.executeInternal(AbstractBufferingClientHttpRequest.java:48) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.http.client.AbstractClientHttpRequest.execute(AbstractClientHttpRequest.java:53) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:660) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:621) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:295) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at com.olympus.framework.apollo.web.controller.WelcomeController.hi(WelcomeController.java:26) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_161]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_161]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_161]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_161]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:133) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:97) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:827) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:738) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:967) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:901) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:861) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:635) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846) ~[spring-webmvc-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:742) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52) ~[tomcat-embed-websocket-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.springframework.web.filter.HttpPutFormContentFilter.doFilterInternal(HttpPutFormContentFilter.java:109) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:81) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:197) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.17.RELEASE.jar:4.3.17.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:198) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:496) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:140) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:81) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:87) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:342) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:803) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:790) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1468) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_161]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_161]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-8.5.31.jar:8.5.31]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_161]

 * */