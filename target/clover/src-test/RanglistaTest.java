/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RanglistaTest {static class __CLR4_3_15n5njvpj5gso{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557943192384L,8589935092L,226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBeszur(){__CLR4_3_15n5njvpj5gso.R.globalSliceStart(getClass().getName(),203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_15f510g5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15n5njvpj5gso.R.rethrow($CLV_t2$);}finally{__CLR4_3_15n5njvpj5gso.R.globalSliceEnd(getClass().getName(),"RanglistaTest.testBeszur",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),203,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_15f510g5n(){try{__CLR4_3_15n5njvpj5gso.R.inc(203);
        __CLR4_3_15n5njvpj5gso.R.inc(204);Ranglista ranglista = new Ranglista();
        __CLR4_3_15n5njvpj5gso.R.inc(205);ranglista.beszurHaTud("Kristof", 7);
        __CLR4_3_15n5njvpj5gso.R.inc(206);ranglista.beszurHaTud("M\u00e1t\u00e9", 5);
        __CLR4_3_15n5njvpj5gso.R.inc(207);ranglista.beszurHaTud("J\u00f3zsi", 9);
        __CLR4_3_15n5njvpj5gso.R.inc(208);ranglista.beszurHaTud("Andrea", 8);
        __CLR4_3_15n5njvpj5gso.R.inc(209);ranglista.beszurHaTud("Zolt\u00e1n", 12);
        __CLR4_3_15n5njvpj5gso.R.inc(210);ranglista.beszurHaTud("Kristof", 1);
        __CLR4_3_15n5njvpj5gso.R.inc(211);ranglista.beszurHaTud("M\u00e1t\u00e9", 2);
        __CLR4_3_15n5njvpj5gso.R.inc(212);ranglista.beszurHaTud("J\u00f3zsi", 3);
        __CLR4_3_15n5njvpj5gso.R.inc(213);ranglista.beszurHaTud("Andrea", 4);
        __CLR4_3_15n5njvpj5gso.R.inc(214);ranglista.beszurHaTud("Zolt\u00e1n", 6);
        __CLR4_3_15n5njvpj5gso.R.inc(215);ranglista.beszurHaTud("Zolt\u00e1n", 18);
        __CLR4_3_15n5njvpj5gso.R.inc(216);String elvart = "Krist\u00f3f 1\nM\u00e1t\u00e9 2\nJ\u00f3zsi 3\nAndrea 4\nM\u00e1t\u00e9 5\nZolt\u00e1n 6\nKrist\u00f3f 7\nAndrea 8\nJ\u00f3zsi 9\nZolt\u00e1n 12\n";
        //assertTrue(ranglista.toString().equals(elvart));

    }finally{__CLR4_3_15n5njvpj5gso.R.flushNeeded();}}

    @Test
    public void testXML(){__CLR4_3_15n5njvpj5gso.R.globalSliceStart(getClass().getName(),217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_12jtyh861();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15n5njvpj5gso.R.rethrow($CLV_t2$);}finally{__CLR4_3_15n5njvpj5gso.R.globalSliceEnd(getClass().getName(),"RanglistaTest.testXML",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),217,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_12jtyh861(){try{__CLR4_3_15n5njvpj5gso.R.inc(217);
        __CLR4_3_15n5njvpj5gso.R.inc(218);Ranglista ranglista = new Ranglista();
        __CLR4_3_15n5njvpj5gso.R.inc(219);ranglista.beszurHaTud("Kristof", 7);
        __CLR4_3_15n5njvpj5gso.R.inc(220);ranglista.beszurHaTud("M\u00e1t\u00e9", 5);
        __CLR4_3_15n5njvpj5gso.R.inc(221);ranglista.beszurHaTud("J\u00f3zsi", 9);
        __CLR4_3_15n5njvpj5gso.R.inc(222);ranglista.kiir("test.xml");
        __CLR4_3_15n5njvpj5gso.R.inc(223);Ranglista ranglista2 = new Ranglista();
        __CLR4_3_15n5njvpj5gso.R.inc(224);ranglista2.beolvas("test.xml");
        __CLR4_3_15n5njvpj5gso.R.inc(225);assertTrue(ranglista.toString().equals(ranglista2.toString()));

    }finally{__CLR4_3_15n5njvpj5gso.R.flushNeeded();}}
}
