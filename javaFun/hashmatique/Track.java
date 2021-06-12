import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class Track {
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Smack","smack that.......");
        trackList.put("kdiamo","kadiammooooooo.....");
        trackList.put("hazeem","apriqi aredi.......");
        trackList.put("buateful","when i see you....");

    Set<String> keys=trackList.keySet();
        System.out.println(trackList.get("buateful"));
        for(String key:trackList.keySet()){
            System.out.println(key+":"+trackList.get(key));
        }
    }
}