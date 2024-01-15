public class TextProcessor implements DataProcessor{

    @Override
    public String processData(String data) {
        if(data != null) {
            return new StringBuilder(data).reverse().toString();
        }
        return "data nie może byc nullem";
    }

    @Override
    public boolean isValid(String data) {
        if(data == null){
            return false;
        }
        return true;
    }
}
