public class ConstructorOverloading {
    double width,height,depth;
    ConstructorOverloading(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    ConstructorOverloading(){
        this(10,20,30);
        // width=height=depth=0;
        System.out.println("Volume="+(width*height*depth));
    }
    public static void main(String[] args) {
        ConstructorOverloading a=new ConstructorOverloading();
    }
}
