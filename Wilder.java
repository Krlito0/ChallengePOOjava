public class Wilder {
    private String firstname;
    private String lastname;
    private int age;
    private boolean aware;

    public Wilder (String firstname,String lastname,int age,boolean aware){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.aware=aware;
    }

    String getFName(){
        return this.firstname;
    }

    String getLName(){
        return this.lastname;
    }

    int getAge(){
        return this.age;
    }

    boolean isAware() {
        return this.aware;
    }

    void setFName (String firstname){
        this.firstname=firstname;
        }
    
    void setLName(String lastname){
        this.lastname=lastname;
    }

    void setAge(int age){
        this.age=age;
    }

    void setAware(boolean aware){
        this.aware=aware;
    }

    String whoAmI(){
        if(this.aware == true){
            System.out.println("Je m'appelle "+this.getFName()+" "+this.getLName()+". J'ai actuellement "+String.valueOf(this.getAge())+" et je suis aware");
            return  "Je m'appelle "+this.getFName()+" "+this.getLName()+". J'ai actuellement "+String.valueOf(this.getAge())+" et je suis aware";
        }else if(this.aware == false){
            System.out.println("Je m'appelle "+this.getFName()+" "+this.getLName()+". J'ai actuellement "+String.valueOf(this.getAge())+" et je ne suis pas aware");
            return "Je m'appelle "+this.getFName()+" "+this.getLName()+". J'ai actuellement "+String.valueOf(this.getAge())+" et je ne suis pas aware";
        }
        System.out.println("This student "+ this.getFName()+" "+this.getLName()+" don't know if he's aware or not!");
        return "This student "+ this.getFName()+" "+this.getLName()+" don't know if he's aware or not!";
        
    }
}

