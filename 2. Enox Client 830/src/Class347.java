/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347 {
    JS5 idx2;
    JS5 aClass243_3699;
    Class348 aClass348_3700 = new Class348(20);
    Class348 aClass348_3701 = new Class348(64);

    public Class358 method4176(int i, int i_0_) {
	try {
	    Class358 class358;
	    synchronized (((Class347) this).aClass348_3701) {
		class358 = (Class358) ((Class347) this).aClass348_3701.get((long) i);
	    }
	    if (null != class358)
		return class358;
	    byte[] is;
	    synchronized (((Class347) this).idx2) {
		is = (((Class347) this).idx2.getFile(-1006924897 * ConfigEntry.aClass120_1451.anInt1460, i));
	    }
	    class358 = new Class358();
	    ((Class358) class358).aClass347_3856 = this;
	    if (null != is)
		class358.method4277(new RsByteBuffer(is), -1860141420);
	    synchronized (((Class347) this).aClass348_3701) {
		((Class347) this).aClass348_3701.put(class358, (long) i);
	    }
	    return class358;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.a(").append(')').toString());
	}
    }

    public void method4177(short i) {
	try {
	    synchronized (((Class347) this).aClass348_3701) {
		((Class347) this).aClass348_3701.method4187();
	    }
	    synchronized (((Class347) this).aClass348_3700) {
		((Class347) this).aClass348_3700.method4187();
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.f(").append(')').toString());
	}
    }

    public void method4178(int i, int i_1_) {
	try {
	    synchronized (((Class347) this).aClass348_3701) {
		((Class347) this).aClass348_3701.method4186(i, -1794430367);
	    }
	    synchronized (((Class347) this).aClass348_3700) {
		((Class347) this).aClass348_3700.method4186(i, -1227911326);
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.b(").append(')').toString());
	}
    }

    public void method4179(int i) {
	try {
	    synchronized (((Class347) this).aClass348_3701) {
		((Class347) this).aClass348_3701.method4189();
	    }
	    synchronized (((Class347) this).aClass348_3700) {
		((Class347) this).aClass348_3700.method4189();
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.p(").append(')').toString());
	}
    }

    public Class347(Class411 class411, Class429 class429, JS5 class243, JS5 class243_2_) {
	((Class347) this).aClass243_3699 = class243_2_;
	((Class347) this).idx2 = class243;
	((Class347) this).idx2.getFileCountForArchive((ConfigEntry.aClass120_1451.anInt1460) * -1006924897, -790264977);
    }

    static final void method4180(Class403 class403, int i) {
	try {
	    Class390 class390 = (((Class403) class403).aBoolean5261 ? ((Class403) class403).aClass390_5247 : ((Class403) class403).aClass390_5246);
	    IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
	    Class119 class119 = ((Class390) class390).aClass119_4167;
	    Class486.method6157(class105, class119, class403, (byte) 55);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.fp(").append(')').toString());
	}
    }

    static final void method4181(Class403 class403, int i) {
	try {
	    int i_3_ = (((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]);
	    IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -22);
	    Class111.method1235(class105, class403, (byte) 0);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("om.qu(").append(')').toString());
	}
    }
}
