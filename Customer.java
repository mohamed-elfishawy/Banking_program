public class Customer {

    String name ;
    String email ;
    private int age ;
    

    public Customer(){

    }

    public Customer( String name , String email , int age ){

        this.name = name ;
        this.email = email ;
        this.age = age ;

    }


    public void setName(String name){
    
        this.name = name ;
        
    }

    public void setEmail(String email){

        this.email = email.toLowerCase();
    }

    public void setAge(int age){

        if(age <= 0){
            System.out.println("Invalid input");
        }

        else{
            this.age = age ;
        }

    }


     public String getName(){

        return name ;
    }

    public String getEmail(){

        return email ;
    }

     public int getAge(){

        return age ;
    }
    
}
