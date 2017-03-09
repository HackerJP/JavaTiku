## 准备工作 
* git pull 到本地
* 项目右键->build path->add library->将WEB-INF/lib/目录下的包引入

## 项目结构介绍  
* 本项目统一使用UTF-8编码
* src/tiku/下存放各种业务逻辑类
  *  controller/下的类用于解析各类请求（如/login,POST）,并分发相应的view页面
  *  domain/下存放对象模块
  *  form/下存放表单
  *  dao/下存放于数据库操作相关类（未创建）
*  WebRoot/下css，js，fonts，img文件夹存放静态资源
    *  WEB-INF/jsp/放置jsp页面，
    *  WEB-INF/config/springmcv-config.xml为Spring框架中Dispatcher Servlet（用于路由分发）的配置文件
    *  WEB-INF/lib/放置项目需要引用的包

## 代码提交说明
* git-commit and push 到各自的branch（分支）中，检查无误后再Pull Request 合并到master
