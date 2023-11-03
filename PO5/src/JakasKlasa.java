public class JakasKlasa {
    public String tekst;

    public JakasKlasa(){
        tekst = "default";
    }
    @Override //nie trzeba ale dobrze użyć
    public String toString(){
        return tekst;
    }
    @Override
    public boolean equals(Object other){
        if( other instanceof JakasKlasa temp){
            return this.tekst.equals(temp.tekst);
        }
        else
            return false;
    }
}
