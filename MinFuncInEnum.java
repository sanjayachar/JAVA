enum ParentEnum{

}
public enum MinFuncInEnum implements ParantEnum{
    RED,GREEN,BLUE;
    public static void main(String[] args) {
        MinFuncInEnum c1=MinFuncInEnum.RED;
        System.out.println(c1+"\n");
        for(MinFuncInEnum var_1:MinFuncInEnum.values()){
            System.out.println(var_1);
        }
    }
    
}
