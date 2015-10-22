import java.util.Collection;//Interface
import java.util.ArrayList;//Implementation

public class CollectionProgram{

public static void main(String args[]){

Collection myCollection = new ArrayList();
myCollection.add("1");
myCollection.add("2");
myCollection.add("3");

System.out.println("The Collection Contains "+myCollection.size()+" item/s");

myCollection.clear();

if(myCollection.isEmpty()){

System.out.println("The Collection is Empty");
}
else{
System.out.println("The Collection is not Empty");
}

}

}