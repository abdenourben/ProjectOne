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

// la somme de 2 vecteur 


public static void somme(int tab1[],int tab2[])
{

  try{

    for(int i=0 ; i<tab1.length ; i++) tab1[i] = tab1[i] + tab2[i] ;
  }
   catch(Exeption e){
       System.out.println("La longuer des tableau sont défférente") ;
   }


}

//
public static void max_min(int tab[], int max , int min)
{
    try{

            int max=tab[0];
            int min=tab[0];
            for(int i=0 ; i<tab.length ; i++)
            {
                if(tab[i]>max) max=tab[i] ;
                if(tab[i]<min) min=tab[i] ;
            }
    }
      catch(Exception e)
       {
            System.out.println("le tableau est vide ") ;
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
