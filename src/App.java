public class App {
    public static void main(String[] args)  {
        int pinakas[]= {15,2,14,6,142,555,777,420};
        System.out.print("original array: ");
        for(int i=0; i<pinakas.length; i++) {
            System.out.print(pinakas[i]+" ");
        }
        int n=pinakas.length;
        for (int i=0; i<n-1; i++) {
            int minimumIndex=i;
            for(int j=i+1; j<n; j++) {
                if(pinakas[j]<pinakas[minimumIndex]) {
                    minimumIndex=j;
                }
            }
            int temp=pinakas[minimumIndex];
            pinakas[minimumIndex]=pinakas[i];
            pinakas[i]=temp;
        }
        System.out.print("\nordered array: ");
        for(int i=0; i<pinakas.length; i++) {
            System.out.print(pinakas[i]+" ");
        }
    }
    }

