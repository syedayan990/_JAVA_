public class if_else_ladder
{
    static void main(String[] args) {

        Boolean isNotAdult = false;
        Boolean isAdult = false;

        if(isNotAdult){
            System.out.println("hello seniour citizen");
        }else{
            if(isAdult){
                System.out.println("hello adult");
            }else{
                System.out.println("hello child");
            }
        }

    }
}
