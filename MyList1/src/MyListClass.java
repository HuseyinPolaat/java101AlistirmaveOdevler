import java.util.Arrays;

public class MyListClass <T> {
    T[] list;

    public MyListClass(){
        this.list = (T[]) new Object[10];
    }

    public MyListClass(int capacity){
        this.list =  (T[]) new Object[capacity];
    }

    public int getSize(){
        int count = 0;
        for(T item: this.list){
            if(!(item == null)){
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return this.list.length;
    }

    public void add (T data) {
        if(this.getSize() >= this.getCapacity()){
            this.list = this.setCapacity(this.list);
        } else {
            for(int i = 0; i < list.length; i++){
                if(list[i] == null){
                    list[i] = data;
                    break;
                }
            }
        }
    }
    public T[] setCapacity(T[] array){
        T[] newArray = (T[]) new Object[array.length * 2];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public T get(int index){
        return (index > this.list.length || index < 0)? null: this.list[index];
    }

    public T[] remove(int index){
        if(index > this.list.length || index < 0) return null;
        this.list[index] = null;
        for(int i = index; i < this.list.length - 1; i++){
            T temp = this.list[i + 1];
            this.list[i + 1] = null;
            this.list[i] = temp;
        }
        return list;
    }

    public T[] set(int index, T data){
        if(index > this.list.length || index < 0) return null;
        this.list[index] = data;
        return this.list;
    }

    public String toString(){
        String arrayToString = "";
        for(T e: this.list){
            arrayToString = arrayToString + " " + e;
        }
        return arrayToString;
    }

    public int indexOf(T data){
        int index = -1;
        for(int i = 0; i < this.list.length; i++){
            if(list[i] != null && list[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(T data){
        int index = -1;
        for(int i = 0; i < this.list.length; i++){
            if(list[i] != null && list[i].equals(data)){
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty(){
        int size = this.getSize();
        return size == 0;
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[this.list.length];
        for(int i = 0; i < this.list.length; i++){
            newArray[i] = list[i];
        }
        return newArray;
    }

    public void clear(){
        for(int i = 0; i < this.list.length; i++){
            list[i] = null;
        }
    }

    public MyListClass<T> subList(int start, int finish){
        MyListClass mySubList = new MyListClass(finish - start);
        for (int i = start; i < finish; i++){
            mySubList.add(this.list[i]);
        }
        return mySubList;
    }

    public boolean contains(T data){
        boolean status = false;
        for(T item: this.list){
            status = item.equals(data);
            if(status) break;
        }
        return status;
    }

}
