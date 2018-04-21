# 命令仓库   Ctrl + Shift + A  可以搜集对应命令快捷键
#1、基础快捷键  

##1.1、无处不在的跳转项目之间的跳转  

>1.1.1、项目
>>项目之间的跳转  next project window Ctrl+Alt+[ 或 Ctrl+Alt+]  

>1.1.2、类
>>文件之间的跳转  recent file --> Ctrl + E  最近修改文件 recent changed file  ---> Ctrl + Shift + E  
  最近编辑文件的位置  last edit location   Ctrl + Q  
  最近浏览文件  back Alt + left  forward  Alt + right 
     
>1.1.3、书签
>>利用书签进行跳转  toggle bookmark  
  使用Ctrl + Shift + F11 添加标签  Ctrl + Shift + 数字  设置书签序号  使用Ctrl + 数字 即可在对应书签序号之间跳转
  收藏位置和文件   Alt + Shift + F  可以完成书签新建和收藏（类、方法）

>1.1.4、区域
>>编辑区和文件区跳转   Alt + 1

##1.2、精准搜索
>1.2.1、类
>>精准搜索类 class  Ctrl + Shift + T  连续按两次该命令，可以实现搜索jar包中的class

>1.2.2、文件
>>精准搜索文件 file  Ctrl + Shift + R  连续按两次命令，可以实现搜索jar包中的file

>1.2.3、符号
>>精准搜索符号（函数、属性）symbol 连续按两次命令，可以实现搜索jar包中的符号

>1.2.4、字符串
>>精准搜索字符串 find in path  Ctrl + H  选项（是否匹配大小写、是否是一个单词、使用正则、 mask指定文件搜索） 范围（项目、模块、文件夹、自定义）

#2、代码小助手

##2.1、列操作
>1.同时对多个列进行操作：
>>(1)选中多个列中共同的字符，使用 select all occurrences Ctrl + Alt + Y 可以对有选中字符的多个列进行操作  
>>(2)使用大小写转换可以将选中字符串进行大小写转换   toggle case Ctrl + Shift + U   
>>(3)使用F2可以快速定位到错误位置  
>>(4)使用Ctrl + Alt + L快速进行代码格式化

##2.2、live template
>2.2.1、自定义完成函数
>>(1)进入settings(Ctrl + Alt + S)  
>>(2)搜索live template  
>>(3)添加组，添加内容  abbreviation:输入模板简写  description：模板描述  template text 模板具体内容

>2.2.2、psfi, psfs
>>自定义完成属性  

>2.2.3、postfix
>>fori  
>>sout    
>>field(name.field---->能够自动追加一个name属性)  
>>return (user.return)  
>>nn (user.nn)----判空  

>2.2.4、Alt + Enter
>>自动创建函数  
>>list replace(使用for遍历list时，可以使用Alt+Enter将其变为其他可选的遍历方式)  
>>字符串format或者append  
>>实现接口  
>>单词拼写  
>>导包

#3、高质量代码
##3.1、重构
>3.1.1、变量重构  
>>Alt + Shift + R  

>3.1.2、方法重构  
>>方法一：在使用函数的地方进行更改，然后使用Alt + Shift + C    
>>方法二：在使用函数的地方进行更改，然后使用Alt + Enter

##3.2、抽取
>3.2.1、抽取变量
>>抽取为方法变量：需要抽取的地方使用 Alt + Shift + L  
>>抽取静态变量   Ctrl + Alt + C
>>抽取成员变量   Ctrl + Alt + F
>>抽取为方法参数 Ctrl + Alt + P

>3.2.2、抽取函数  
>>将需要抽取为一个函数的代码选中，然后使用 Alt + Shift + M

#4、寻找修改轨迹
##4.1、git的集成
>

    
    
       

