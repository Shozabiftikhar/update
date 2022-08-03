package Lab2;

class BiCycle{
   static String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    static String define_me(){
        return "a vehicle with an engine.";
    }
    
    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=BiCycle.define_me(); 

        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
}
class Q5{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
}
}


