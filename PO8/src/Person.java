public record Person(String name,int age) {//<-- konstruktor kompaktowy

    public Person{
        if(age<0)
            age=0;
    }
    public Person(){
        this("default",0);
    }
    public void greet(){
        System.out.println("cześć");
    }

}
