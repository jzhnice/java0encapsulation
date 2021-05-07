/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 11:47
 */
 /*封装
         三大特性： 封装 继承 多态
         set 赋值
         get读取*/

public class Person {
    //私有属性
    private String name;
    private String pwd;
    private Integer age;
    private String sex;

    // 无参构造方法
    public Person() {
    }



    //对应私有属性的get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person[name =" + name + " ,pwd=" + pwd + " ,age=" + age + ",sex=" + sex + "]";

    }

}
