/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.pmw.tinylog.Logger;

import java.util.Scanner;

/**
 * Az oszt\u00e1ly l\u00e9nyegi r\u00e9sze a start() met\u00f3dus amely
 * bek\u00e9ri az adatokat \u00e9s kommunik\u00e1l a felhaszn\u00e1l\u00f3val.
 */
public class Controller {public static class __CLR4_3_100jvpftwkc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557937614051L,8589935092L,50,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Tarolo tarolo = new Tarolo();

    public void start() {try{__CLR4_3_100jvpftwkc.R.inc(0);
        __CLR4_3_100jvpftwkc.R.inc(1);Ranglista ranglista = new Ranglista();
        __CLR4_3_100jvpftwkc.R.inc(2);ranglista.beolvas("ranglista.xml");
        __CLR4_3_100jvpftwkc.R.inc(3);Logger.info("A ranglista.xml beolvas\u00e1sa sikeres volt.");
        __CLR4_3_100jvpftwkc.R.inc(4);ranglista.listaz();
        __CLR4_3_100jvpftwkc.R.inc(5);Scanner scanner = new Scanner(System.in);
        __CLR4_3_100jvpftwkc.R.inc(6);System.out.println("K\u00e9rem adja meg a nev\u00e9t!");
        __CLR4_3_100jvpftwkc.R.inc(7);String nev = scanner.next();
        __CLR4_3_100jvpftwkc.R.inc(8);System.out.println( "\u00dcdv\u00f6z\u00f6llek " + nev + "! R\u00f6viden ismertetn\u00e9m a j\u00e1t\u00e9k szab\u00e1lyait!");
        __CLR4_3_100jvpftwkc.R.inc(9);System.out.println("A 'p' karaketer jel\u00f6li a piros goly\u00f3t \u00e9s az 'f' karakter jel\u00f6li a fekete goly\u00f3t!");
        __CLR4_3_100jvpftwkc.R.inc(10);System.out.println("A j\u00e1t\u00e9k l\u00e9nyege hogy az \u00fcres mez\u0151k seg\u00edts\u00e9g\u00e9vel a goly\u00f3kat pppfff sorrendbe rakd az els\u0151 6 helyre.");
        __CLR4_3_100jvpftwkc.R.inc(11);System.out.println("Egyszerre 2 goly\u00f3t emelhetsz ki majd rakhatsz\u00e1t egy \u00fcres helyre(az \u00fcres helyet a '.' karakter jel\u00f6li!)");
        __CLR4_3_100jvpftwkc.R.inc(12);System.out.println("A l\u00e9p\u00e9seid sz\u00e1m\u00e1t sz\u00e1molni fogom \u00e9s ez alapj\u00e1n az eredm\u00e9nyed beker\u00fcl a fel\u00fcl l\u00e1that\u00f3 ranglist\u00e1ba.");
        __CLR4_3_100jvpftwkc.R.inc(13);System.out.println("Kezd\u0151dj\u00f6n a j\u00e1t\u00e9k!");
        __CLR4_3_100jvpftwkc.R.inc(14);System.out.println("------------------------------------------------------------------------------------------------------");
        __CLR4_3_100jvpftwkc.R.inc(15);int lepes = 0;
        __CLR4_3_100jvpftwkc.R.inc(16);while (true) {{
            __CLR4_3_100jvpftwkc.R.inc(17);int egyik = 0, masik = 0;
            __CLR4_3_100jvpftwkc.R.inc(18);tarolo.kirajzol();
            __CLR4_3_100jvpftwkc.R.inc(19);boolean error = true;
            __CLR4_3_100jvpftwkc.R.inc(20);while ((((error)&&(__CLR4_3_100jvpftwkc.R.iget(21)!=0|true))||(__CLR4_3_100jvpftwkc.R.iget(22)==0&false))) {{
                __CLR4_3_100jvpftwkc.R.inc(23);System.out.println("Melyik g\u00f3ly\u00f3t szeretn\u00e9d kiemelni?");
                __CLR4_3_100jvpftwkc.R.inc(24);egyik = scanner.nextInt();
                __CLR4_3_100jvpftwkc.R.inc(25);masik = scanner.nextInt();
                __CLR4_3_100jvpftwkc.R.inc(26);try {
                    __CLR4_3_100jvpftwkc.R.inc(27);if ((((Math.abs(egyik - masik) != 1)&&(__CLR4_3_100jvpftwkc.R.iget(28)!=0|true))||(__CLR4_3_100jvpftwkc.R.iget(29)==0&false))) {{
                        __CLR4_3_100jvpftwkc.R.inc(30);Logger.error("Szomsz\u00e9dos indexeket adj meg!");
                    } }else {{
                        __CLR4_3_100jvpftwkc.R.inc(31);error = false;
                    }
                }} catch (ArrayIndexOutOfBoundsException e) {
                    __CLR4_3_100jvpftwkc.R.inc(32);Logger.error("T\u00fal nagy sz\u00e1mot adt\u00e1l meg!");
                }
            }
            }__CLR4_3_100jvpftwkc.R.inc(33);int cel;
            __CLR4_3_100jvpftwkc.R.inc(34);do {{
                __CLR4_3_100jvpftwkc.R.inc(35);System.out.println("Hova szeretn\u00e9d visszarakni ezeket? (a bal indexet add meg!)");
                __CLR4_3_100jvpftwkc.R.inc(36);cel = scanner.nextInt();
            } }while ((((!tarolo.probalBerakni((((egyik < masik )&&(__CLR4_3_100jvpftwkc.R.iget(37)!=0|true))||(__CLR4_3_100jvpftwkc.R.iget(38)==0&false))? egyik - 1 : masik - 1, cel - 1))&&(__CLR4_3_100jvpftwkc.R.iget(39)!=0|true))||(__CLR4_3_100jvpftwkc.R.iget(40)==0&false)));
            __CLR4_3_100jvpftwkc.R.inc(41);++lepes;
            __CLR4_3_100jvpftwkc.R.inc(42);if ((((tarolo.nyert())&&(__CLR4_3_100jvpftwkc.R.iget(43)!=0|true))||(__CLR4_3_100jvpftwkc.R.iget(44)==0&false))) {{
                __CLR4_3_100jvpftwkc.R.inc(45);System.out.println("Nyert\u00e9l");
                __CLR4_3_100jvpftwkc.R.inc(46);ranglista.beszurHaTud(nev, lepes);
                __CLR4_3_100jvpftwkc.R.inc(47);ranglista.listaz();
                __CLR4_3_100jvpftwkc.R.inc(48);break;
            }
        }}
        }__CLR4_3_100jvpftwkc.R.inc(49);ranglista.kiir("ranglista.xml");
    }finally{__CLR4_3_100jvpftwkc.R.flushNeeded();}}



}
