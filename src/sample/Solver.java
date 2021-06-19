package sample;
import javax.sound.midi.ControllerEventListener;
import java.util.*;
import java.io.*;


public class Solver  {

    Controller obj=new Controller();
    
    public void input() throws IOException {
        obj.put=1;
        cross();
        f2l();
        oll();
        pll();
        check();
    }
    public void check() throws IOException {
        int wrong=0;
        for(int i=0;i<3;i++)
        {
            if(!Character.toString(obj.rubik[0][0][1].charAt(0)).equals(obj.rubik[0][1][1]))
            {
                UC();
            }
        }
        System.out.println("last move      "+obj.track);
        obj.track="";
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(i==1&j==1&&k==1) {
                        System.out.print("      ");
                        continue;
                    }
                    if(!obj.rubik[i][j][k].equals(obj.rubik2[i][j][k]))
                    {
                        wrong=1;
                        break;
                    }
                }
                if(wrong==1)
                {
                    break;
                }
            }
            if(wrong==1)
            {
                break;
            }
        }
        if(wrong==1)
        {
            System.out.println("---------------------------------------------------------------UNSOLVED----------------------------------------------------------------------------------------------------------------");
            System.out.println(obj.count);
        }
        else
        {
            obj.count++;
            System.out.println("SOLVED");
            System.out.println(obj.count);
        }
    }
    public void cross()////////////////////////////////WHITE
    {
        if(obj.times==5)
            return;
        String v="",p="";
        for(int i=0;i<3;i++)
            for(int j=1;j<3;j++)
                for(int k=0;k<3;k++)
                {
                    if(i==1&&j==1&&k==1)
                        continue;
                    if(obj.rubik[i][j][k].length()==3||obj.rubik[i][j][k].length()==1)
                        continue;
                    if(obj.rubik[i][j][k].charAt(0)=='W'||obj.rubik[i][j][k].charAt(1)=='W')
                    {
                        if(j!=0)
                        {
                            v=obj.rubik[i][j][k];
                            p=Integer.toString(i)+Integer.toString(j)+Integer.toString(k);
                        }
                    }
                }
        if(p.equals("010"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][0].charAt(0)=='W'||obj.rubik[1][0][0].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                LAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[0][0][1].charAt(0)=='W'||obj.rubik[0][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                FC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("012"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][2].charAt(0)=='W'||obj.rubik[1][0][2].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                RAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[0][0][1].charAt(0)=='W'||obj.rubik[0][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                FAC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("210"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][0].charAt(0)=='W'||obj.rubik[1][0][0].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                LC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[2][0][1].charAt(0)=='W'||obj.rubik[2][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                BAC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("212"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][2].charAt(0)=='W'||obj.rubik[1][0][2].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                RAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[2][0][1].charAt(0)=='W'||obj.rubik[2][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                BC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("021"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[0][0][1].charAt(0)=='W'||obj.rubik[0][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                FC();
                UC();
                LAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[0][0][1].charAt(0)=='W'||obj.rubik[0][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                FC();
                FC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("120"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][0].charAt(0)=='W'||obj.rubik[1][0][0].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                LAC();
                LAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][0].charAt(0)=='W'||obj.rubik[1][0][0].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                LAC();
                UAC();
                FC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("122"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][2].charAt(0)=='W'||obj.rubik[1][0][2].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                RC();
                RC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[1][0][2].charAt(0)=='W'||obj.rubik[1][0][2].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                RC();
                UC();
                FAC();
                obj.times++;
                cross();
            }
        }
        else if(p.equals("221"))
        {
            if(v.charAt(0)=='W')
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[2][0][1].charAt(0)=='W'||obj.rubik[2][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                BC();
                UC();
                RAC();
                obj.times++;
                cross();
            }
            else
            {
                for(int i=0;i<3;i++)
                {
                    if(obj.rubik[2][0][1].charAt(0)=='W'||obj.rubik[2][0][1].charAt(1)=='W')
                    {
                        UC();
                    }
                    else
                        break;
                }
                BC();
                BC();
                obj.times++;
                cross();
            }
        }
        p="";
        if(obj.cc==0){
            System.out.println("cross obj.track 1    "+obj.track);
            obj.track="";
            if(p.equals(""))
            {
                obj.cc=1;
                obj.times=5;
                for(int i=0;i<4;i++)
                {
                    if(obj.rubik[0][0][1].equals("BW"))
                    {
                        UC();LC();LC();
                    }
                    else if(obj.rubik[0][0][1].equals("RW"))
                    {
                        FC();FC();
                    }
                    else if(obj.rubik[0][0][1].equals("OW"))
                    {
                        UC();UC();BC();BC();
                    }
                    else if(obj.rubik[0][0][1].equals("GW"))
                    {
                        UAC();RC();RC();
                    }
                    else if(obj.rubik[1][0][0].equals("WB"))
                    {
                        LC();LC();
                    }
                    else if(obj.rubik[1][0][0].equals("WR"))
                    {
                        UAC();FC();FC();
                    }
                    else if(obj.rubik[1][0][0].equals("WO"))
                    {
                        UC();BC();BC();
                    }
                    else if(obj.rubik[1][0][0].equals("WG"))
                    {
                        UC();UC();RC();RC();
                    }
                    else if(obj.rubik[1][0][2].equals("WB"))
                    {
                        UC();UC();LC();LC();
                    }
                    else if(obj.rubik[1][0][2].equals("WR"))
                    {
                        UC();FC();FC();
                    }
                    else if(obj.rubik[1][0][2].equals("WO"))
                    {
                        UAC();BC();BC();
                    }
                    else if(obj.rubik[1][0][2].equals("WG"))
                    {
                        RC();RC();
                    }
                    else if(obj.rubik[2][0][1].equals("BW"))
                    {
                        UAC();LC();LC();
                    }
                    else if(obj.rubik[2][0][1].equals("RW"))
                    {
                        UC();UC();FC();FC();
                    }
                    else if(obj.rubik[2][0][1].equals("OW"))
                    {
                        BC();BC();
                    }
                    else if(obj.rubik[2][0][1].equals("GW"))
                    {
                        UC();RC();RC();
                    }
                    else if(obj.rubik[0][0][1].equals("WB"))
                    {
                        FAC();LC();FC();
                    }
                    else if(obj.rubik[0][0][1].equals("WR"))
                    {
                        UAC();RAC();FC();RC();
                    }
                    else if(obj.rubik[0][0][1].equals("WO"))
                    {
                        UC();LAC();BC();LC();
                    }
                    else if(obj.rubik[0][0][1].equals("WG"))
                    {
                        FC();RAC();FAC();
                    }
                    else if(obj.rubik[1][0][0].equals("BW"))
                    {
                        UAC();FAC();LC();FC();
                    }
                    else if(obj.rubik[1][0][0].equals("RW"))
                    {
                        LC();FAC();LAC();
                    }
                    else if(obj.rubik[1][0][0].equals("OW"))
                    {
                        LAC();BC();LC();
                    }
                    else if(obj.rubik[1][0][0].equals("GW"))
                    {
                        UC();BAC();RC();BC();
                    }
                    else if(obj.rubik[1][0][2].equals("BW"))
                    {
                        UC();FAC();LC();FC();
                    }
                    else if(obj.rubik[1][0][2].equals("RW"))
                    {
                        RAC();FC();RC();
                    }
                    else if(obj.rubik[1][0][2].equals("OW"))
                    {
                        RC();BAC();RAC();
                    }
                    else if(obj.rubik[1][0][2].equals("GW"))
                    {
                        UAC();BAC();RC();BC();
                    }
                    else if(obj.rubik[2][0][1].equals("WB"))
                    {
                        BC();LAC();BAC();
                    }
                    else if(obj.rubik[2][0][1].equals("WR"))
                    {
                        UC();RAC();FC();RC();
                    }
                    else if(obj.rubik[2][0][1].equals("WO"))
                    {
                        UC();RC();BAC();RAC();
                    }
                    else if(obj.rubik[2][0][1].equals("WG"))
                    {
                        BAC();RC();BC();
                    }
                }
                System.out.println("cross obj.track    "+obj.track);
                obj.track="";
                return;
            }
            else
                cross();
        }
    }
    public void pairSetter(String cp,String cn,String ep,String en)
    {
        if(en.equals("001"))
        {
            if(ep.equals("BR"))
            {
                LAC();UC();LC();
            }
            else if(ep.equals("RB"))
            {
                FAC();LC();FC();LAC();
            }
            else if(ep.equals("RG"))
            {
                FC();RAC();FAC();RC();
            }
            else if(ep.equals("GR"))
            {
                RC();UAC();RAC();
            }
            else if(ep.equals("GO"))
            {
                UAC();RC();BAC();RAC();BC();
            }
            else if(ep.equals("OG"))
            {
                BC();UAC();UAC();BAC();
            }
            else if(ep.equals("BO"))
            {
                UAC();LC();UAC();UAC();LAC();
            }
            else if(ep.equals("OB"))
            {
                BAC();UC();UC();BC();
            }
        }
        else if(en.equals("100"))
        {
            if(ep.equals("BR"))
            {
                FC();UAC();FAC();
            }
            else if(ep.equals("RB"))
            {
                LC();FAC();LAC();FC();
            }
            else if(ep.equals("RG"))
            {
                RC();UC();UC();RAC();
            }
            else if(ep.equals("GR"))
            {
                UAC();FC();RAC();FAC();RC();
            }
            else if(ep.equals("GO"))
            {
                UC();UC();BC();UAC();BAC();
            }
            else if(ep.equals("OG"))
            {
                RAC();UC();UC();RC();
            }
            else if(ep.equals("BO"))
            {
                BAC();UC();BC();
            }
            else if(ep.equals("OB"))
            {
                LAC();BC();LC();BAC();
            }
        }
        else if(en.equals("102"))
        {
            if(ep.equals("BR"))
            {
                UC();FAC();LC();FC();LAC();
            }
            else if(ep.equals("RB"))
            {
                LAC();UC();UC();LC();
            }
            else if(ep.equals("RG"))
            {
                RAC();FC();RC();FAC();
            }
            else if(ep.equals("GR"))
            {
                FAC();UC();FC();
            }
            else if(ep.equals("GO"))
            {
                BC();UAC();BAC();
            }
            else if(ep.equals("OG"))
            {
                RC();BAC();RAC();BC();
            }
            else if(ep.equals("BO"))
            {
                UAC();BC();LAC();BAC();LC();
            }
            else if(ep.equals("OB"))
            {
                LC();UAC();UAC();LAC();
            }
        }
        else if(en.equals("201"))
        {
            if(ep.equals("BR"))
            {
                UAC();LC();FAC();LAC();FC();
            }
            else if(ep.equals("RB"))
            {
                FC();UAC();UAC();FAC();
            }
            else if(ep.equals("RG"))
            {
                FAC();UC();UC();FC();
            }
            else if(ep.equals("GR"))
            {
                UC();RAC();FC();RC();FAC();
            }
            else if(ep.equals("GO"))
            {
                RAC();UC();RC();
            }
            else if(ep.equals("OG"))
            {
                BAC();RC();BC();RAC();
            }
            else if(ep.equals("BO"))
            {
                LC();UAC();LAC();
            }
            else if(ep.equals("OB"))
            {
                BC();LAC();BAC();LC();
            }
        }
        System.out.println("f2l      "+obj.track);
        obj.track="";
    }
    public void pairMaker(String cp,String cn,String ep,String en)
    {
        int p=0;
        if(cn.equals("000"))
        {
            if(cp.charAt(0)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();
                                    p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UC();LAC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UAC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UAC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UC();UC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UAC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(1)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UC();UC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BC();UC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UC();UC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UAC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(2)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UC();UC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UC();LC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UAC();LAC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UC();LC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
        }
        else if(cn.equals("002"))
        {
            if(cp.charAt(0)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UAC();RC();

                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                        System.out.println(obj.rubik[0][0][1]+" "+obj.rubik[1][0][0]+" "+obj.rubik[1][0][2]+" "+obj.rubik[2][2][1]);
                        System.out.println(obj.rubik[0][0][0]+" "+obj.rubik[0][0][2]+" "+obj.rubik[2][0][0]+" "+obj.rubik[2][0][2]);
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UC();UC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(1)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BC();UC();UC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UAC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UC();UC();LC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(2)=='W')
            {
                if(en.equals("201"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UC();UC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UAC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UC();RC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UAC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UAC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
        }
        else if(cn.equals("200"))
        {
            if(cp.charAt(0)=='W')
            {
                if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UAC();LC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BC();UC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BC();UC();UC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(1)=='W')
            {
                if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UC();UC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UAC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UC();UC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(2)=='W')
            {
                if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UC();UC();LC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UAC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("102"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UC();LC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UAC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UAC();LC();

                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
        }
        else if(cn.equals("202"))
        {
            if(cp.charAt(0)=='W')
            {
                if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UC();UC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][2]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();
                                }p++;
                            }
                            else
                                break;
                        }
                        BC();UAC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();
                                    p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UC();RAC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BC();UAC();BAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][1].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        BAC();UAC();BC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(1)=='W')
            {
                if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LC();UC();UC();LAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        LAC();UAC();LC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FAC();UC();UC();FC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                            {
                                if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        FC();UC();FAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
            else if(cp.charAt(2)=='W')
            {
                if(en.equals("100"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UAC();RAC();
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
                else if(en.equals("001"))
                {
                    if(ep.equals(Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                                {
                                    MDC();
                                    p++;
                                }
                            }
                            else
                                break;
                        }
                        RC();UC();UC();RAC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                    else if(ep.equals(Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0))))
                    {
                        for(int i=0;i<3;i++)
                        {
                            if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                            {
                                if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                                {
                                    MDC();p++;
                                }
                            }
                            else
                                break;
                        }
                        RAC();UC();RC();
                        for(int i=0;i<p;i++)
                        {
                            MDAC();
                        }
                    }
                }
            }
        }
        ep=edgeFinderAny(ep);
        en=edgeNoFinder(ep);
        cp=cornerFinderAny(cp);
        cn=cornerNoFinder(cp);
        pairSetter(cp,cn,ep,en);
    }
    public void f2l()
    {
        int p=0;
        String cp=cornerFinder(),cn=cornerNoFinder(cp),ep="0",en="0";
        if(obj.fl==10)
        {
            System.out.println("An error oobj.ccured");
            return;
        }
        if(obj.cf==4)
        {
            return;
        }
        if(cp.charAt(0)=='W')
        {
            ep=Character.toString(cp.charAt(1))+Character.toString(cp.charAt(2));
            en=edgeNoFinder(ep);
            if(en.equals("0"))
            {
                ep=Character.toString(cp.charAt(2))+Character.toString(cp.charAt(1));
                en=edgeNoFinder(ep);
            }
        }
        else if(cp.charAt(1)=='W')
        {
            ep=Character.toString(cp.charAt(0))+Character.toString(cp.charAt(2));
            en=edgeNoFinder(ep);
            if(en.equals("0"))
            {
                ep=Character.toString(cp.charAt(2))+Character.toString(cp.charAt(0));
                en=edgeNoFinder(ep);
            }
        }
        else if(cp.charAt(2)=='W')
        {
            ep=Character.toString(cp.charAt(0))+Character.toString(cp.charAt(1));
            en=edgeNoFinder(ep);
            if(en.equals("0"))
            {
                ep=Character.toString(cp.charAt(1))+Character.toString(cp.charAt(0));
                en=edgeNoFinder(ep);
            }
        }
        if(en.equals("010"))
        {

            if(cn.equals("020"))
            {
                LAC();UC();LC();
                cn="000";
                cp=obj.rubik[0][0][0];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("000"))
            {
                LAC();UC();LC();
                cn="202";
                cp=obj.rubik[2][0][2];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("202"))
            {
                LAC();UC();LC();
                cn="002";
                cp=obj.rubik[0][0][2];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("002"))
            {
                LAC();UAC();LC();
                cn="202";
                cp=obj.rubik[2][0][2];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("200"))
            {
                LAC();UC();UC();LC();
                en="102";
                ep=obj.rubik[1][0][2];
            }
            else
            {
                LAC();UC();LC();
                ep=edgeFinderAny(ep);
                en=edgeNoFinder(ep);
            }
        }
        else if(en.equals("012"))
        {

            if(cn.equals("022"))
            {
                RC();UAC();RAC();
                cn="002";
                cp=obj.rubik[0][0][2];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("002"))
            {
                RC();UAC();RAC();
                cn="200";
                cp=obj.rubik[2][0][0];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("200"))
            {
                RC();UAC();RAC();
                cn="000";
                cp=obj.rubik[0][0][0];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("000"))
            {
                RC();UC();RAC();
                cn="200";
                cp=obj.rubik[2][0][0];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("202"))
            {
                RC();UAC();UAC();RAC();
                en="100";
                ep=obj.rubik[1][0][0];
            }
            else
            {
                RC();UAC();RAC();
                ep=edgeFinderAny(ep);
                en=edgeNoFinder(ep);
            }
        }
        else if(en.equals("210"))
        {

            if(cn.equals("220"))
            {
                LC();UAC();LAC();
                cn="200";
                cp=obj.rubik[2][0][0];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("200"))
            {
                LC();UAC();LAC();
                cn="002";
                cp=obj.rubik[0][0][2];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("002"))
            {
                LC();UAC();LAC();
                cn="202";
                cp=obj.rubik[2][0][2];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("202"))
            {
                LC();UC();LAC();
                cn="002";
                cp=obj.rubik[0][0][2];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("000"))
            {
                LC();UAC();UAC();LAC();
                en="102";
                ep=obj.rubik[1][0][2];
            }
            else
            {
                LC();UC();LAC();
                ep=edgeFinderAny(ep);
                en=edgeNoFinder(ep);
            }
        }
        else if(en.equals("212"))
        {

            if(cn.equals("222"))
            {
                RAC();UC();RC();
                cn="202";
                cp=obj.rubik[2][0][2];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("202"))
            {
                RAC();UC();RC();
                cn="000";
                cp=obj.rubik[0][0][0];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("000"))
            {
                RAC();UC();RC();
                cn="200";
                cp=obj.rubik[2][0][0];
                en="001";
                ep=obj.rubik[0][0][1];
            }
            else if(cn.equals("200"))
            {
                RAC();UAC();RC();
                cn="000";
                cp=obj.rubik[0][0][0];
                en="201";
                ep=obj.rubik[2][0][1];
            }
            else if(cn.equals("002"))
            {
                RAC();UC();UC();RC();
                en="100";
                ep=obj.rubik[1][0][0];
            }
            else
            {
                RAC();UAC();RC();
                ep=edgeFinderAny(ep);
                en=edgeNoFinder(ep);
            }
        }
        if(cn.equals("020")||cn.equals("022")||cn.equals("220")||cn.equals("222"))
        {
            if(cn.equals("020"))
            {
                if(en.equals("001")||en.equals("201"))
                {
                    FC();UC();FAC();
                    cn="200";
                    cp=obj.rubik[2][0][0];
                    if(en.equals("201"))
                    {
                        en="102";
                        ep=obj.rubik[1][0][2];
                    }
                }
                else
                {
                    LAC();UAC();LC();
                    cn="002";
                    cp=obj.rubik[0][0][2];
                    if(en.equals("102"))
                    {
                        en="201";
                        ep=obj.rubik[2][0][1];
                    }
                }
            }
            else if(cn.equals("022"))
            {
                if(en.equals("001")||en.equals("201"))
                {
                    FAC();UAC();FC();
                    cn="202";
                    cp=obj.rubik[2][0][2];
                    if(en.equals("201"))
                    {
                        en="100";
                        ep=obj.rubik[1][0][0];
                    }
                }
                else
                {
                    RC();UC();RAC();
                    cn="000";
                    cp=obj.rubik[0][0][0];
                    if(en.equals("100"))
                    {
                        en="201";
                        ep=obj.rubik[2][0][1];
                    }
                }
            }
            else if(cn.equals("220"))
            {
                if(en.equals("001")||en.equals("201"))
                {
                    BAC();UAC();BC();
                    cn="000";
                    cp=obj.rubik[0][0][0];
                    if(en.equals("001"))
                    {
                        en="102";
                        ep=obj.rubik[1][0][2];
                    }
                }
                else
                {
                    LC();UC();LAC();
                    cn="202";
                    cp=obj.rubik[2][0][2];
                    if(en.equals("102"))
                    {
                        en="001";
                        ep=obj.rubik[0][0][1];
                    }
                }
            }
            else if(cn.equals("222"))
            {
                if(en.equals("001")||en.equals("201"))
                {
                    BC();UC();BAC();
                    cn="002";
                    cp=obj.rubik[0][0][2];
                    if(en.equals("001"))
                    {
                        en="100";
                        ep=obj.rubik[1][0][0];
                    }
                }
                else
                {
                    RAC();UAC();RC();
                    cn="200";
                    cp=obj.rubik[2][0][0];
                    if(en.equals("100"))
                    {
                        en="001";
                        ep=obj.rubik[0][0][1];
                    }
                }
            }
        }
        if(cn.equals("000")||cn.equals("002")||cn.equals("200")||cn.equals("202"))
        {
            if(cn.equals("000"))
            {
                if(en.equals("001"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                        {
                            if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }

                    LC();
                    UAC();
                    LAC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
                else if(en.equals("100"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                        {
                            if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    FAC();UC();FC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
            }
            else if(cn.equals("002"))
            {
                if(en.equals("001"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                        {
                            if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    RAC();UC();RC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
                else if(en.equals("102"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                        {
                            if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    FC();UAC();FAC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
            }
            else if(cn.equals("200"))
            {
                if(en.equals("100"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[2][1][2].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                        {
                            if(obj.rubik[2][1][2].equals(Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    BC();UAC();BAC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
                else if(en.equals("201"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[0][1][0].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                        {
                            if(obj.rubik[0][1][0].equals(Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    LAC();UC();LC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
            }
            else if(cn.equals("202"))
            {
                if(en.equals("201"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[0][1][2].charAt(0)).equals(obj.rubik[0][1][1]))&&(Character.toString(obj.rubik[0][1][2].charAt(1)).equals(obj.rubik[1][1][2])))
                        {
                            if(obj.rubik[0][1][2].equals(Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    RC();UAC();RAC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
                else if(en.equals("102"))
                {
                    for(int i=0;i<3;i++)
                    {
                        if((Character.toString(obj.rubik[2][1][0].charAt(0)).equals(obj.rubik[2][1][1]))&&(Character.toString(obj.rubik[2][1][0].charAt(1)).equals(obj.rubik[1][1][0])))
                        {
                            if(obj.rubik[2][1][0].equals(Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))))
                            {
                                MDC();
                                p++;
                            }
                        }
                        else
                            break;
                    }
                    BAC();UC();BC();
                    for(int i=0;i<p;i++)
                    {
                        MDAC();
                    }
                }
            }
        }
        ep=edgeFinderAny(ep);
        en=edgeNoFinder(ep);
        cp=cornerFinderAny(cp);
        cn=cornerNoFinder(cp);
        pairMaker(cp,cn,ep,en);
        obj.fl++;
        f2l();
    }
    public String cornerFinderAny(String p)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if((i==1&&j==1&&k==1)||(obj.rubik[i][j][k].length()==2||obj.rubik[i][j][k].length()==1))
                    {
                        continue;
                    }
                    if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(0))+Character.toString(p.charAt(1))+Character.toString(p.charAt(2))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(0))+Character.toString(p.charAt(2))+Character.toString(p.charAt(1))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(1))+Character.toString(p.charAt(0))+Character.toString(p.charAt(2))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(1))+Character.toString(p.charAt(2))+Character.toString(p.charAt(0))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(2))+Character.toString(p.charAt(1))+Character.toString(p.charAt(0))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(2))+Character.toString(p.charAt(0))+Character.toString(p.charAt(1))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                }
            }
        }
        return p;
    }
    public String cornerFinder()
    {
        String p="0";
        obj.cf=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i==1&&j==1&&k==1)
                    {
                        continue;
                    }
                    if(obj.rubik[i][j][k].length()==3)
                    {
                        if(obj.rubik[i][j][k].charAt(0)=='W'||obj.rubik[i][j][k].charAt(1)=='W'||obj.rubik[i][j][k].charAt(2)=='W')
                        {
                            if(j==2)
                                if(obj.rubik[i][j][k].charAt(1)=='W')
                                {
                                    if(obj.rubik[i][1][k].equals(Character.toString(obj.rubik[i][j][k].charAt(0))+Character.toString(obj.rubik[i][j][k].charAt(2))))
                                    {
                                        if(Character.toString(obj.rubik[i][1][k].charAt(0)).equals(obj.rubik[0][1][1])&&Character.toString(obj.rubik[i][1][k].charAt(1)).equals(obj.rubik[1][1][0])&&i==0&&k==0)
                                        {
                                            obj.cf++;
                                            continue;
                                        }
                                        else if(Character.toString(obj.rubik[i][1][k].charAt(0)).equals(obj.rubik[0][1][1])&&Character.toString(obj.rubik[i][1][k].charAt(1)).equals(obj.rubik[1][1][2])&&i==0&&k==2)
                                        {
                                            obj.cf++;
                                            continue;
                                        }
                                        else if(Character.toString(obj.rubik[i][1][k].charAt(0)).equals(obj.rubik[2][1][1])&&Character.toString(obj.rubik[i][1][k].charAt(1)).equals(obj.rubik[1][1][0])&&i==2&&k==0)
                                        {
                                            obj.cf++;
                                            continue;
                                        }
                                        else if(Character.toString(obj.rubik[i][1][k].charAt(0)).equals(obj.rubik[2][1][1])&&Character.toString(obj.rubik[i][1][k].charAt(1)).equals(obj.rubik[1][1][2])&&i==2&&k==2)
                                        {
                                            obj.cf++;
                                            continue;
                                        }
                                    }
                                }
                            p=obj.rubik[i][j][k];
                            return p;
                        }
                    }
                }
            }
        }
        return p;
    }
    public String cornerNoFinder(String piece)
    {
        String p="0";
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i==1&&j==1&&k==1)
                    {
                        continue;
                    }
                    if(obj.rubik[i][j][k].equals(piece))
                    {
                        p=Integer.toString(i)+Integer.toString(j)+Integer.toString(k);
                        return p;
                    }
                }
            }
        }
        return p;
    }
    public String edgeFinderAny(String p)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if((i==1&&j==1&&k==1)||(p.length()==1||p.length()==3))
                    {
                        continue;
                    }
                    if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(0))+Character.toString(p.charAt(1))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                    else if(obj.rubik[i][j][k].equals(Character.toString(p.charAt(1))+Character.toString(p.charAt(0))))
                    {
                        p=obj.rubik[i][j][k];
                        return p;
                    }
                }
            }
        }
        return p;
    }
    public String edgeNoFinder(String piece)
    {
        String p="0";
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i==1&&j==1&&k==1)
                    {
                        continue;
                    }
                    if(obj.rubik[i][j][k].equals(piece))
                    {
                        p=Integer.toString(i)+Integer.toString(j)+Integer.toString(k);
                        return p;
                    }
                }
            }
        }
        return p;
    }
    public void oll()
    {
        if(obj.f1==4)
        {
            return;
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {

                /*R U R' U R U2 R'*/
                RC();UC();RAC();UC();RC();UC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //R' U' R U' R' U2 R
                RAC();UAC();RC();UAC();RAC();UC();UC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*
                R U R' U R U' R' U R U2 R'*/
                RC();UC();RAC();UC();RC();UAC();RAC();UC();RC();UC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*R2 D R' U2 R D' R' U2 R'*/
                RC();RC();DC();RAC();UC();UC();RC();DAC();RAC();UC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*F' r U R' U' L' U l*/
                FAC();rC();UC();RAC();UAC();LAC();UC();lC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //R U2 R2 U' R2 U' R2 U2 R
                RC();UC();UC();RC();RC();UAC();RC();RC();UAC();RC();RC();UC();UC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*r U R' U' L' U l F'*/
                rC();UC();RAC();UAC();LAC();UC();lC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*R' U' F (U R U' R') F' R*/
                RAC();UAC();FC();UC();RC();UAC();RAC();FAC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(U2) r' R2 U R' U r U2 r' U M'
                UC();UC();rAC();RC();RC();UC();RAC();UC();rC();UC();UC();rAC();UC();MVC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //R' U2 r U' r' U2 r U r' U2 R
                RAC();UC();UC();rC();UAC();rAC();UC();UC();rC();UC();rAC();UC();UC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //R U2 R2 F R F' U2 R' F R F'
                RC();UC();UC();RC();RC();FC();RC();FAC();UC();UC();RAC();FC();RC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(U') r R2 U' R U' r' U2 r U' M
                UAC();rC();RC();RC();UAC();RC();UAC();rAC();UC();UC();rC();UAC();MVAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U R') U (R' F R F') U2 (R' F R F')
                RC();UC();RAC();UC();RAC();FC();RC();FAC();UC();UC();RAC();FC();RC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(U) R2 D' (r U r') D R2 (r' U r) U' (r' U' r)
                UC();RC();RC();DAC();rC();UC();rAC();DC();RC();RC();rAC();UC();rC();UAC();rAC();UAC();rC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //M U (R U R' U') M' (R' F R F')
                MVAC();UC();RC();UC();RAC();UAC();MVC();RAC();FC();RC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(r U R' U') M2 (U R U' R') U' M'
                rC();UC();RAC();UAC();MVC();MVC();UC();RC();UAC();RAC();UAC();MVC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                /*R U B' U' R' U R B R'*/
                RC();UC();BAC();UAC();RAC();UC();RC();BC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                /*(U2) R' U' (F R' F' R) U R*/
                UC();UC();RAC();UAC();FC();RAC();FAC();RC();UC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*F (U R U' R') F'*/
                FC();UC();RC();UAC();RAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*(L' U' L) U' (L' U L) U (L F' L' F)*/
                LAC();UAC();LC();UAC();LAC();UC();LC();UC();LC();FAC();LAC();FC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*(R U R') U (R U' R') U' (R' F R F')*/
                RC();UC();RAC();UC();RC();UAC();RAC();UAC();RAC();FC();RC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                /*F' (L' U' L U) (L' U' L U) F*/
                FAC();LAC();UAC();LC();UC();LAC();UAC();LC();UC();FC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //F (R U R' U') (R U R' U') F'
                FC();RC();UC();RAC();UAC();RC();UC();RAC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(r U' r2) (U r2 U) (r2 U' r)
                rC();UAC();rC();rC();UC();rC();rC();UC();rC();rC();UAC();rC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(l' U l2) (U' l2 U') (l2 U l')
                lAC();UC();lC();lC();UAC();lC();lC();UAC();lC();lC();UC();lAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //l' U' (L U' L' U) (L U' L' U2) l
                lAC();UAC();LC();UAC();LAC();UC();LC();UAC();LAC();UC();UC();lC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(U') r U2 R' U' (R U R' U') R U' r'
                UAC();rC();UC();UC();RAC();UAC();RC();UC();RAC();UAC();RC();UAC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U R' U') x D' (R' U R U') D x'
                if(obj.rubik[2][0][0].charAt(2)=='Y')
                {
                    RC();UC();RAC();UAC();xC();DAC();RAC();UC();RC();UAC();DC();xAC();
                    System.out.println("oll      "+obj.track);
                    obj.track="";
                    return;
                }
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //R' U' (R' F R F') U R
                //(U2) r' F' L' U L U' F r
                if(obj.rubik[0][0][2].charAt(2)=='Y'&&obj.rubik[1][0][2].charAt(1)=='Y'&&obj.rubik[2][0][2].charAt(2)=='Y')
                {
                    RAC();UAC();RAC();FC();RC();FAC();UC();RC();
                    System.out.println("oll      "+obj.track);
                    obj.track="";
                    return;
                }

            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U R' U') (R' F R F')
                RC();UC();RAC();UAC();RAC();FC();RC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //F (R U R' U') F'
                FC();RC();UC();RAC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(U2) F (U R U' R') (U R U' R') F'
                UC();UC();FC();UC();RC();UAC();RAC();UC();RC();UAC();RAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(U') F (U R U' R2') F' R U2 (R U2 R')
                UAC();FC();UC();RC();UAC();RC();RC();FAC();RC();UC();UC();RC();UC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(U) R' F R (U R U' R2) F' R2 U' R' U (R U R')
                UC();RAC();FC();RC();UC();RC();UAC();RC();RC();FAC();RC();RC();UAC();RAC();UC();RC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //F (R U R' U') R F' (r U R' U') r'
                FC();RC();UC();RAC();UAC();RC();FAC();rC();UC();RAC();UAC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //l' U2 L U L' U l
                lAC();UC();UC();LC();UC();LAC();UC();lC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //r U2 R' U' R U' r'
                rC();UC();UC();RAC();UAC();RC();UAC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //R' F (R U R' U') F' U R
                RAC();FC();RC();UC();RAC();UAC();FAC();UC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //L F' (L' U' L U) F U' L'
                LC();FAC();LAC();UAC();LC();UC();FC();UAC();LAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //r U R' U R U2 r'
                rC();UC();RAC();UC();RC();UC();UC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //l' U' L U' L' U2 l
                lAC();UAC();LC();UAC();LAC();UC();UC();lC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //r' (R2 U R' U R U2 R') U M'
                rAC();RC();RC();UC();RAC();UC();RC();UC();UC();RAC();UC();MVC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //r (R2 U' R U' R' U2 R) U' M
                rC();RC();RC();UAC();RC();UAC();RAC();UC();UC();RC();UAC();MVAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U R') y R' F (R U' R') F' R
                RC();UC();RAC();yC();RAC();FC();RC();UAC();RAC();FAC();RC();yAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(R U R' U') R' F (R2 U R' U') F'
                RC();UC();RAC();UAC();RAC();FC();RC();RC();UC();RAC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U2 R2) F R F' (R U2 R')
                RC();UC();UC();RC();RC();FC();RC();FAC();RC();UC();UC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //F (R U' R') U' (R U R') F'
                FC();RC();UAC();RAC();UAC();RC();UC();RAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //F (U R U' R2) F' R (U R U' R')
                FC();UC();RC();UAC();RC();RC();FAC();RC();UC();RC();UAC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //R' F (R U R') F' R (F U' F')
                RAC();FC();RC();UC();RAC();FAC();RC();FC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //R' F' R L' U' L U R' F R
                RAC();FAC();RC();LAC();UAC();LC();UC();RAC();FC();RC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(r U r') (R U R') U' (r U' r')
                rC();UC();rAC();RC();UC();RAC();UAC();rC();UAC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //r2 D' (r U r') D r2 U' (r' U' r)
                rC();rC();DAC();rC();UC();rAC();DC();rC();rC();UAC();rAC();UAC();rC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;

            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(2)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(2)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //F U l F' U R' D' R U' l'
                FC();UC();lC();FAC();UC();RAC();DAC();RC();UAC();lAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(0)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(R U R' U R U2 R') F (R U R' U') F'
                RC();UC();RAC();UC();RC();UC();UC();RAC();FC();RC();UC();RAC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(1)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R' U' R U' R' U2 R) F (R U R' U') F'
                RAC();UAC();RC();UAC();RAC();UC();UC();RC();FC();RC();UC();RAC();UAC();FAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(1)).equals("Y"))
            {
                //(r U R' U') r' R (U R U' R')
                rC();UC();RAC();UAC();rAC();RC();UC();RC();UAC();RAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        if(Character.toString(obj.rubik[0][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[0][0][2].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][0].charAt(1)).equals("Y")&&Character.toString(obj.rubik[2][0][2].charAt(1)).equals("Y"))
        {
            if(Character.toString(obj.rubik[0][0][1].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][0].charAt(0)).equals("Y")&&Character.toString(obj.rubik[1][0][2].charAt(0)).equals("Y")&&Character.toString(obj.rubik[2][0][1].charAt(0)).equals("Y"))
            {
                //(R U R' U') r R' (U R U' r')
                RC();UC();RAC();UAC();rC();RAC();UC();RC();UAC();rAC();
                System.out.println("oll      "+obj.track);
                obj.track="";
                return;
            }
        }
        UC();
        obj.f1++;
        oll();
        return;

    }
    public void pll()
    {
        if(obj.f2==4)
        {
            return;
        }
        char c10,c12,c20,c22,c30,c32,c40,c42,e1,e2,e3,e4;
        c10=obj.rubik[0][0][0].charAt(0);
        c12=obj.rubik[0][0][0].charAt(2);
        c20=obj.rubik[0][0][2].charAt(0);
        c22=obj.rubik[0][0][2].charAt(2);
        c30=obj.rubik[2][0][0].charAt(0);
        c32=obj.rubik[2][0][0].charAt(2);
        c40=obj.rubik[2][0][2].charAt(0);
        c42=obj.rubik[2][0][2].charAt(2);
        e1=obj.rubik[0][0][1].charAt(0);
        e2=obj.rubik[1][0][0].charAt(1);
        e3=obj.rubik[1][0][2].charAt(1);
        e4=obj.rubik[2][0][1].charAt(0);
        if(c10==e1&&e1==c20&&c12==e2&&c32==e2&&c30==e4&&c40==e4&&c42==e3&&e3==c22)
            return;
        if(c10==c20&&c12==c32&&c30==c40&&c22==c42&&c30==e4)
        {
            if(e2==c22&&e3==c10&&e1==c12)
            {
                //M2 U' M U2 M' U' M2
                MVC();MVC();UAC();MVAC();UC();UC();MVC();UAC();MVC();MVC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(e2==c10&&e3==c12&&e1==c22)
            {
                //M2 U M U2 M' U M2
                MVC();MVC();UC();MVAC();UC();UC();MVC();UC();MVAC();MVAC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
        }
        if(c10==c20&&c12==c32&&c30==c40&&c42==c22&&c30!=e4&&e1!=c10&&c12!=e2&&c42!=e3)
        {
            if(e4==c10)
            {
                //M2 U M2 U2 M2 U M2
                MVC();MVC();UC();MVC();MVC();UC();UC();MVC();MVC();UC();MVC();MVC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(e4==c12)
            {
                //M2 U M2 U M' U2 M2 U2 M'
                MVC();MVC();UC();MVC();MVC();UC();MVC();UC();UC();MVC();MVC();UC();UC();MVC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
        }
        if(c10==e1&&c12==e2&&c30==c40&&e3==c30)
        {
            //x R' U R' D2 R U' R' D2 R2
            xC();RAC();UC();RAC();DC();DC();RC();UAC();RAC();DC();DC();RC();RC();xAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c10==c20&&c32==e2&&c30==e4&&c10==e3)
        {
            //x' R U' R D2 R' U R D2 R2
            xAC();RC();UAC();RC();DC();DC();RAC();UC();RC();DC();DC();RC();RC();xC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c30==e4&&e4==c40&&c12==e1&&e1==c22)
        {
            //U' (R' U' F') (R U R' U' R' F R2 U' R' U' R U R') U R
            UAC();RAC();UAC();FAC();RC();UC();RAC();UAC();RAC();FC();RC();RC();UAC();RAC();UAC();RC();UC();RAC();UC();RC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c12==c32&&c10==e1&&c30==e4&&e1==c42)
        {
            //(R U R' U') R' F R2 U' R' U' (R U R') F'
            RC();UC();RAC();UAC();RAC();FC();RC();RC();UAC();RAC();UAC();RC();UC();RAC();FAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c12==c32)
        {
            if(c20==e1&&c22==e2&&e2==c30&&e1==c40)
            {
                //R2 u R' U R' U' R u' R2 y' R' U R
                RC();RC();uC();RAC();UC();RAC();UAC();RC();uAC();RC();RC();yAC();RAC();UC();RC();yC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(c42==e3&&c40==e2&&e2==c20&&e3==c10)
            {
                //U (F' U' F) R2 u (R' U R U') R u' R2
                UC();FAC();UAC();FC();RC();RC();uC();RAC();UC();RC();UAC();RC();uAC();RC();RC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(c22==e3&&c20==e2&&e2==c40&&e3==c30)
            {
                //(R U R' U') D R2 U' (R U' R') U R' U R2 D'
                RC();UC();RAC();UAC();DC();RC();RC();UAC();RC();UAC();RAC();UC();RAC();UC();RC();RC();DAC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(c40==e4&&c42==e2&&e2==c10&&e4==c20)
            {
                //U2 R2 F2 R U2 R U2 R' F R U R' U' R' F R2
                UC();UC();RC();RC();FC();FC();RC();UC();UC();RC();UC();UC();RAC();FC();RC();UC();RAC();UAC();RAC();FC();RC();RC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
            else if(c10==e1&&e1==c42&&c20==e3&&c40==e3&&e2==c30&&c22==e2)
            {
                //(R U R') F' (R U2 R') U2 R' F R U (R U2 R')
                RC();UC();RAC();FAC();RC();UC();UC();RAC();UC();UC();RAC();FC();RC();UC();RC();UC();UC();RAC();
                System.out.println("pll       "+obj.track);
                obj.track="";
                return;
            }
        }
        if(c10==c20&&c12==e2&&c32==e4&&e4==c42&&c20==e3&&e1==c22)
        {
            //(R' U2 R) U2 R' F (R U R' U') R' F' R2 U'
            RAC();UC();UC();RC();UC();UC();RAC();FC();RC();UC();RAC();UAC();RAC();FAC();RC();RC();UAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c10==e1&&c20==e1&&c32==e2&&c40==e4&&c22==e3)
        {
            //R' U L' U2 (R U' R') U2 R r
            RAC();UC();LAC();UC();UC();RC();UAC();RAC();UC();UC();RC();rC();xAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c12==e2&&e2==c32&&c30==e4&&e1==c20&&c42==e3)
        {
            //(R U R') F' (R U R' U') R' F R2 U' R'
            RC();UC();RAC();FAC();RC();UC();RAC();UAC();RAC();FC();RC();RC();UAC();RAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c12==c22&&c22==e4&&c10==e1&&e1==c30&&c20==e2&&e2==c40&&c32==e3&&e3==c42)
        {
            //F R' F R2 U' R' U' R U R' F' R U R' U' F'
            FC();RAC();FC();RC();RC();UAC();RAC();UAC();RC();UC();RAC();FAC();RC();UC();RAC();UAC();FAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c10==e2&&c30==e2&&c20==e3&&e3==c40&&c12==c22&&c22==e4&&e1==c32&&c32==e1)
        {
            //x' (R U' R') D (R U R') D' (R U R') D (R U' R') D'
            xAC();RC();UAC();RAC();DC();RC();UC();RAC();DAC();RC();UC();RAC();DC();RC();UAC();RAC();DAC();xC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c10==e1&&c12==e2&&c20==e3&&e3==c40&&c32==e4&&c42==e4)
        {
            //R' U R' U' y R' F' R2 U' R' U R' F R F
            RAC();UC();RAC();UAC();yC();RAC();FAC();RC();RC();UAC();RAC();UC();RAC();FC();RC();FC();yAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c10==e1&&c22==e3&&c32==e2&&c40==e4&&c20!=e1&&c12!=e2&&c42!=e3&&c30!=e4)
        {
            //R' U L' U2 R U' M' B r' U2 R U' L
            RAC();UC();LAC();UC();UC();RC();UAC();MVC();BC();rAC();UC();UC();RC();UAC();LC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        if(c12==e2&&e1==c20&&c30==e4&&c42==e3&&c10!=e1&&c32!=e2&&c22!=e3&&c40!=e4)
        {
            //R U R' U R U R' F' R U R' U' R' F R2 U' R' U2 R U' R'
            RC();UC();RAC();UC();RC();UC();RAC();FAC();RC();UC();RAC();UAC();RAC();FC();RC();RC();UAC();RAC();UC();UC();RC();UAC();RAC();
            System.out.println("pll       "+obj.track);
            obj.track="";
            return;
        }
        UC();
        obj.f2++;
        pll();
        return;
    }
    public void RC()
    {
        if (obj.put==1)
            obj.track=obj.track+" R";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));
    }
    public void RAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" R'";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));
    }
    public void LC()
    {
        if (obj.put==1)
            obj.track=obj.track+" L";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));
    }
    public void LAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" L'";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));
    }
    public void UC()
    {
        if (obj.put==1)
            obj.track=obj.track+" U";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
    }
    public void UAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" U'";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
    }
    public void DC()
    {
        if (obj.put==1)
            obj.track=obj.track+" D";
        String tmp1;
        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));
    }
    public void DAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" D'";
        String tmp1;
        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));
    }
    public void FC()
    {
        if (obj.put==1)
            obj.track=obj.track+" F";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1));
    }
    public void FAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" F'";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1));
    }
    public void BC()
    {
        if (obj.put==1)
            obj.track=obj.track+" B";
        String tmp1;
        tmp1=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=tmp1;
        tmp1=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=tmp1;
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1));
    }
    public void BAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" B'";
        String tmp1;
        tmp1=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=tmp1;
        tmp1=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=tmp1;
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1));
    }
    public void MVC()
    {
        if (obj.put==1)
            obj.track=obj.track+" M";
        String tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
    }
    public void MVAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" M'";
        String tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
    }
    public void MHC()
    {
        if (obj.put==1)
            obj.track=obj.track+" M";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));
    }
    public void MHAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" M";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));
    }
    public void MDC()
    {
        if (obj.put==1)
            obj.track=obj.track+" MD";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));



        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));
    }
    public void MDAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" MD'";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));

        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));
    }
    public void rC()
    {
        if (obj.put==1)
            obj.track=obj.track+" r";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));


        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
    }
    public void rAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" r'";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));


        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
    }
    public void lC()
    {
        if (obj.put==1)
            obj.track=obj.track+" l";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));


        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));

    }
    public void lAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" l'";
        String tmp1;
        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));



        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));

    }
    public void uC()
    {
        if (obj.put==1)
            obj.track=obj.track+" u";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));


        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
    }
    public void uAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" u'";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));


        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
    }
    public void xC()
    {
        if (obj.put==1)
            obj.track=obj.track+" x";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));

        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));



        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));
    }
    public void xAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" x'";
        String tmp1;
        tmp1=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0))+Character.toString(obj.rubik[0][0][2].charAt(2));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0))+Character.toString(obj.rubik[2][0][2].charAt(2));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0))+Character.toString(obj.rubik[2][2][2].charAt(2));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0))+Character.toString(obj.rubik[0][2][2].charAt(2));

        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][0][1];
        obj.rubik[1][0][1]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][2][1];
        obj.rubik[1][2][1]=tmp1;
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));


        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0))+Character.toString(obj.rubik[0][0][0].charAt(2));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0))+Character.toString(obj.rubik[2][0][0].charAt(2));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0))+Character.toString(obj.rubik[2][2][0].charAt(2));
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0))+Character.toString(obj.rubik[0][2][0].charAt(2));
    }
    public void yC()
    {
        if (obj.put==1)
            obj.track=obj.track+" y";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));

        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));


        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
    }
    public void yAC()
    {
        if (obj.put==1)
            obj.track=obj.track+" y'";
        String tmp1;
        tmp1=obj.rubik[0][1][0];
        obj.rubik[0][1][0]=obj.rubik[2][1][0];
        obj.rubik[2][1][0]=obj.rubik[2][1][2];
        obj.rubik[2][1][2]=obj.rubik[0][1][2];
        obj.rubik[0][1][2]=tmp1;
        tmp1=obj.rubik[0][1][1];
        obj.rubik[0][1][1]=obj.rubik[1][1][0];
        obj.rubik[1][1][0]=obj.rubik[2][1][1];
        obj.rubik[2][1][1]=obj.rubik[1][1][2];
        obj.rubik[1][1][2]=tmp1;
        obj.rubik[0][1][0]=Character.toString(obj.rubik[0][1][0].charAt(1))+Character.toString(obj.rubik[0][1][0].charAt(0));
        obj.rubik[2][1][0]=Character.toString(obj.rubik[2][1][0].charAt(1))+Character.toString(obj.rubik[2][1][0].charAt(0));
        obj.rubik[2][1][2]=Character.toString(obj.rubik[2][1][2].charAt(1))+Character.toString(obj.rubik[2][1][2].charAt(0));
        obj.rubik[0][1][2]=Character.toString(obj.rubik[0][1][2].charAt(1))+Character.toString(obj.rubik[0][1][2].charAt(0));

        tmp1=obj.rubik[0][2][0];
        obj.rubik[0][2][0]=obj.rubik[2][2][0];
        obj.rubik[2][2][0]=obj.rubik[2][2][2];
        obj.rubik[2][2][2]=obj.rubik[0][2][2];
        obj.rubik[0][2][2]=tmp1;
        tmp1=obj.rubik[0][2][1];
        obj.rubik[0][2][1]=obj.rubik[1][2][0];
        obj.rubik[1][2][0]=obj.rubik[2][2][1];
        obj.rubik[2][2][1]=obj.rubik[1][2][2];
        obj.rubik[1][2][2]=tmp1;
        obj.rubik[0][2][0]=Character.toString(obj.rubik[0][2][0].charAt(2))+Character.toString(obj.rubik[0][2][0].charAt(1))+Character.toString(obj.rubik[0][2][0].charAt(0));
        obj.rubik[2][2][0]=Character.toString(obj.rubik[2][2][0].charAt(2))+Character.toString(obj.rubik[2][2][0].charAt(1))+Character.toString(obj.rubik[2][2][0].charAt(0));
        obj.rubik[2][2][2]=Character.toString(obj.rubik[2][2][2].charAt(2))+Character.toString(obj.rubik[2][2][2].charAt(1))+Character.toString(obj.rubik[2][2][2].charAt(0));
        obj.rubik[0][2][2]=Character.toString(obj.rubik[0][2][2].charAt(2))+Character.toString(obj.rubik[0][2][2].charAt(1))+Character.toString(obj.rubik[0][2][2].charAt(0));
        obj.rubik[0][2][1]=Character.toString(obj.rubik[0][2][1].charAt(1))+Character.toString(obj.rubik[0][2][1].charAt(0));
        obj.rubik[1][2][0]=Character.toString(obj.rubik[1][2][0].charAt(1))+Character.toString(obj.rubik[1][2][0].charAt(0));
        obj.rubik[2][2][1]=Character.toString(obj.rubik[2][2][1].charAt(1))+Character.toString(obj.rubik[2][2][1].charAt(0));
        obj.rubik[1][2][2]=Character.toString(obj.rubik[1][2][2].charAt(1))+Character.toString(obj.rubik[1][2][2].charAt(0));


        tmp1=obj.rubik[0][0][0];
        obj.rubik[0][0][0]=obj.rubik[2][0][0];
        obj.rubik[2][0][0]=obj.rubik[2][0][2];
        obj.rubik[2][0][2]=obj.rubik[0][0][2];
        obj.rubik[0][0][2]=tmp1;
        tmp1=obj.rubik[0][0][1];
        obj.rubik[0][0][1]=obj.rubik[1][0][0];
        obj.rubik[1][0][0]=obj.rubik[2][0][1];
        obj.rubik[2][0][1]=obj.rubik[1][0][2];
        obj.rubik[1][0][2]=tmp1;
        obj.rubik[0][0][0]=Character.toString(obj.rubik[0][0][0].charAt(2))+Character.toString(obj.rubik[0][0][0].charAt(1))+Character.toString(obj.rubik[0][0][0].charAt(0));
        obj.rubik[2][0][0]=Character.toString(obj.rubik[2][0][0].charAt(2))+Character.toString(obj.rubik[2][0][0].charAt(1))+Character.toString(obj.rubik[2][0][0].charAt(0));
        obj.rubik[2][0][2]=Character.toString(obj.rubik[2][0][2].charAt(2))+Character.toString(obj.rubik[2][0][2].charAt(1))+Character.toString(obj.rubik[2][0][2].charAt(0));
        obj.rubik[0][0][2]=Character.toString(obj.rubik[0][0][2].charAt(2))+Character.toString(obj.rubik[0][0][2].charAt(1))+Character.toString(obj.rubik[0][0][2].charAt(0));
        obj.rubik[0][0][1]=Character.toString(obj.rubik[0][0][1].charAt(1))+Character.toString(obj.rubik[0][0][1].charAt(0));
        obj.rubik[1][0][0]=Character.toString(obj.rubik[1][0][0].charAt(1))+Character.toString(obj.rubik[1][0][0].charAt(0));
        obj.rubik[2][0][1]=Character.toString(obj.rubik[2][0][1].charAt(1))+Character.toString(obj.rubik[2][0][1].charAt(0));
        obj.rubik[1][0][2]=Character.toString(obj.rubik[1][0][2].charAt(1))+Character.toString(obj.rubik[1][0][2].charAt(0));
    }
}

