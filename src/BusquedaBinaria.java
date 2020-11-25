/*
    @author Ervey Guerrero Gómez
    @author David Hernandéz López
    @author Daniel Sánchez Vázquez
    @author Alejandro Tonatiuh García Espinoza
*/
public class BusquedaBinaria {
    int busquedaBinaria(int A[],int low,int high,int num){
        if(low <= high){
            int mid = (low +high)/2;

            if(A[mid] == num)
                return mid;

            if(A[mid] < num)
                return busquedaBinaria(A,mid+1,high,num);

            return busquedaBinaria(A,low,mid-1,num);
        }
        return -1;
    }

    public static void main(String a[]){
        BusquedaBinaria bb = new BusquedaBinaria();
        int A[] = {3,6,9,10,12,13,20,22,23,25,30};
        int num = 22;
        System.out.println("Posicion de "+num+": "+bb.busquedaBinaria(A,0,A.length-1,num));
    }
}
