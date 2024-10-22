class ThreadDemo extends Thread
{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hii");;
        }
    }
public static void main(String[] args) {
 ThreadDemo a=new ThreadDemo(); 
 B b=new B();
 a.start();;
 b.start();  
}
}
