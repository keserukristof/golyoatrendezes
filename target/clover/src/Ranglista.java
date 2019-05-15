/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.pmw.tinylog.Logger;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Ranglista {public static class __CLR4_3_12g2gjvpftwmr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557937614051L,8589935092L,120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Rekord> rangsor = new ArrayList<>();

    public Ranglista() {try{__CLR4_3_12g2gjvpftwmr.R.inc(88);}finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}

    /**
     * @param nev a felhaszn\u00e1l\u00f3 neve
     * @param lepes a j\u00e1t\u00e9kban megtett l\u00e9p\u00e9ssz\u00e1m
     * Ha a rangsor m\u00e9rete nagyobb lesz mint 10 akkor az utols\u00f3t elt\u00e1vol\u00edtja
     *
     */
    public void beszurHaTud(String nev, int lepes) {try{__CLR4_3_12g2gjvpftwmr.R.inc(89);
        __CLR4_3_12g2gjvpftwmr.R.inc(90);Rekord rekord = new Rekord();
        __CLR4_3_12g2gjvpftwmr.R.inc(91);rekord.setNev(nev);
        __CLR4_3_12g2gjvpftwmr.R.inc(92);rekord.setLepes(lepes);
        __CLR4_3_12g2gjvpftwmr.R.inc(93);rangsor.add(rekord);
        __CLR4_3_12g2gjvpftwmr.R.inc(94);rangsor.sort(new RekordKomparator());
        __CLR4_3_12g2gjvpftwmr.R.inc(95);if ((((rangsor.size() > 10)&&(__CLR4_3_12g2gjvpftwmr.R.iget(96)!=0|true))||(__CLR4_3_12g2gjvpftwmr.R.iget(97)==0&false))) {{
            __CLR4_3_12g2gjvpftwmr.R.inc(98);rangsor.remove(10);
        }

    }}finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}

    /**
     * @return String\u00e9 alak\u00edtott ret \u00e9rt\u00e9k
     */
    @Override
    public String toString() {try{__CLR4_3_12g2gjvpftwmr.R.inc(99);
        __CLR4_3_12g2gjvpftwmr.R.inc(100);String ret = "";
        __CLR4_3_12g2gjvpftwmr.R.inc(101);for (Rekord r : rangsor) {{
            __CLR4_3_12g2gjvpftwmr.R.inc(102);ret += r.getNev() + " " + r.getLepes() + "\n";
        }
        }__CLR4_3_12g2gjvpftwmr.R.inc(103);return ret;
    }finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}

    public void listaz() {try{__CLR4_3_12g2gjvpftwmr.R.inc(104);
        __CLR4_3_12g2gjvpftwmr.R.inc(105);System.out.println(toString());
    }finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}


    /**
     * @param file a f\u00e1jl nev\u00e9t v\u00e1rja param\u00e9ter\u00fcl amibe ki fog \u00edrni
     */
    public void kiir(String file) {try{__CLR4_3_12g2gjvpftwmr.R.inc(106);
        __CLR4_3_12g2gjvpftwmr.R.inc(107);XMLEncoder encoder=null;
        __CLR4_3_12g2gjvpftwmr.R.inc(108);try {
            __CLR4_3_12g2gjvpftwmr.R.inc(109);encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(file)));
            __CLR4_3_12g2gjvpftwmr.R.inc(110);encoder.writeObject(rangsor);
            __CLR4_3_12g2gjvpftwmr.R.inc(111);encoder.close();
        } catch(FileNotFoundException fileNotFound){
            __CLR4_3_12g2gjvpftwmr.R.inc(112);Logger.error("ERROR: While Creating or Opening the File " + file);
        }

    }finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}


    /**
     * @param file a f\u00e1jl nev\u00e9t k\u00e9ri param\u00e9ter\u00fcl amib\u0151l beolvassa a ranglist\u00e1t
     */
    public void beolvas(String file) {try{__CLR4_3_12g2gjvpftwmr.R.inc(113);
        __CLR4_3_12g2gjvpftwmr.R.inc(114);XMLDecoder decoder = null;
        __CLR4_3_12g2gjvpftwmr.R.inc(115);try {
            __CLR4_3_12g2gjvpftwmr.R.inc(116);decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(file)));
            __CLR4_3_12g2gjvpftwmr.R.inc(117);rangsor = (ArrayList<Rekord>)decoder.readObject();__CLR4_3_12g2gjvpftwmr.R.inc(118);;
        } catch (FileNotFoundException e) {
            __CLR4_3_12g2gjvpftwmr.R.inc(119);Logger.error("ERROR: File " + file + " not found");
        }
    }finally{__CLR4_3_12g2gjvpftwmr.R.flushNeeded();}}

}
