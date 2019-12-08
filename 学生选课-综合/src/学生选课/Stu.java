package 学生选课;
/*
 * 创建一个学生类
 */
public class Stu {
	String id;	
	String name;
	String password;
public Stu(String i, String n,String p) {
	    id = i;
	    name = n;
	    password = p;
	  }
	  public String getid() {
	    return id;
	  }
	  public String getname() {
	    return name;
	  }
	  public String getpassword() {
		  return password;
	  }
      public String toString() {
		   return "  学号：" + id+ " 姓名：" + name 
				   + " 密码：" + password;
		   }
}