public class CsClass {

    public static void main (String[] args){
        CsClass csClass = new CsClass();
        csClass.switchCheck();
        csClass.ifElseCheck();
        csClass.forLoopCheck();
        csClass.forEachLoopCheck();
        csClass.whileLoopCheck();

    }

    public void ifElseCheck(){
        boolean flag = false;

        if(flag){
            System.out.println("I'm in if");
        } else {
            System.out.println("I'm in else");
        }

    }

    public void forLoopCheck(){
        for(int i = 0; i<5; i++){
            System.out.println("i is " + i);
            if(i == 3){
                break;
            }
        }
    }

    public void forEachLoopCheck(){
        String[] myArray = {"a", "b", "c"};

        for(String str : myArray){
            System.out.println(str);
        }
    }

    public void whileLoopCheck(){
        int i = 5;

        while(i > 0){
            System.out.println("i is " + i);
            i--;
            if(i == 3){
                break;
            }
        }
    }
    public void switchCheck(){
        String str = "b";

        switch (str) {
            case "a" -> System.out.println(str);
            case "b" -> System.out.println(str);
        }
    }

}