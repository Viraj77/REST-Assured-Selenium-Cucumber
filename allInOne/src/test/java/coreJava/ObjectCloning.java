package coreJava;

public class ObjectCloning implements Cloneable{

    int empId;
    String name;

    ObjectCloning(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main (String args[]){

        try{
            ObjectCloning obj1 = new ObjectCloning(101, "Viraj");
            ObjectCloning obj2 = (ObjectCloning)obj1.clone();

            System.out.println(obj1.empId+" "+obj1.name);
            System.out.println(obj2.empId+" "+obj2.name);

        }catch(CloneNotSupportedException c){

        }

    }
}
