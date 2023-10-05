public class MyListClass <T> {
    private T[] array;

    public MyListClass(){
        this.array = new Object[10];
    }

    public MyListClass(int capacity){
        this.array =  new Object[capacity];
    }

    public int getSize(){
        int count = 0;
        for(T item: this.array){
            if(item){
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return this.array.length;
    }

    public<T> void add (T data) {
        if(this.getSize() == this.getCapacity()){
            int newArrayLength = this.array.length * 2;
            
        }
    }
}
