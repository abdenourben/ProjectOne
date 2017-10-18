import org.junit.Test;

import static org.junit.Assert.*;

public class VectorHelperTest {
    @Test
    public void vectorTri() throws Exception {
        int t[]= {2,3,1};
        int tt[]= {1,2,3};
        VectorHelper.vectorTri(t,3);
        assertArrayEquals(tt,t);
    }

    @Test
    public void max() throws Exception {
        int t[]= {1,2,3};
        assertEquals(2, VectorHelper.max(t,3));
    }

    @Test
    public void echanger() throws Exception {
        int t[]= {1,2,3};
        int tt[]= {1,3,2};
        VectorHelper.echanger(t,1,2);
        assertArrayEquals(tt,t);
    }

    @Test
    public void vectorInvers() throws Exception {
        int t[]= {1,2,3};
        int tt[]= {3,2,1};
        VectorHelper.vectorInvers(t,3);
        assertArrayEquals(tt,t);
    }

    @Test
    public void somme() throws Exception {

        //  cas de test 1

        int t[]={1,2,3};
        int tt[]={1,2,3,4};
        int ttt[]={2,4,6};
        VectorHelper.somme(t,tt);
        assertArrayEquals(t,ttt);



        //  cas de test 2

        try {
            int v[]={1,2,3,4};
            int vv[]={1,2,3};
            VectorHelper.somme(v,vv);
            fail("Exception"); // elle sert à quoi ?
    }catch (Exception e ){

            System.out.println("Tableaux de taille différente");

        }
    }

    @Test
    public void main() throws Exception {
    }

}