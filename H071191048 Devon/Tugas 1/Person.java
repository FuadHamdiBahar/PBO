public class Person {
    String name;
    int age;
    boolean isMale;

    public void setAge(int age) {
         this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(String gender){
        if(gender.equals("laki-laki")){
            isMale = true;
        } else {
            isMale = false;
        }
    }

    public boolean getGender(){
        if (isMale == true) {
            System.out.println("laki-laki");
            return true;
            
        } else {
            System.out.println("bukan laki-laki");
            return false;   
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void desc(){
        System.out.println("Name : " + name);
        System.out.println("berumur : " + age);

    }
}