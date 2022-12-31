


//class program
public class Program extends collection {

    
    
    public static void main(String[] args) throws Exception {

        //penggunaan String
        String title     = "=                 Program Penitipan Barang                =";
        String head      = "Selamat datang di program penitipan barang sunrise";
        String kepala    = head.replace("Selamat pagi", "\nsemoga hal yang baik selalu bersamu"); 
        System.out.println(kepala);  //method replace()
        
        System.out.println("__________________________________________________");
        System.out.println(title.toUpperCase()); //method toUpperCase()
        System.out.println("__________________________________________________");
        
        
        //penggunaan method dari collection (is a)
        menu();
        
        penilaian();
	}

    }

