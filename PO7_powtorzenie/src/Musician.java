
public class Musician {
    public String name;
    public String bandName;

    public Musician(){}
    public Musician(String name, String bandName){
        this.name = name;
        this.bandName = bandName;
    }
    @Override
    public String toString(){
        return name+ " "+bandName;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Musician temp){
            return (this.name.equals(temp.name) &&
                    this.bandName.equals(temp.bandName));
        }
        else
            return false;

    }
    public StringBuilder writeSong(int n){
        StringBuilder sb = new StringBuilder();
        //sb.append("la".repeat(Math.max(0, n)));
        for (int i = 0; i < n; i++){
            sb.append("la");
        }
        return sb;
    }

}
class Guitarist extends Musician{
    public String guitarModel;
    public Guitarist(){}
    public Guitarist(String name, String bandName, String guitarModel){
        super(name,bandName);
        this.guitarModel = guitarModel;
    }
    @Override
    public String toString(){
        return name+ " "+bandName+" "+guitarModel;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Guitarist temp){
            return (this.name.equals(temp.name) &&
                    this.bandName.equals(temp.bandName)&&
                    this.guitarModel.equals(temp.guitarModel));
        }
        else
            return false;

    }

    @Override
    public StringBuilder writeSong(int n) {
         StringBuilder sb = new StringBuilder(super.writeSong(n));
         for (int i = 2; i<sb.length();i+=4){
             sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
             sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
         }
         return sb;
    }
}
