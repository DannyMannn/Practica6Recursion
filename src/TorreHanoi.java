/*
    @author Ervey Guerrero Gómez
    @author David Hernandéz López
    @author Daniel Sánchez Vázquez
    @author Alejandro Tonatiuh García Espinoza
*/
public class TorreHanoi {
    //n número de discos: disco 1 es el el más pequeño
    //inicio es la torre inicial
    //auxiliar es la torre que el disco usará para llegar a la torre fin
    public void torreHanoi(int n,char inicio,char fin,char auxiliar){
        if(n == 1) {
            System.out.println("Mover disco " + n + " de torre " + inicio + " a torre " + fin);
        }
        else{
            torreHanoi(n-1,inicio,auxiliar,fin);
            System.out.println("Mover disco "+n+" de torre "+inicio+" a torre "+fin);
            torreHanoi(n-1,auxiliar,fin,inicio);
        }
    }

    public static void main(String[] a){
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.torreHanoi(4,'A','C','B');
    }
}
