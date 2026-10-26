import java.util.Scanner;

public class zhan {
    static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String  a=r.nextLine();
        char [] b=a.toCharArray();
        char [] c=new char[b.length];
        int top=0;
        String q="([{";
        String k=")]}";
        for (int i = 0; i < b.length; i++) {
            if (b[i]=='('||b[i]=='['||b[i]=='{'){
                c[top]=b[i];
                top++;
            } else if (b[i]==')'||b[i]==']'||b[i]=='}') {
                if (top==0){
                System.out.println("no");
                return;}
                if (q.indexOf(c[top-1])==k.indexOf(b[i])){
                    top--;

                }else{
                    System.out.println("no");
                    return;
                }
            }


        }
        if (top==0){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
