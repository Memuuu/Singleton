
package singleton;

interface ayar{
    SingletonDeseni ayar(String konum, int boyut);
    
}

public class SingletonDeseni 
{
    protected static SingletonDeseni ayar = new SingletonDeseni();
   
    protected String mailKonum;
    protected int mailBoyut;
    
    protected String baslikKonum;
    protected int baslikBoyut;
    
    protected String icerikKonum;
    protected int icerikBoyut;
    
    protected SingletonDeseni(){}
    
    /*public static SingletonDeseni ayar (String mailKonum, int mailBoyut, String baslikKonum,int baslikBoyut,String icerikKonum,int icerikBoyut){
    
    
    ayar.baslikKonum=baslikKonum;
    ayar.baslikBoyut=baslikBoyut;
    ayar.icerikKonum=icerikKonum;
    ayar.icerikBoyut=icerikBoyut;
    return ayar;
    }*/
    
    public void yazdır(){
        System.out.println(ayar.mailKonum + " " + ayar.mailBoyut + "-- " + ayar.baslikKonum + " " + ayar.baslikBoyut + " --" + ayar.icerikKonum + " " + ayar.icerikBoyut);
    }
    
}    

class mail extends SingletonDeseni implements ayar{
    private mail(){}
    
    
    public SingletonDeseni ayar(String konum, int boyut){
        ayar.mailKonum=konum;
        ayar.mailBoyut=boyut;
        return ayar;
       
    }
}
class baslik extends SingletonDeseni implements ayar{
    private baslik(){}
    
    public SingletonDeseni ayar(String konum, int boyut){
        ayar.baslikKonum=konum;
        ayar.baslikBoyut=boyut;
        return ayar;
    }
}
class icerik extends SingletonDeseni implements ayar{
    private icerik(){}
    
    public SingletonDeseni ayar(String konum, int boyut){
        ayar.icerikKonum=konum;
        ayar.icerikBoyut=boyut;
        return ayar;
    }
}
