
public class ArrayListImp {
    Object [] arr=new Object[10];
    int index=0;

    public void add(Object ele){
        if(index>=arr.length){
            increase();
        }
        arr[index++]=ele;
    }

    public int size(){
        return index;
    }

    public void increase(){
        Object []temp=new Object[arr.length+10];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    public Object get(int index){
        if(index<0 || index>=size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    //add at index
    public void addAtIndex(Object ele,int pos){
        if(pos<0 || pos>size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index>=arr.length)increase();

        for(int i=size()-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=ele;
        index++;
    }

    public void remove(int pos){
        if(pos<0 || pos>=size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i=pos+1;i<size();i++){
            arr[i-1]=arr[i];
        }
        index--;
        arr[index]=null;
    }
    
}
