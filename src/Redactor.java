public class Redactor {

    public String [] create(String [] arr, String value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                arr[i]=value;
                break;
            }
        }
        return  arr;
    }

    public void  read (String [] arr){
        for (String s : arr) {
            System.out.print(s + "  ");
        }
        System.out.println();

    }

    public String [] update (String [] arr, int index, String value){
        if (checkIndex(arr,index)){
            arr[index]=value;
        }
        return arr;
    }

    public String [] delete (String [] arr, int index){
        if (checkIndex(arr,index)){
            arr[index]=null;
        }
        return arr;
    }

    public boolean checkIndex (String [] arr, int index){
        boolean cheсk = index < arr.length -1 && index>=0;
        if (!cheсk)
            System.out.println("Incorrect index " + index);
        return cheсk;
    }
}
