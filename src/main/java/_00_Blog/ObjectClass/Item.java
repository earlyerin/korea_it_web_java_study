package _00_Blog.ObjectClass;

public class Item {

    public String printItem(Object obj){ //파라미터의 타입 : Object
        if(obj instanceof Car){
            return "---Registered car information---\n" + obj.toString();
        }else if (obj instanceof Art){
            return "---Registered art information---\n" + obj.toString();
        } else if (obj instanceof Sofa) {
            return "---Registered sofa information---\n" + obj.toString();
        }
        return "unregistered item";
    }
}
