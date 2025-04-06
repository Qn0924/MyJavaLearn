public class Student extends People {
    public Student(){
        System.out.println("调用无参构造创建Student对象");
    }
    public Student(int id){
        System.out.println("调用有参构造创建Student对象");
    }
}
