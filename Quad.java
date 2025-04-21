public class Quad<T1 extends Integer, T2 extends Object, T3 extends Number, T4 extends Number>{
    private T1 id;
    private T2 name;
    private T3 height;
    private T4 weigth;

    public Quad(T1 id, T2 name, T3 height, T4 weigth){
        this.id = id;
        this.name = name;
        this.height =  height;
        this.weigth = weigth;



    }
    public T1 getId(){
        return id;

    }
    public void setId(T1 id){
        this.id = id;

    }
    public T2 getName(){
        return name;

    }
    public void setName(T2 name){
        this.name = name;

    }
    public T3 getHeight(){
        return height;

    }
    public void setHeight(T3 height){
        this.height = height;

    }
    public T4 getWeigth(){
        return weigth;

    }
    public void setWeigth(T4 weigth){
        this.weigth = weigth;

    }
}
