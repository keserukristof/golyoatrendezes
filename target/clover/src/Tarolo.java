/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.pmw.tinylog.Logger;

public class Tarolo {public static class __CLR4_3_13n3njvpehbjm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557935347237L,8589935092L,195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A t\u00e1rol\u00f3 m\u00e9rete
     */
    private static int count = 16;


    /**
     * A t\u00f6mb amiben vagy 'p','f' vagy null \u00e9rt\u00e9k lehet
     */
    private Mezo[] tarolo = new Mezo[count];

    public Tarolo() {try{__CLR4_3_13n3njvpehbjm.R.inc(131);
        __CLR4_3_13n3njvpehbjm.R.inc(132);for (int i = 0; (((i < 3)&&(__CLR4_3_13n3njvpehbjm.R.iget(133)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(134)==0&false)); ++i) {{
            __CLR4_3_13n3njvpehbjm.R.inc(135);tarolo[2 * i] = new Mezo(new Labda('p'));
            __CLR4_3_13n3njvpehbjm.R.inc(136);tarolo[2 * i + 1] = new Mezo(new Labda('f'));
        }
        }__CLR4_3_13n3njvpehbjm.R.inc(137);for (int i = 6; (((i < 16)&&(__CLR4_3_13n3njvpehbjm.R.iget(138)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(139)==0&false)); ++i) {{
            __CLR4_3_13n3njvpehbjm.R.inc(140);tarolo[i] = new Mezo(null);
        }
    }}finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}


    public Tarolo(Mezo[] tarolo) {try{__CLR4_3_13n3njvpehbjm.R.inc(141);
        __CLR4_3_13n3njvpehbjm.R.inc(142);this.tarolo = tarolo;
    }finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}

    /**
     * Az aktu\u00e1lis t\u00e1rol\u00f3t rajzolja ki.
     */
    public void kirajzol() {try{__CLR4_3_13n3njvpehbjm.R.inc(143);
        __CLR4_3_13n3njvpehbjm.R.inc(144);for (int i = 0; (((i < tarolo.length)&&(__CLR4_3_13n3njvpehbjm.R.iget(145)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(146)==0&false)); ++i) {{
            __CLR4_3_13n3njvpehbjm.R.inc(147);tarolo[i].kirajzol();
        }
        }__CLR4_3_13n3njvpehbjm.R.inc(148);System.out.println();
    }finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}

    /**
     * @param golyo jelenti azt ,hogy melyik goly\u00f3t szeretn\u00e9nk kiemelni
     * @param cel jelenti azt ,hogy hova szeretn\u00e9nk visszrakni
     * @return egy true vagy false \u00e9rt\u00e9ket ami azt d\u00f6nti el ,hogy berakhatja e
     * a kiszemelt helyre a goly\u00f3t
     */
    public boolean probalBerakni(int golyo, int cel) {try{__CLR4_3_13n3njvpehbjm.R.inc(149);
        __CLR4_3_13n3njvpehbjm.R.inc(150);if ((((cel >= count - 1)&&(__CLR4_3_13n3njvpehbjm.R.iget(151)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(152)==0&false))) {{
            __CLR4_3_13n3njvpehbjm.R.inc(153);Logger.info("T\u00fal nagy sz\u00e1mot adt\u00e1l meg.");
            __CLR4_3_13n3njvpehbjm.R.inc(154);return false;
        }
        }__CLR4_3_13n3njvpehbjm.R.inc(155);if ((((tarolo[golyo].ures() || tarolo[golyo + 1].ures())&&(__CLR4_3_13n3njvpehbjm.R.iget(156)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(157)==0&false))) {{
            __CLR4_3_13n3njvpehbjm.R.inc(158);Logger.info("Nincs goly\u00f3 a megadott mez\u0151n");
            __CLR4_3_13n3njvpehbjm.R.inc(159);return false;
        }
        }__CLR4_3_13n3njvpehbjm.R.inc(160);if ((((tarolo[cel].ures() && tarolo[cel].ures())&&(__CLR4_3_13n3njvpehbjm.R.iget(161)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(162)==0&false))) {{
            __CLR4_3_13n3njvpehbjm.R.inc(163);tarolo[cel].setLabda(tarolo[golyo].torolLabda());
            __CLR4_3_13n3njvpehbjm.R.inc(164);tarolo[cel + 1].setLabda(tarolo[golyo + 1].torolLabda());
            __CLR4_3_13n3njvpehbjm.R.inc(165);return true;
        } }else {{
            __CLR4_3_13n3njvpehbjm.R.inc(166);Logger.info("A c\u00e9lmez\u0151k nem \u00fcresek");
            __CLR4_3_13n3njvpehbjm.R.inc(167);return false;
        }
    }}finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}

    /**
     * @return az t\u00e1rol\u00f3 aktu\u00e1ls index\u00e9t \u00fcresre \u00e1ll\u00edtja
     */
    public boolean ures(int index) {try{__CLR4_3_13n3njvpehbjm.R.inc(168);
        __CLR4_3_13n3njvpehbjm.R.inc(169);return tarolo[index].ures();
    }finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}

    /**
     * A f\u00fcggv\u00e9ny megvizsg\u00e1lja ,hogy az aktu\u00e1lis \u00e1ll\u00e1s megfelel e azoknak
     * a felt\u00e9teleknek ami a j\u00e1t\u00e9k megnyer\u00e9s\u00e9t biztos\u00edtja, ha megfelel akkor
     * true \u00e9rt\u00e9ket ad vissza egy\u00e9bk\u00e9nt pedig false \u00e9rt\u00e9ket
     */
    public boolean nyert() {try{__CLR4_3_13n3njvpehbjm.R.inc(170);
        __CLR4_3_13n3njvpehbjm.R.inc(171);for (int i = 0; (((i < tarolo.length)&&(__CLR4_3_13n3njvpehbjm.R.iget(172)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(173)==0&false)); ++i) {{
            __CLR4_3_13n3njvpehbjm.R.inc(174);if ((((!tarolo[i].ures())&&(__CLR4_3_13n3njvpehbjm.R.iget(175)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(176)==0&false))) {{
                __CLR4_3_13n3njvpehbjm.R.inc(177);char piros = 'p';
                __CLR4_3_13n3njvpehbjm.R.inc(178);char fekete = 'f';
                __CLR4_3_13n3njvpehbjm.R.inc(179);for (int j = i; (((j < i + 3)&&(__CLR4_3_13n3njvpehbjm.R.iget(180)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(181)==0&false)); ++j) {{
                    __CLR4_3_13n3njvpehbjm.R.inc(182);if ((((tarolo[j].getLabdaSzin() != piros)&&(__CLR4_3_13n3njvpehbjm.R.iget(183)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(184)==0&false))) {{
                        __CLR4_3_13n3njvpehbjm.R.inc(185);return false;
                    }
                }}
                }__CLR4_3_13n3njvpehbjm.R.inc(186);for (int k = i + 3; (((k < i + 6)&&(__CLR4_3_13n3njvpehbjm.R.iget(187)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(188)==0&false)); ++k) {{
                    __CLR4_3_13n3njvpehbjm.R.inc(189);if ((((tarolo[k].getLabdaSzin() != fekete)&&(__CLR4_3_13n3njvpehbjm.R.iget(190)!=0|true))||(__CLR4_3_13n3njvpehbjm.R.iget(191)==0&false))) {{
                        __CLR4_3_13n3njvpehbjm.R.inc(192);return false;
                    }
                }}
                }__CLR4_3_13n3njvpehbjm.R.inc(193);return true;
            }

        }}
        }__CLR4_3_13n3njvpehbjm.R.inc(194);return false;
    }finally{__CLR4_3_13n3njvpehbjm.R.flushNeeded();}}
}
