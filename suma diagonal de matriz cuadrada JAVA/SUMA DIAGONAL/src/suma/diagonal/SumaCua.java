package suma.diagonal;

/* 
* Resumen: se cra la clase SumaCua donde se resuelve las diagonales

 */
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

public class SumaCua 
{
    //variables
    private List diagonal = new ArrayList();
    private List a = new ArrayList();
    private  int b = 0;
    private  int c = 0;
    private  int r = 0;
    
    
    //se pone el constructor
    public SumaCua(List arr) {
        this.diagonal = arr;
    }
//proceso 
    public void Diagonal()
    {
        for (int i = 0; i < diagonal.size(); i++) 
        {
            a =  (List) diagonal.get(i);
            for(int j = 0; j < a.size(); j++)
            {
                if((j == 0 && i == 0) ||(j == 2 && i == 2))
                {
                    b += (int) a.get(j);
                }
                else if((j == 2 && i == 0) || (j == 0 && i == 2))
                {
                    c += (int) a.get(j);
                }
                else if(j == 1 && i == 1)
                {
                    b += (int) a.get(j);
                    c += (int) a.get(j);
                }
                   
            }
            r = abs(b - c);
        }   
        for (int i = 0; i < diagonal.size(); i++) 
        {
            System.out.println(diagonal.get(i));
        }  
    }

    public int getR() {
        return r;
    }
    
}
