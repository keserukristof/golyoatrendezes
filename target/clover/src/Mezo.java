/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */public class Mezo {public static class __CLR4_3_11s1sjvqtfo09{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u002f\u006d\u0061\u0076\u0065\u006e\u002f\u0067\u006f\u006c\u0079\u006f\u0061\u0074\u0072\u0065\u006e\u0064\u0065\u007a\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1558020930533L,8589935092L,93,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Labda labda = null;

    public Mezo(Labda labda) {try{__CLR4_3_11s1sjvqtfo09.R.inc(64);
        __CLR4_3_11s1sjvqtfo09.R.inc(65);this.labda = labda;
    }finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}


    public Mezo(char c) {try{__CLR4_3_11s1sjvqtfo09.R.inc(66);
        __CLR4_3_11s1sjvqtfo09.R.inc(67);this.labda = new Labda(c);
    }finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}

    public boolean ures() {try{__CLR4_3_11s1sjvqtfo09.R.inc(68);
        __CLR4_3_11s1sjvqtfo09.R.inc(69);return labda == null;
    }finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}

    public Labda getLabda() {try{__CLR4_3_11s1sjvqtfo09.R.inc(70);
        __CLR4_3_11s1sjvqtfo09.R.inc(71);return labda;
    }finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}

    public char getLabdaSzin() {try{__CLR4_3_11s1sjvqtfo09.R.inc(72);
        __CLR4_3_11s1sjvqtfo09.R.inc(73);if ((((labda == null)&&(__CLR4_3_11s1sjvqtfo09.R.iget(74)!=0|true))||(__CLR4_3_11s1sjvqtfo09.R.iget(75)==0&false)))
            {__CLR4_3_11s1sjvqtfo09.R.inc(76);return '.';
        }else
            {__CLR4_3_11s1sjvqtfo09.R.inc(77);return labda.getSzin();
    }}finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}

    public void setLabda(Labda l) {try{__CLR4_3_11s1sjvqtfo09.R.inc(78);
        __CLR4_3_11s1sjvqtfo09.R.inc(79);if ((((labda == null)&&(__CLR4_3_11s1sjvqtfo09.R.iget(80)!=0|true))||(__CLR4_3_11s1sjvqtfo09.R.iget(81)==0&false)))
            {__CLR4_3_11s1sjvqtfo09.R.inc(82);labda = l;
    }}finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}

    /**
     * @return f\u00fcggv\u00e9nyen bel\u00fcl defini\u00e1lt tmp seg\u00e9dv\u00e1ltoz\u00f3val t\u00e9r vissza
     */
    public Labda torolLabda() {try{__CLR4_3_11s1sjvqtfo09.R.inc(83);
        __CLR4_3_11s1sjvqtfo09.R.inc(84);Labda tmp = labda;
        __CLR4_3_11s1sjvqtfo09.R.inc(85);labda = null;
        __CLR4_3_11s1sjvqtfo09.R.inc(86);return tmp;
    }finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}


    /**
     * Ha a mez\u0151n van labda akkor kirajzolja azt,
     * egy\u00e9bk\u00e9nt '.' karaktert rak a hely\u00e9re
     */
    public void kirajzol() {try{__CLR4_3_11s1sjvqtfo09.R.inc(87);
        __CLR4_3_11s1sjvqtfo09.R.inc(88);if ((((labda != null)&&(__CLR4_3_11s1sjvqtfo09.R.iget(89)!=0|true))||(__CLR4_3_11s1sjvqtfo09.R.iget(90)==0&false)))
            {__CLR4_3_11s1sjvqtfo09.R.inc(91);labda.kirajzol();
        }else
            {__CLR4_3_11s1sjvqtfo09.R.inc(92);System.out.print(".");
    }}finally{__CLR4_3_11s1sjvqtfo09.R.flushNeeded();}}
}
