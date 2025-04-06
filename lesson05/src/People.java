public class People {
    private int id;
    private String name;
    private int age;
    private String gender;

    public People(){
        System.out.println("调用无参构造创建People对象");
    }

    public People(int id){
        System.out.println("调用有参构造创建People对象");
        this.id=id;
    }
    public People(int id,String name,int age,String gender){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
