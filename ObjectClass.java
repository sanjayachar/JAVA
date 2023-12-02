/*Object class is father of all class means it is a super class of all classes
 * there are mainly 9 methods
 * getClass(),hashCode(), wait(), toString(), clone(),
 * equals(), finalize(), notify(), notifyall()
*/
public class ObjectClass implements Cloneable{
    private String title,author;
    private int year;
    public ObjectClass(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public int getYear(){return year;}

    /*toString() method returns String object */
    @Override
    public String toString(){
        return title+" by "+author+" ("+year+")";
    }

    /*equal method returns the boolean object whcih compares the given to "this" object */
    @Override
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof ObjectClass))
        return false;
        ObjectClass other=(ObjectClass)obj;
        return this.title.equals(other.getTitle())&&this.author.equals(other.getAuthor())
        &&this.year==other.getYear();
    }

    /*hashCode method: For every object, JVM generates a unique number which is a hashcode
     * hashCode returns the distinct integers for distinct objects
     */
    @Override
    public int hashCode(){
        int result=17;
        result=31*result+title.hashCode();
        result=31*result+author.hashCode();
        result=31*result+year;
        return result;
    }

    /*clone method: It returns a new object that is exactly same as this object */
    @Override 
    public ObjectClass clone()throws CloneNotSupportedException{
        return (ObjectClass)super.clone();
    }

    /*finalize method: This method is called before an object is garbage collected */
    @Override
    protected void finalize()throws Throwable{
        System.out.println("Finalizing "+this.getClass().getName());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClass obj1=new ObjectClass("Nothing", "Sanjay", 0000);
        System.out.println(obj1);
        
        //crating clone or shallow copy of an object using clone method 
        ObjectClass obj2=obj1.clone();
        
        //prinitng the hashcode
        System.out.println("Hashcode of obj1 and obj2:\n"+obj1.hashCode()+"\n"+obj2.hashCode());

        //checking the 2 object equal using equal method
        System.out.println("obj1 equals to obj2 ? "+obj1.equals(obj2));

        //setting obj1 to null and trigger garbage collection
        //and finalize method
        obj1=null;
        System.gc();
    }
}
