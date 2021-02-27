interface Phone1 {
    void calling();           // interface method are public by default
}

interface Phone2 {
    void camera();            // interface method are public by default
}

interface Phone3 extends Phone2,Phone1{            // Extending Multiple Interfaces
    void texting();

}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

// implementing two interfaces in one class
class SmartPhone extends MyCellPhone implements Phone3{               // Inheriting MyCellPhone class and implementing interfaces at same time

    public void calling(){                       // when the abstract method is implemented in other class 'public' keyword is used..
        System.out.println("I am calling...");
    }
    public void camera(){                        // when the abstract method is implemented in other class 'public' keyword is used..
        System.out.println("I am taking pictures...");
    }
    public void texting(){
        System.out.println("I am texting...");
    }
    void music(){
        System.out.println("I am playing songs...");
    }
}


class multiple {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.calling();
        s.camera();
        s.texting();
        s.music();
        s.callNumber(1234567890);
        s.pickCall();
    }
}
