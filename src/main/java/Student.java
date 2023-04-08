//tinh ke thua Student ke thua Person name va age

public  class Student extends Person {
    private  String address;

    public  String  getAddress()  {
        return address;
    }

    public  void  setAddress(String address)  {
        this.address = address;
    }

    public  void  show()  {
        System.out.println("person show");
    }
    //method show o Student duoc ke thua tu Person nhung 2 method lai khac nhau
    //=> ghi de (tinh da hinh)

}
