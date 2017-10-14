public class VectorHelper {

    public static void vectorTri(int tab[],int taille){

        int indice_max;

        for(int i=taille;i>1;i--){

            indice_max=max(tab,i);

            echanger(tab,i-1,indice_max);

        }

    }

    public static int max(int tab[],int taille){

        int i=0,indice_max=0;

        while(i<taille){

            if(tab[i]>tab[indice_max])

                indice_max=i;

            i++;

        }

        return indice_max;

    }

    public static void echanger(int tab[],int i,int j){

        int tmp;

        tmp=tab[i];

        tab[i]=tab[j];

        tab[j]=tmp;

    }

  public static void vectorInvers(int tab[], int taille){
        for(int i=1; i<=taille; i++){
            int tmp;
            tmp=tab[taille-1];
            tab[taille-1]=tab[0];
            tab[0]=tmp;
        }
    }



    

// essai
    public static void main(String[] args){

        int t[]={2,1,4,6,3};

        vectorTri(t,t.length);
        vectorInvers(t,t.length);

        for(int i=0; i<t.length;i++)

            System.out.println(t[i]);

    }
}
