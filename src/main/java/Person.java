//tinh truu tuong: name và age là thuoc tinh dac trung của Person
// => Truu tuong hoa thanh class Person

public  class Person {
    private  String name; //tinh dong goi
    private  int age;

    public  String  getName()  {
        return name;
    }

    public  void  setName(String name)  {
        this.name = name;
    }

    public  int  getAge()  {
        return age;
    }

    public  void  setAge(int age)  {
        if  (age < 0)  {
            age = 0;
        }
        this.age = age;
    }
    //tao method show o Person
    public  void  show()  {
        System.out.println("person show");
    }

}