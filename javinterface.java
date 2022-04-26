package com.company.intrfaces;
interface Camera{
    void clickpic();
    }
interface mp3 {
    void player();
}
interface radio {
   void mirchifm();
}

             class smphone implements mp3, radio, Camera {

                public void clickpic() {
                    System.out.println("click the pics..");
                }

                public void mirchifm() {
                    System.out.println("conecting fm..");
                }

                public void player() {
                    System.out.println("playing music....");

                }

            }

public class javinterface {
    public void main(String[] args) {
        smphone sc =new smphone();
        sc.clickpic();
	sc.mirchifm();
	sc.player();
	

    }
}
