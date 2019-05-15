/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import java.io.Serializable;

/**
 * Az oszt\u00e1ly az XML f\u00e1jlba t\u00f6rt\u00e9n\u0151 ki\u00edr\u00e1shoz \u00e9s beolvas\u00e1shoz sz\u00fcgs\u00e9get gettereket
 * \u00e9s settereket tartalmazza
 */
public class Rekord implements Serializable {public static class __CLR4_3_13c3cjvpftwmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557937614051L,8589935092L,129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String nev;
    private int lepes;

    public Rekord() {try{__CLR4_3_13c3cjvpftwmx.R.inc(120);
    }finally{__CLR4_3_13c3cjvpftwmx.R.flushNeeded();}}

    public String getNev() {try{__CLR4_3_13c3cjvpftwmx.R.inc(121);
        __CLR4_3_13c3cjvpftwmx.R.inc(122);return nev;
    }finally{__CLR4_3_13c3cjvpftwmx.R.flushNeeded();}}

    public int getLepes() {try{__CLR4_3_13c3cjvpftwmx.R.inc(123);
        __CLR4_3_13c3cjvpftwmx.R.inc(124);return lepes;
    }finally{__CLR4_3_13c3cjvpftwmx.R.flushNeeded();}}

    public void setNev(String nev) {try{__CLR4_3_13c3cjvpftwmx.R.inc(125);
        __CLR4_3_13c3cjvpftwmx.R.inc(126);this.nev = nev;
    }finally{__CLR4_3_13c3cjvpftwmx.R.flushNeeded();}}

    public void setLepes(int lepes) {try{__CLR4_3_13c3cjvpftwmx.R.inc(127);
        __CLR4_3_13c3cjvpftwmx.R.inc(128);this.lepes = lepes;
    }finally{__CLR4_3_13c3cjvpftwmx.R.flushNeeded();}}



}
