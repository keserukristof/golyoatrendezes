/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.apache.commons.logging.Log;
import org.pmw.tinylog.Logger;

public class Tarolo {public static class __CLR4_3_13s3sjvqtfo1g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1558020930533L,8589935092L,211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A t\u00e1rol\u00f3 m\u00e9rete
     */
    private static int count = 16;


    /**
     * A t\u00f6mb amiben vagy 'p','f' vagy null \u00e9rt\u00e9k lehet
     */
    private Mezo[] tarolo = new Mezo[count];

    public Tarolo() {try{__CLR4_3_13s3sjvqtfo1g.R.inc(136);
        __CLR4_3_13s3sjvqtfo1g.R.inc(137);for (int i = 0; (((i < 3)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(138)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(139)==0&false)); ++i) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(140);tarolo[2 * i] = new Mezo(new Labda('p'));
            __CLR4_3_13s3sjvqtfo1g.R.inc(141);tarolo[2 * i + 1] = new Mezo(new Labda('f'));
        }
        }__CLR4_3_13s3sjvqtfo1g.R.inc(142);for (int i = 6; (((i < 16)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(143)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(144)==0&false)); ++i) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(145);tarolo[i] = new Mezo(null);
        }
    }}finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}


    public Tarolo(Mezo[] tarolo) {try{__CLR4_3_13s3sjvqtfo1g.R.inc(146);
        __CLR4_3_13s3sjvqtfo1g.R.inc(147);this.tarolo = tarolo;
    }finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}

    /**
     * Az aktu\u00e1lis t\u00e1rol\u00f3t rajzolja ki.
     */
    public void kirajzol() {try{__CLR4_3_13s3sjvqtfo1g.R.inc(148);
        __CLR4_3_13s3sjvqtfo1g.R.inc(149);for (int i = 0; (((i < tarolo.length)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(150)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(151)==0&false)); ++i) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(152);tarolo[i].kirajzol();
        }
        }__CLR4_3_13s3sjvqtfo1g.R.inc(153);System.out.println();
    }finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}

    public boolean probalKiemelni(int egyik, int masik){try{__CLR4_3_13s3sjvqtfo1g.R.inc(154);
        __CLR4_3_13s3sjvqtfo1g.R.inc(155);try {
            __CLR4_3_13s3sjvqtfo1g.R.inc(156);if ((((Math.abs(egyik - masik) != 1)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(157)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(158)==0&false))) {{
                __CLR4_3_13s3sjvqtfo1g.R.inc(159);Logger.error("Egym\u00e1s melletti mez\u0151ket adj meg!");
                __CLR4_3_13s3sjvqtfo1g.R.inc(160);return false;
            } }else {__CLR4_3_13s3sjvqtfo1g.R.inc(161);if ((((tarolo[egyik].ures() || tarolo[masik].ures())&&(__CLR4_3_13s3sjvqtfo1g.R.iget(162)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(163)==0&false))){{
                __CLR4_3_13s3sjvqtfo1g.R.inc(164);Logger.error("\u00dcres mez\u0151ket nem tudsz kiemelni!");
                __CLR4_3_13s3sjvqtfo1g.R.inc(165);return false;
            }}}__CLR4_3_13s3sjvqtfo1g.R.inc(166);;
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_3_13s3sjvqtfo1g.R.inc(167);Logger.error("T\u00fal nagy sz\u00e1mot adt\u00e1l meg!");
            __CLR4_3_13s3sjvqtfo1g.R.inc(168);return false;
        }
        __CLR4_3_13s3sjvqtfo1g.R.inc(169);return true;
    }finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}

    /**
     * @param golyo jelenti azt ,hogy melyik goly\u00f3t szeretn\u00e9nk kiemelni
     * @param cel jelenti azt ,hogy hova szeretn\u00e9nk visszrakni
     * @return egy true vagy false \u00e9rt\u00e9ket ami azt d\u00f6nti el ,hogy berakhatja e
     * a kiszemelt helyre a goly\u00f3t
     */
    public boolean probalBerakni(int golyo, int cel) {try{__CLR4_3_13s3sjvqtfo1g.R.inc(170);
        __CLR4_3_13s3sjvqtfo1g.R.inc(171);if ((((cel >= count - 1)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(172)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(173)==0&false))) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(174);Logger.info("T\u00fal nagy sz\u00e1mot adt\u00e1l meg.");
            __CLR4_3_13s3sjvqtfo1g.R.inc(175);return false;
        }
        }__CLR4_3_13s3sjvqtfo1g.R.inc(176);if ((((tarolo[cel].ures() && tarolo[cel + 1].ures())&&(__CLR4_3_13s3sjvqtfo1g.R.iget(177)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(178)==0&false))) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(179);tarolo[cel].setLabda(tarolo[golyo].torolLabda());
            __CLR4_3_13s3sjvqtfo1g.R.inc(180);tarolo[cel + 1].setLabda(tarolo[golyo + 1].torolLabda());
            __CLR4_3_13s3sjvqtfo1g.R.inc(181);return true;
        } }else {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(182);Logger.info("A c\u00e9lmez\u0151k nem \u00fcresek");
            __CLR4_3_13s3sjvqtfo1g.R.inc(183);return false;
        }
    }}finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}

    /**
     * Megvizsg\u00e1lja ,hogy a t\u00e1rol\u00f3 aktu\u00e1lis indexe \u00fcres-e.
     */
    public boolean ures(int index) {try{__CLR4_3_13s3sjvqtfo1g.R.inc(184);
        __CLR4_3_13s3sjvqtfo1g.R.inc(185);return tarolo[index].ures();
    }finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}

    /**
     * A f\u00fcggv\u00e9ny megvizsg\u00e1lja ,hogy az aktu\u00e1lis \u00e1ll\u00e1s megfelel e azoknak
     * a felt\u00e9teleknek ami a j\u00e1t\u00e9k megnyer\u00e9s\u00e9t biztos\u00edtja, ha megfelel akkor
     * true \u00e9rt\u00e9ket ad vissza egy\u00e9bk\u00e9nt pedig false \u00e9rt\u00e9ket
     */
    public boolean nyert() {try{__CLR4_3_13s3sjvqtfo1g.R.inc(186);
        __CLR4_3_13s3sjvqtfo1g.R.inc(187);for (int i = 0; (((i < tarolo.length)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(188)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(189)==0&false)); ++i) {{
            __CLR4_3_13s3sjvqtfo1g.R.inc(190);if ((((!tarolo[i].ures())&&(__CLR4_3_13s3sjvqtfo1g.R.iget(191)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(192)==0&false))) {{
                __CLR4_3_13s3sjvqtfo1g.R.inc(193);char piros = 'p';
                __CLR4_3_13s3sjvqtfo1g.R.inc(194);char fekete = 'f';
                __CLR4_3_13s3sjvqtfo1g.R.inc(195);for (int j = i; (((j < i + 3)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(196)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(197)==0&false)); ++j) {{
                    __CLR4_3_13s3sjvqtfo1g.R.inc(198);if ((((tarolo[j].getLabdaSzin() != piros)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(199)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(200)==0&false))) {{
                        __CLR4_3_13s3sjvqtfo1g.R.inc(201);return false;
                    }
                }}
                }__CLR4_3_13s3sjvqtfo1g.R.inc(202);for (int k = i + 3; (((k < i + 6)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(203)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(204)==0&false)); ++k) {{
                    __CLR4_3_13s3sjvqtfo1g.R.inc(205);if ((((tarolo[k].getLabdaSzin() != fekete)&&(__CLR4_3_13s3sjvqtfo1g.R.iget(206)!=0|true))||(__CLR4_3_13s3sjvqtfo1g.R.iget(207)==0&false))) {{
                        __CLR4_3_13s3sjvqtfo1g.R.inc(208);return false;
                    }
                }}
                }__CLR4_3_13s3sjvqtfo1g.R.inc(209);return true;
            }

        }}
        }__CLR4_3_13s3sjvqtfo1g.R.inc(210);return false;
    }finally{__CLR4_3_13s3sjvqtfo1g.R.flushNeeded();}}
}
