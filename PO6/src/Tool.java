public class Tool {
    public String toolName;
    protected Tool(String toolName){
        this.toolName=toolName;
    }
}
class Hammer extends Tool{
    public Hammer(String toolName){
        super(toolName);
    }
}
