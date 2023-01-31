 

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Aeroport aeroport = Aeroport.getInstance();

        Runnable helloRunnable = new Runnable() {
            public void run() {
                aeroport.afisareCurse();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 120, TimeUnit.SECONDS);
        
        while(true){
            System.out.println("Introduceti comanda: ");
            String s = sc.nextLine();
            String cmd [] = s.split(" ");
            
            switch(cmd[0]){
                case "exit":
                    System.exit(0);
                    break;
                 
                case "adaugaCursaExterna":
                    double pretExt = Double.parseDouble(cmd[1]) * 0.9;
                    int nrPasageriExt = Integer.parseInt(cmd[2]);
                    boolean tradusaExt = Boolean.parseBoolean(cmd[3]);
                    String destinatieExt = cmd[4];
                    String taraLinieAerianaExt = cmd[5];

                    pretExt = tradusaExt ? pretExt * 1.15 : pretExt;
                    CurseExterne cf = new CurseExterne(pretExt, nrPasageriExt, tradusaExt, destinatieExt, taraLinieAerianaExt);
                    try
                    {
                        aeroport.adaugaCursa(cf);
                    }
                    catch (PreaMulteCurseException pmce)
                    {
                        pmce.printStackTrace();
                    }
                    
                    break;
                    
                case "adaugaCursaInterna":
                    double pretInt = Double.parseDouble(cmd[1]);
                    int nrPasageriInt = Integer.parseInt(cmd[2]);
                    boolean tradusaInt = Boolean.parseBoolean(cmd[3]);
                    String destinatieInt = cmd[4];
                    CurseInterne cg = new CurseInterne(pretInt, nrPasageriInt, tradusaInt, destinatieInt);
                    try
                    {
                        aeroport.adaugaCursa(cg);
                    }
                    catch (PreaMulteCurseException pmce)
                    {
                        pmce.printStackTrace();
                    }
                    break;
                    
                case "afisare":
                    aeroport.afisareCurse();
                    break;
                 
                case "afisareCurseExterne":
                    aeroport.afisareCurseExterne();
                    break;

                case "aflaTipCursa":
                    aeroport.afisareCurseExterne();
                    break;
            }
        }
        
        
    }
}