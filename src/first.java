/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 08:36
 */
public class first {
    //私有属性
    private String name;
    private String pwd;
    private Integer age;
    private String sex;


    // 无参构造方法
    public first() {
    }

    public void setAge(Integer age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("年龄输入不合法");
        }
    }

    public Integer getAge() {
        return age;
    }

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

    public static void main(String[] args) {
        first f = new first();
        f.setName("李四");
        f.setAge(-5);
        f.setSex("女");
        f.setPwd("123");

        f.name = "张三";
        f.sex = "男";
        f.age = -5;
        System.out.println("姓名 ：" + f.getName() +
                "\n性别 :" + f.getSex()
                + "\n 年龄 ：" + f.getAge());
    }

}
