# 引言

JeeSite 是一个 Java EE 企业级快速开发平台，基于经典技术组合（Spring Boot、Spring MVC、Apache Shiro、MyBatis、Beetl、Bootstrap、AdminLTE），在线代码生成功能，包括核心模块如：组织机构、角色用户、菜单及按钮授权、数据权限、系统参数、内容管理、工作流等。采用松耦合设计；界面无刷新，一键换肤；众多账号安全设置，密码策略；在线定时任务配置；支持集群，支持SAAS；支持多数据源。

JeeSite 快速开发平台的主要目的是能够让初级的研发人员快速的开发出复杂的业务功能，让开发者注重专注业务，其余有平台来封装技术细节，降低技术难度，从而节省人力成本，缩短项目周期，提高软件安全质量。

JeeSite 自开源以来已被广大爱好者用到了企业、政府、医疗、金融、互联网等各个领域中，JeeSite 依架构简单精良、易于扩展、大众思维的设计模式，深入开发者的内心，并得到一致好评，于[2016](http://www.oschina.net/project/top_cn_2016?sort=1)和[2017](http://www.oschina.net/project/top_cn_2017?sort=1)连续两年获得开源中国《最受欢迎中国开源软件》奖杯，期间也帮助了不少刚毕业的大学生作为入门教材，快速的去实践。

现在 JeeSite 4.0 来了，4.0的升级，作者结合了多年总结和经验，以及各方面的应用案例，对架构完成了一次全部重构，也纳入很多新的思想。不管是从开发者模式、底层架构、逻辑处理还是到用户界面，用户交互体验上都有很大的进步，在不忘学习成本、提高开发效率的情况下，安全方面也做和很多工作，包括：身份认证、密码策略、安全审计、日志收集。

# 快速了解 JeeSite 4.0

* **JeeSite 4.0 新特性、技术选型**

   <https://my.oschina.net/thinkgem/blog/913777>

* **JeeSite 4.0 简化MyBatis持久层开发**

   <https://my.oschina.net/thinkgem/blog/1503611>

* **JeeSite 4.0 简化业务逻辑层开发**

   <https://my.oschina.net/thinkgem/blog/1538766>

* **JeeSite 4.0 MVC层及前端组件介绍**

   <https://my.oschina.net/thinkgem/blog/1561129>

* **JeeSite 4.0 内置功能模块介绍**

   <https://my.oschina.net/thinkgem/blog/1609852>
   
   <https://my.oschina.net/thinkgem/blog/1630671>

* **JeeSite 4.0 开发文档**

   <http://jeesite4.mydoc.io>

# 快速体验

### 在线演示

* 地址：<http://demo.jeesite.net/>
* 账号：system
* 密码：admin

### 本地运行

1. 环境准备：`JDK 1.8`、`Maven 3.3`、`MySQL 5.7`
2. 下载源码：<https://gitee.com/thinkgem/jeesite4/attach_files>
3. 打开文件 /web`/src/main/resources/config/jeesite.yml` 配置JDBC连接
4. 执行脚本 /web`/bin/init-data.bat` 初始化数据库
5. 执行脚本 /web`/bin/run-tomcat.bat` 启动服务即可
6. 浏览器访问  <http://127.0.0.1:8980/js/>  账号 system 密码 admin

### 开发环境

* **开发环境部署运行调试**

   <http://jeesite4.mydoc.io/?t=267354>

* **常见问题汇总**

   <http://jeesite4.mydoc.io/?t=284210>

# 今后如何升级？

尽量不修改web项目以外的源码项目，如 jeesite-common、jeesite-modele-core，如果修改了，请 Pull Requests 上来，否则代码编码将与官方不同步，将对你的日后升级带来困难。

JeeSite的小版本（4.0.x）升级是非常便捷的，你只需要将 pom.xml 文件中的 parent.version 版本修改到最新版本即可，同版本下你可进行Maven快照强制更新，即可将最新版的依赖jar更新到本地，下面介绍一下在Eclipse里如何操作：

在web项目上右键，选择菜单 -> Maven -> Update Project...（或按Alt+F5） -> 点击 Select All 按钮 -> 选择 Force Update of Snapshots/Releases 复选框 -> 点击OK按钮即可。

如果进行相对大的版本（4.x.x）升级这里我们会附加一个声明，帮助你进行迁移操作。

# 授权协议声明

1. 已开源的代码，授权协议采用 AGPL v3 + Apache Licence v2 进行发行。
2. 您可以免费使用、修改和衍生代码，但不允许修改后和衍生的代码做为闭源软件发布。
3. 修改后和衍生的代码必须也按照AGPL协议进行流通，对修改后和衍生的代码必须向社会公开。
4. 如果您修改了代码，需要在被修改的文件中进行说明，并遵守代码格式规范，帮助他人更好的理解您的用意。
5. 在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议、版权声明和其他原作者规定需要包含的说明（请尊重原作者的著作权，不要删除或修改文件中的`@author`信息）。
6. 您可以应用于商业软件，但必须遵循以上条款原则（请协助改进本作品）。
7. 关系平台的发展战略考虑，底层部分代码暂未开源，但这不影响您的二次开发。
8. 请知悉社区版，用户数不可超过100个，最大允许10个用户同时在线（不含匿名）。

### 获得技术服务支持：<http://jeesite4.mydoc.io/?t=267685>

* 随着JeeSite发展，我们也需要有相应的资金支持才能持续的开发和维护。支持我们，您可以得到一些回报，我们有了这些也会把开源事业做的更好，请给我们一些动力吧，谢谢您的支持！

# 技术交流方式

* QQ 群号： `127515876(已满)` `209330483(已满)` `223507718(已满)` `709534275` `730390092`
* 入群须知：目前为付费群，刚入群会有5分钟禁言，腾讯预设置的，无法解除，稍等片刻即可正常发言；由于群容量有限，为了维持运营千人QQ群的所需支付的QQ年费会员费用，故开启付费入群模式，申请者只需支付少量金额即可加入，这样也可以保证只有真实交流需求的人进入，避免闲杂做广告人员的乱入；新手提问前，请先阅读此[【文章】](http://www.dianbo.org/9238/stone/tiwendezhihui.htm)。
* Gitee：<https://gitee.com/thinkgem/jeesite4>
* GitHub：<https://github.com/thinkgem/jeesite4>
* 问题反馈：<https://gitee.com/thinkgem/jeesite4/issues>
* 作者博客：<https://my.oschina.net/thinkgem/blog>
* 官方网站：<http://jeesite.com>
* 微信公众号：

![https://static.oschina.net/uploads/space/2018/0302/145133_OGZf_941661.jpg](https://static.oschina.net/uploads/space/2018/0302/145133_OGZf_941661.jpg "JeeSite4微信公众号")


# Git 全局设置技巧

```
1、提交检出均不转换换行符

git config --global core.autocrlf false

2、拒绝提交包含混合换行符的文件

git config --global core.safecrlf true
```