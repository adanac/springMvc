## 测试有以下内容
- 默认的配置文件
- web.xml中配置 context-param 与  init-param 的区别
- com.adanac.study.springmvc.web.GoController 将某个属性设置到页面
- com.adanac.study.springmvc.web.GoController 实现 EnvironmentAware 接口后，spring就将 Environment 传到了GoContoller中
- com.adanac.study.springmvc.web.LocaleController 通过拦截器，对于每个请求可以接收参数 locale=zh_CN 或 locale=en

