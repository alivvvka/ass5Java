package com.company;

public class PaperCreator {

    private boolean sawdust = false;
    private boolean wood = false;
    private boolean paper = false;


    public void woodCreation(){

        System.out.println("Cutting down trees!");
        this.wood = true;
    }

    public void sawdustCreation(){

        System.out.println("Chop wood into sawdust!");
        this.sawdust = true;
    }

    public boolean checkSawdust(){

        if(sawdust == true){
            return true;
        }
        else{
            System.out.println("We dont have sawdust!");
            return false;
        }
    }

    public void createPaper(){

        if (checkSawdust() == true){
            System.out.println("Paper was created!");
            this.paper = true;
        }
        else{
            System.out.println("We dont have sawdust!");
        }
    }

    public boolean checkPaper(){

        if(this.paper == true){
            return true;
        }
        else{
            return false;
        }
    }
}
