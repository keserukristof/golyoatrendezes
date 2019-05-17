/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ *//**
 * A labda tulajdons\u00e1gait le\u00edr\u00f3 oszt\u00e1ly
 */
public class Labda {public static class __CLR4_3_11j1jjvs6tfst{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1558103874256L,8589935092L,61,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char szin;

    /**
     * @param szin: egy char tipus\u00fa v\u00e1ltoz\u00f3t k\u00e9r amely a j\u00e1t\u00e9k
     *            eset\u00e9ben vagy 'p' vagy 'f'
     */
    public Labda(char szin) {try{__CLR4_3_11j1jjvs6tfst.R.inc(55);
        __CLR4_3_11j1jjvs6tfst.R.inc(56);this.szin = szin;
    }finally{__CLR4_3_11j1jjvs6tfst.R.flushNeeded();}}


    /**
     * Kirajzolja a megadott sz\u00ednt
     */
    public void kirajzol() {try{__CLR4_3_11j1jjvs6tfst.R.inc(57);
        __CLR4_3_11j1jjvs6tfst.R.inc(58);System.out.print(szin);
    }finally{__CLR4_3_11j1jjvs6tfst.R.flushNeeded();}}


    /**
     * @return Visszaadja a mez\u0151 sz\u00edn\u00e9t.
     */
    public char getSzin() {try{__CLR4_3_11j1jjvs6tfst.R.inc(59);
        __CLR4_3_11j1jjvs6tfst.R.inc(60);return szin;
    }finally{__CLR4_3_11j1jjvs6tfst.R.flushNeeded();}}
}
