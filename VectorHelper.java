/** VectorHelper est la classe qui permet d'effectuer certaines manipulations sur les vecteurs.
 *
 * @author subrms & djamel-madani
 * @version 2.0
 *
 */









public class VectorHelper {


    /**
     *
     * @param tab
     *              le nouveau tableau à trier
     * @param taille
     *              renseigner la taille du tableau à trier, nous pouvions bien la déduire par tab.length
     *
     * @since 1.0
     *
     *
     */

    public static void vectorTri(int tab[],int taille){

        int indice_max;

        for(int i=taille;i>1;i--){

            indice_max=max(tab,i);

            echanger(tab,i-1,indice_max);

        }

    }

    /**
     *
     * @param tab   le nouveau tableau à trier
     *
     * @param taille    renseigner la taille du tableau à trier, nous pouvions bien la déduire par tab.length
     *
     * @return  retourn le maximum dans le tableau tab
     *
     */

    public static int max(int tab[],int taille){

        int i=0,indice_max=0;

        while(i<taille){

            if(tab[i]>tab[indice_max])

                indice_max=i;

            i++;

        }

        return indice_max;

    }

    /**
     *
     * @param tab   le nouveau tableau à trier
     * @param i     le premier indice du tableau à échanger
     * @param j     le second indice du tableau à éhcnager avec le premier portant l'indice i
     * @since 1.0
     */

    public static void echanger(int tab[],int i,int j){

        int tmp;

        tmp=tab[i];

        tab[i]=tab[j];

        tab[j]=tmp;

    }

    /**
     *
     * @param tab  en entrée un tableau dont on veut inverser les éléments
     * @param taille    il serait préférable de renseigner la taille, nous pouvons l'obtenir avec un tab.length
     */


    public static void vectorInvers(int tab[], int taille){
        for(int i=1; i<=taille; i++){
            int tmp;
            tmp=tab[taille-1];
            tab[taille-1]=tab[0];
            tab[0]=tmp;
        }
    }

    /**
     * Cette méthode somme deux tableaux et retourne une exception si la longueur est différente
     *
     * @autor djamel-madani
     * @param tab1 premier tableau
     * @param tab2 deuxième tableau
     */

public static void somme(int tab1[],int tab2[])
{

  try{

    for(int i=0 ; i<tab1.length ; i++) tab1[i] = tab1[i] + tab2[i] ;
  }
   catch(Exception e){
       System.out.println("La longueur des tableaux est différente") ;
   }


}




    /**
     *
     *
     * @param args spécifique à la méthode main
     */
    public static void main(String[] args){

        int t[]={2,1,4,6,3};

        vectorTri(t,t.length);
        vectorInvers(t,t.length);

        for(int i=0; i<t.length;i++)

            System.out.println(t[i]);

    }
}
