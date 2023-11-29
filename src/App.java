public class App {
    public static void main(String[] args)  {
        int array[]= {15,2,14,6,142,555,777,420};
        System.out.print("original array: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        int n=array.length;
        for (int i=0; i<n-1; i++) {
            int minimumIndex=i;
            for(int j=i+1; j<n; j++) {
                if(array[j]<array[minimumIndex]) {
                    minimumIndex=j;
                }
            }
            int temp=array[minimumIndex];
            array[minimumIndex]=array[i];
            array[i]=temp;
        }
        System.out.print("\nordered array: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    }

