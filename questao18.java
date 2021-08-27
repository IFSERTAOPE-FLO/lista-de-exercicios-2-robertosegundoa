import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int x1, x2, x3, x4, x5, x6, x7, x8, x9;
        int y1, y2, y3, y4, y5, y6, y7;
        int n1, n2, n3, n4, n5, n6, n7, n8, n9;

        System.out.print("Digite um número inteiro de até 9 digitos: ");
        x = scan.nextInt();

        x1 = x / 100000000;
        y1 = x % 100000000;
        x2 = y1 / 10000000;
        y2 = y1 % 10000000;
        x3 = y2 / 1000000;
        y3 = y2 % 1000000;
        x4 = y3 / 100000;
        y4 = y3 % 100000;
        x5 = y4 / 10000;
        y5 = y4 % 10000;
        x6 = y5 / 1000;
        y6 = y5 % 1000;
        x7 = y6 / 100;
        y7 = y6 % 100;
        x8 = y7 / 10;
        x9 = y7 % 10;

        n1 = x1 * 100000000;
        n2 = x2 * 10000000;
        n3 = x3 * 1000000;
        n4 = x4 * 100000;
        n5 = x5 * 10000;
        n6 = x6 * 1000;
        n7 = x7 * 100;
        n8 = x8 * 10;
        n9 = x9;

        String [] centmilhoes;
        centmilhoes = new String[9];
        centmilhoes[0] = "CEM ";                //100 000 000
        centmilhoes[1] = "DUZENTOS ";           //200 000 000
        centmilhoes[2] = "TREZENTOS ";          //300 000 000
        centmilhoes[3] = "QUATROCENTOS ";       //400 000 000
        centmilhoes[4] = "QUINHENTOS ";         //500 000 000
        centmilhoes[5] = "SEISCENTOS ";         //600 000 000
        centmilhoes[6] = "SETECENTOS ";         //700 000 000
        centmilhoes[7] = "OITOCENTOS ";         //800 000 000
        centmilhoes[8] = "NOVECENTOS ";         //900 000 000

        String [] dezmilhoes;
        dezmilhoes = new String[9];
        dezmilhoes[0] = "DEZ ";         //10 000 000
        dezmilhoes[1] = "VINTE ";       //20 000 000
        dezmilhoes[2] = "TRINTA ";      //30 000 000
        dezmilhoes[3] = "QUARENTA ";    //40 000 000
        dezmilhoes[4] = "CINQUENTA ";   //50 000 000
        dezmilhoes[5] = "SESSENTA ";    //60 000 000
        dezmilhoes[6] = "SETENTA ";     //70 000 000
        dezmilhoes[7] = "OITENTA ";     //80 000 000
        dezmilhoes[8] = "NOVENTA ";     //90 000 000

        String [] unimilhoes;
        unimilhoes = new String[9];
        unimilhoes[0] = "UM MILHÕES ";           //1 000 000
        unimilhoes[1] = "DOIS MILHÕES ";        //2 000 000
        unimilhoes[2] = "TRÊS MILHÕES ";        //3 000 000
        unimilhoes[3] = "QUATRO MILHÕES ";      //4 000 000
        unimilhoes[4] = "CINCO MILHÕES ";       //5 000 000
        unimilhoes[5] = "SEIS MILHÕES ";        //6 000 000
        unimilhoes[6] = "SETE MILHÕES ";        //7 000 000
        unimilhoes[7] = "OITO MILHÕES ";        //8 000 000
        unimilhoes[8] = "NOVE MILHÕES ";        //9 000 000

        String [] centmilhar;
        centmilhar = new String[9];
        centmilhar[0] = "CEM ";                 //100 000
        centmilhar[1] = "DUZENTOS ";            //200 000
        centmilhar[2] = "TREZENTOS ";           //300 000
        centmilhar[3] = "QUATROCENTOS ";        //400 000
        centmilhar[4] = "QUINHENTOS ";          //500 000
        centmilhar[5] = "SEISCENTOS ";          //600 000
        centmilhar[6] = "SETECENTOS ";          //700 000
        centmilhar[7] = "OITOCENTOS ";          //800 000
        centmilhar[8] = "NOVECENTOS ";          //900 000

        String [] dezmilhar;
        dezmilhar = new String[9];
        dezmilhar[0] = "DEZ ";              //10 000
        dezmilhar[1] = "VINTE ";            //20 000
        dezmilhar[2] = "TRINTA ";           //30 000
        dezmilhar[3] = "QUARENTA ";         //40 000
        dezmilhar[4] = "CINQUENTA ";        //50 000
        dezmilhar[5] = "SESSENTA ";         //60 000
        dezmilhar[6] = "SETENTA ";          //70 000
        dezmilhar[7] = "OITENTA ";          //80 000
        dezmilhar[8] = "NOVENTA ";          //90 000

        String [] unimilhar;
        unimilhar = new String[9];
        unimilhar[0] = "UM MIL ";           //1000
        unimilhar[1] = "DOIS MIL ";         //2000
        unimilhar[2] = "TRÊS MIL ";         //3000
        unimilhar[3] = "QUATRO MIL ";       //4000
        unimilhar[4] = "CINCO MIL ";        //5000
        unimilhar[5] = "SEIS MIL ";         //6000
        unimilhar[6] = "SETE MIL ";         //7000
        unimilhar[7] = "OITO MIL ";         //8000
        unimilhar[8] = "NOVE MIL ";         //9000

        String [] cent;
        cent = new String[9];
        cent[0] = "CEM ";               //100
        cent[1] = "DUZENTOS ";          //200
        cent[2] = "TREZENTOS ";         //300
        cent[3] = "QUATROCENTOS ";      //400
        cent[4] = "QUINHENTOS ";        //500
        cent[5] = "SEISCENTOS ";        //600
        cent[6] = "SETECENTOS ";        //700
        cent[7] = "OITOCENTOS ";        //800
        cent[8] = "NOVECENTOS ";        //900

        String [] dez;
        dez = new String[9];
        dez[0] = "DEZ ";            //10
        dez[1] = "VINTE ";          //20
        dez[2] = "TRINTA ";         //30
        dez[3] = "QUARENTA ";       //40
        dez[4] = "CINQUENTA ";      //50
        dez[5] = "SESSENTA ";       //60
        dez[6] = "SETENTA ";        //70
        dez[7] = "OITENTA ";        //80
        dez[8] = "NOVENTA ";        //90

        String [] uni;
        uni = new String[9];
        uni[0] = "UM";          //1
        uni[1] = "DOIS";        //2
        uni[2] = "TRÊS";        //3
        uni[3] = "QUATRO";      //4
        uni[4] = "CINCO";       //5
        uni[5] = "SEIS";        //6
        uni[6] = "SETE";        //7
        uni[7] = "OITO";        //8
        uni[8] = "NOVE";        //9

        String cmilhoes = " ";      
        switch (n1) {       
            case 100000000:         
                cmilhoes = centmilhoes[0];
                break;
            case 200000000:
                cmilhoes = centmilhoes[1];
                break;
            case 300000000:
                cmilhoes = centmilhoes[2];
                break;
            case 400000000:
                cmilhoes = centmilhoes[3];
                break;
            case 500000000:
                cmilhoes = centmilhoes[4];
                break;
            case 600000000:
                cmilhoes = centmilhoes[5];
                break;
            case 700000000:
                cmilhoes = centmilhoes[6];
                break;
            case 800000000:
                cmilhoes = centmilhoes[7];
                break;
            case 900000000:
                cmilhoes = centmilhoes[8];
                break;
        }

        String dmilhoes = " ";      
        switch (n2) {       
            case 10000000:          
                dmilhoes = dezmilhoes[0];
                break;
            case 20000000:
                dmilhoes = dezmilhoes[1];
                break;
            case 30000000:
                dmilhoes = dezmilhoes[2];
                break;
            case 40000000:
                dmilhoes = dezmilhoes[3];
                break;
            case 50000000:
                dmilhoes = dezmilhoes[4];
                break;
            case 60000000:
                dmilhoes = dezmilhoes[5];
                break;
            case 70000000:
                dmilhoes = dezmilhoes[6];
                break;
            case 80000000:
                dmilhoes = dezmilhoes[7];
                break;
            case 90000000:
                dmilhoes = dezmilhoes[8];
                break;
        }

        String umilhoes = " ";      
        switch (n3) {       
            case 1000000:          
                umilhoes = unimilhoes[0];
                break;
            case 2000000:
                umilhoes = unimilhoes[1];
                break;
            case 3000000:
                umilhoes = unimilhoes[2];
                break;
            case 4000000:
                umilhoes = unimilhoes[3];
                break;
            case 5000000:
                umilhoes = unimilhoes[4];
                break;
            case 6000000:
                umilhoes = unimilhoes[5];
                break;
            case 7000000:
                umilhoes = unimilhoes[6];
                break;
            case 8000000:
                umilhoes = unimilhoes[7];
                break;
            case 9000000:
                umilhoes = unimilhoes[8];
                break;
        }

        String cmilhar = " ";       
        switch (n4) {       
            case 100000:            
                cmilhar = centmilhar[0];
                break;
            case 200000:
                cmilhar = centmilhar[1];
                break;
            case 300000:
                cmilhar = centmilhar[2];
                break;
            case 400000:
                cmilhar = centmilhar[3];
                break;
            case 500000:
                cmilhar = centmilhar[4];
                break;
            case 600000:
                cmilhar = centmilhar[5];
                break;
            case 700000:
                cmilhar = centmilhar[6];
                break;
            case 800000:
                cmilhar = centmilhar[7];
                break;
            case 900000:
                cmilhar = centmilhar[8];
                break;
        }

        String dmilhar = " ";       
        switch (n5) {       
            case 10000:             
                dmilhar = dezmilhar[0];
                break;
            case 20000:
                dmilhar = dezmilhar[1];
                break;
            case 30000:
                dmilhar = dezmilhar[2];
                break;
            case 40000:
                dmilhar = dezmilhar[3];
                break;
            case 50000:
                dmilhar = dezmilhar[4];
                break;
            case 60000:
                dmilhar = dezmilhar[5];
                break;
            case 70000:
                dmilhar = dezmilhar[6];
                break;
            case 80000:
                dmilhar = dezmilhar[7];
                break;
            case 90000:
                dmilhar = dezmilhar[8];
                break;
        }

        String umilhar = " ";       
        switch (n6) {       
            case 1000:              
                umilhar = unimilhar[0];
                break;
            case 2000:
                umilhar = unimilhar[1];
                break;
            case 3000:
                umilhar = unimilhar[2];
                break;
            case 4000:
                umilhar = unimilhar[3];
                break;
            case 5000:
                umilhar = unimilhar[4];
                break;
            case 6000:
                umilhar = unimilhar[5];
                break;
            case 7000:
                umilhar = unimilhar[6];
                break;
            case 8000:
                umilhar = unimilhar[7];
                break;
            case 9000:
                umilhar = unimilhar[8];
                break;
        }

        String ce = " ";        
        switch (n7) {       
            case 100:           
                ce = cent[0];
                break;
            case 200:
                ce = cent[1];
                break;
            case 300:
                ce = cent[2];
                break;
            case 400:
                ce = cent[3];
                break;
            case 500:
                ce = cent[4];
                break;
            case 600:
                ce = cent[5];
                break;
            case 700:
                ce = cent[6];
                break;
            case 800:
                ce = cent[7];
                break;
            case 900:
                ce = cent[8];
                break;
        }

        String de = " ";        
        switch (n8) {       
            case 10:            
                de = dez[0];
                break;
            case 20:
                de = dez[1];
                break;
            case 30:
                de = dez[2];
                break;
            case 40:
                de = dez[3];
                break;
            case 50:
                de = dez[4];
                break;
            case 60:
                de = dez[5];
                break;
            case 70:
                de = dez[6];
                break;
            case 80:
                de = dez[7];
                break;
            case 90:
                de = dez[8];
                break;
        }

        String un = " ";        
        switch (n9) {       
            case 1:             
                un = uni[0];
                break;
            case 2:
                un = uni[1];
                break;
            case 3:
                un = uni[2];
                break;
            case 4:
                un = uni[3];
                break;
            case 5:
                un = uni[4];
                break;
            case 6:
                un = uni[5];
                break;
            case 7:
                un = uni[6];
                break;
            case 8:
                un = uni[7];
                break;
            case 9:
                un = uni[8];
                break;
        }

        System.out.println(cmilhoes + dmilhoes + umilhoes + cmilhar + dmilhar + umilhar + ce + de + un);

        scan.close();
    }
}