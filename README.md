# Mirai_maven
mirai的maven基础模板
## 使用说明
在src/test/kotiln/RunTerminal.kt里可以测试程序</br>
**首次运行会报错，请先运行一次，然后再运行**
修改RunTerminal.kt里第24行格式如下
```
 val bot = MiraiConsole.addBot(QQ账号, "QQ密码").alsoLogin()
```
然后就可以运行程序了
### 如果更改目录或者类名，请一并修改下面的内容
```
src/test/kotiln/RunTerminal.kt中第一行的import com.example.Plugin改成自己修改的目录或类名
```
### **本模板是根据Mirai Console IntelliJ插件的模板修改的**
`本模块中架包版本请根据个人需求和官方提供的版本进行修改`

