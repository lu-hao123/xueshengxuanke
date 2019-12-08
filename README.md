#学生选课
班级：计181   姓名：李佳润   学号：2018310740

一、实验目的

      分析学生选课系统
      使用GUI窗体及其组件设计窗体界面
      完成学生选课过程业务逻辑编程
      基于文件保存并读取数据
      处理异常
二、实验要求

    1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
    2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
    3、针对操作过程中可能会出现的各种异常，做异常处理

三、实验过程

    1、编写思路
        先画出流程图，确定需要实现哪些功能，然后再根据框架写出程序。先确定需要哪些包（swing\awt\IO），将包导入，导入后先构建整体的GUI的所有界面，         
    将界面通过监听事件相连接。然后在需要文本写入与文本读出的地方的界面写上文本操作。而打印课表则是通过将文件打开，显示出学生基本信息、所选课程来实现
    的。
    2、流程图
       
 ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6.png)

    3、核心代码
        因为代码重复的过多，仅展示部分代码。
       
       GUI界面框架事例
![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/GUI%E7%95%8C%E9%9D%A2%E6%A1%86%E6%9E%B6.png)
  
        录入学生信息
![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/GUI%E7%95%8C%E9%9D%A2%E6%A1%86%E6%9E%B6.png)

         录入课表
  ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E5%BD%95%E5%85%A5%E8%AF%BE%E8%A1%A8.png)
  
         打开文件
  ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E6%89%93%E5%BC%80%E6%96%87%E4%BB%B6.png)

四、实验结果
       
         选择用户
  ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E9%80%89%E6%8B%A9%E7%94%A8%E6%88%B7.png)
         
         老师界面
   ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E8%80%81%E5%B8%88%E7%95%8C%E9%9D%A2.png)
  
         注册界面
  ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E6%B3%A8%E5%86%8C%E7%95%8C%E9%9D%A2.png)
         
         学生选课操作
  ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E6%93%8D%E4%BD%9C.png)        
         
         点击输出课表
 ![image](https://github.com/Li-dashen/xueshengxuanke/blob/master/%E7%82%B9%E5%87%BB%E8%BE%93%E5%87%BA%E8%AF%BE%E8%A1%A8.png)


五、实验感想
     
        这次实验很锻炼我的综合考虑能力，像文件输入时如何保证是在末尾添加而不是刷新界面、如何将输在文本框的内容添加到txt文件中等，这些十分考验我在文件
     处理时所需要的编程能力。通过这次实验，我想了很多，比如如何高效的处理代码，在实现功能的情况下将代码简化等。这些对我日后的编程能力的提升是十分有   
     帮助的。
        但是我也看到我的不足，例如文件处理过差，导致退课功能无法实现、所用的代码重复性太高，代码多样性差，容易溢出，还有我本身的掌握的算法少，编程能
      力不足也在这次实验中体现出来。
         总之，收获丰富，意识到不足，更能进步
