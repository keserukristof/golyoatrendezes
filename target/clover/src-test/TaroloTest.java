/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaroloTest {static class __CLR4_3_16i6ijvs6tfwa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1558103874471L,8589935092L,254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testKiemel() {__CLR4_3_16i6ijvs6tfwa.R.globalSliceStart(getClass().getName(),234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1adzu0q6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_16i6ijvs6tfwa.R.rethrow($CLV_t2$);}finally{__CLR4_3_16i6ijvs6tfwa.R.globalSliceEnd(getClass().getName(),"TaroloTest.testKiemel",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),234,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1adzu0q6i(){try{__CLR4_3_16i6ijvs6tfwa.R.inc(234);
        __CLR4_3_16i6ijvs6tfwa.R.inc(235);Tarolo tarolo = new Tarolo();
        __CLR4_3_16i6ijvs6tfwa.R.inc(236);assertTrue(tarolo.probalKiemelni(1,2));
        __CLR4_3_16i6ijvs6tfwa.R.inc(237);assertTrue(tarolo.probalKiemelni(3,4));
        __CLR4_3_16i6ijvs6tfwa.R.inc(238);assertFalse(tarolo.probalKiemelni(9,10));
        __CLR4_3_16i6ijvs6tfwa.R.inc(239);assertFalse(tarolo.probalKiemelni(13,15));
    }finally{__CLR4_3_16i6ijvs6tfwa.R.flushNeeded();}}

    @Test
    public void testBerak() {__CLR4_3_16i6ijvs6tfwa.R.globalSliceStart(getClass().getName(),240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_126shle6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_16i6ijvs6tfwa.R.rethrow($CLV_t2$);}finally{__CLR4_3_16i6ijvs6tfwa.R.globalSliceEnd(getClass().getName(),"TaroloTest.testBerak",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),240,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_126shle6o(){try{__CLR4_3_16i6ijvs6tfwa.R.inc(240);
        __CLR4_3_16i6ijvs6tfwa.R.inc(241);Tarolo tarolo = new Tarolo();
        __CLR4_3_16i6ijvs6tfwa.R.inc(242);assertTrue(tarolo.probalBerakni(1, 7));
        __CLR4_3_16i6ijvs6tfwa.R.inc(243);assertFalse(tarolo.probalBerakni(3, 5));
        __CLR4_3_16i6ijvs6tfwa.R.inc(244);assertFalse(tarolo.probalBerakni(2, 17));
    }finally{__CLR4_3_16i6ijvs6tfwa.R.flushNeeded();}}

    @Test
    public void testNyert() {__CLR4_3_16i6ijvs6tfwa.R.globalSliceStart(getClass().getName(),245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1nxpn736t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_16i6ijvs6tfwa.R.rethrow($CLV_t2$);}finally{__CLR4_3_16i6ijvs6tfwa.R.globalSliceEnd(getClass().getName(),"TaroloTest.testNyert",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),245,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1nxpn736t(){try{__CLR4_3_16i6ijvs6tfwa.R.inc(245);
        __CLR4_3_16i6ijvs6tfwa.R.inc(246);Tarolo tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('p'), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        __CLR4_3_16i6ijvs6tfwa.R.inc(247);assertTrue(tarolo.nyert());
        __CLR4_3_16i6ijvs6tfwa.R.inc(248);tarolo = new Tarolo(new Mezo[]{new Mezo('f'), new Mezo('f'), new Mezo('f'), new Mezo('p'), new Mezo('p'), new Mezo('p')});
        __CLR4_3_16i6ijvs6tfwa.R.inc(249);assertFalse(tarolo.nyert());
        __CLR4_3_16i6ijvs6tfwa.R.inc(250);tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('p'), new Mezo(null), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        __CLR4_3_16i6ijvs6tfwa.R.inc(251);assertFalse(tarolo.nyert());
        __CLR4_3_16i6ijvs6tfwa.R.inc(252);tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        __CLR4_3_16i6ijvs6tfwa.R.inc(253);assertFalse(tarolo.nyert());
    }finally{__CLR4_3_16i6ijvs6tfwa.R.flushNeeded();}}
}
