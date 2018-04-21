#IntellJ IDEA神器使用技巧
## 命令仓库   Ctrl + Shift + A  可以搜集对应命令快捷键
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
>>精准搜索符号（函数、属性）symbol  Ctrl + Alt + Shift + N 连续按两次命令，可以实现搜索jar包中的符号

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
>4.1.1、行号与编辑区中间右键，选择annotate，可以查看内容的提交时间和作者等详细信息  
>4.1.2、移动所有改动之处   Ctrl + Alt + Shift + up  
>4.1.3、撤销，包括单个和项目改动之处  
>>撤销当行或者局部  在原位置使用Ctrl + Alt + Z  
>>撤销单个文件的修改  在空白位置使用 Ctrl + Alt + Z  
>>对应的可以在文件、文件夹上等使用 Ctrl + Alt + Z 撤销其包含内容的修改

##4.2、local history（IDEA本地版本控制工具）
>与git类似更多内容参考慕课相关教程

#5、关联
##5.1、与Spring的关联
>得到相关引用bean的位置与关系。更多内容参考慕课相关教程
##5.2、与Database关联
>编辑sql时可以得到数据库表、字段等相关信息，并且可以通过idea对数据库或者mapper文件进行更改，并且能够将更改同步到所有的项目相关文件。更多内容参考慕课相关教程

#6、调试
>6.1、添加断点  Ctrl + Shift + B  （个人喜欢行上单击）  
>6.2、单步运行  F6  
>6.3、resume    F8   ---- 只在断点运行  
>6.4、查看断点  Ctrl + Shift + F8    
>6.5、禁止所有断点  mute breakpoints  
>6.6、条件断点  右键断点，在condition中输入相应条件表达式  
>6.7、表达式求值  在运行过程中查看某个表达式的值，debug开始运行时在想要查看值的位置 Ctrl + U 输入相应的表达式，可以查看目前的值  
>6.8、运行到某一行  run to cursor   Ctrl + R  
>6.9、set Value  在运行过程中修改某个变量的值  
>6.10、run where if you can  可以在可运行标志内使用快捷键运行可运行标志内的最大运行单元（方法、类）

#7、其他操作
##7.1、文件操作（未找到相关操作键）
>在当前文件同一级目录下新建一个文件   Alt + insert   
>复制当前文件  
>移动当前文件  

##7.2、文本操作
>1、复制文件名  文件上 Ctrl + C   idea使用.md    
>2、复制完整路径 文件上  Ctrl + Shift + C  D:\develop\develop\note\学习笔记\idea\idea使用.md  
>3、连续复制多个，通过调出剪切板（Ctrl + Shift + V）选择使用，并且可以通过剪切板上序号调出相应的内容 idea使用.md   application.properties  NoteApplication

##7.3、结构图
>7.3.1、查看当前field，method 大纲   file structure   Ctrl + F3  
>7.3.2、查看maven依赖、类图 依赖：Ctrl + Alt + Shift + U  
>7.3.3、查看类继承结构、方法调用层次  继承F4  方法--在方法上使用Ctrl + Alt + H

##注：idea学习部分来自于[慕课网IntellJ IDEA神器使用技巧](https://www.imooc.com/learn/924)，如有侵权，请联系。更多详细内容可到慕课网观看。
                                                                    
                                        


    
    
       

