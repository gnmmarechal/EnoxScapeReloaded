/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class508 {
    public int anInt6214;
    JS5 aClass243_6215;
    public static ClanSettings aClass162_6216;

    public Class508(Class411 class411, Class429 class429, JS5 class243) {
	new Class348(64);
	((Class508) this).aClass243_6215 = class243;
	anInt6214 = (((Class508) this).aClass243_6215.getFileCountForArchive((-1006924897 * (ConfigEntry.aClass120_1420.anInt1460)), -2127064505) * 809853823);
    }

    static final void method6278(Class403 class403, int i) {
	try {
	    ((Class403) class403).anInt5239 -= -1175642067;
	    int i_0_ = (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239]);
	    int i_1_ = (((Class403) class403).anIntArray5244[1 + ((Class403) class403).anInt5239 * 681479919]);
	    int i_2_ = (((Class403) class403).anIntArray5244[2 + ((Class403) class403).anInt5239 * 681479919]);
	    Class359.method4291((((Class403) class403).aClass365_Sub1_Sub1_Sub2_5242.aClass119_10131), i_0_ & 0xffff, i_1_, i_2_, ((Class403) class403).aBoolean5261, class403, 2022077336);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.aoo(").append(')').toString());
	}
    }

    static final void method6279(boolean largeView, int i) {
	try {
	    RsBitsBuffer stream = ((Class25) pb.aClass25_8711).aClass298_Sub53_Sub2_333;
	    for (;;) {
		if (stream.method3660((-866602563 * (((Class25) pb.aClass25_8711).anInt336)), (byte) -70) < 15) {
		    if (i != 596994841)
			break;
		    return;
		}
		int npcIndex = stream.readBits(15);
		if (32767 == npcIndex) {
		    if (i == 596994841) {
			/* empty */
		    }
		    break;
		}
		boolean bool_4_ = false;
		Class298_Sub29 class298_sub29 = ((Class298_Sub29) pb.aClass437_8696.get((long) npcIndex));
		if (class298_sub29 == null) {
		    NPC class365_sub1_sub1_sub2_sub1 = (new NPC(pb.aClass283_8716.method2675(-1611682495)));
		    class365_sub1_sub1_sub2_sub1.anInt10064 = 1714292119 * npcIndex;
		    class298_sub29 = new Class298_Sub29(class365_sub1_sub1_sub2_sub1);
		    pb.aClass437_8696.method5817(class298_sub29, (long) npcIndex);
		    pb.aClass298_Sub29Array8816[(pb.anInt8772 += -118843751) * 1962237353 - 1] = class298_sub29;
		    bool_4_ = true;
		}
		NPC npc = ((NPC) class298_sub29.anObject7366);
		pb.anIntArray8699[(pb.anInt8703 += -409937273) * -1230451913 - 1] = npcIndex;
		npc.anInt10075 = -3704423 * pb.anInt8707;
		if (null != npc.aClass503_10190 && npc.aClass503_10190.method6242((byte) 88))
		    Class244.method2330(npc, (byte) 40);
		int i_5_ = (stream.readBits(3) + 4 << 11 & 0x3fff);
		int i_6_;
		if (largeView) {
		    i_6_ = stream.readBits(8);
		    if (i_6_ > 127)
			i_6_ -= 256;
		} else {
		    i_6_ = stream.readBits(5);
		    if (i_6_ > 15)
			i_6_ -= 32;
		}
		npc.method4464((Class15.aClass507_224.method6269(stream.readBits(15), 229452067)), 1407104224);
		int i_7_;
		if (largeView) {
		    i_7_ = stream.readBits(8);
		    if (i_7_ > 127)
			i_7_ -= 256;
		} else {
		    i_7_ = stream.readBits(5);
		    if (i_7_ > 15)
			i_7_ -= 32;
		}
		int i_8_ = stream.readBits(2);
		int i_9_ = stream.readBits(1);
		if (i_9_ == 1)
		    pb.anIntArray8706[(pb.anInt8808 += -386992021) * -976358333 - 1] = npcIndex;
		int i_10_ = stream.readBits(1);
		npc.method4421(-2095128707 * (npc.aClass503_10190.size), -1253182390);
		npc.anInt10115 = (-1186616623 * (-1927065533 * (npc.aClass503_10190.anInt6181) << 3));
		if (bool_4_)
		    npc.method4415(i_5_, true, -2079607043);
		npc.method4456(i_8_, i_7_ + (Class287.myPlayer.scenePositionXQueue[0]), i_6_ + (Class287.myPlayer.scenePositionYQueue[0]), 1 == i_10_, npc.getSize(), (byte) 58);
		if (npc.aClass503_10190.method6242((byte) -9))
		    AnimationDefinition.method4884(npc.plane, (npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), 0, null, npc, null, (byte) -66);
	    }
	    stream.finishBitAccess((byte) 38);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.jo(").append(')').toString());
	}
    }

    static final void method6280(Class403 class403, int i) {
	try {
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class495.method6195((byte) -1);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.acr(").append(')').toString());
	}
    }

    public static void method6281(int i, int i_11_) {
	try {
	    Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(20, (long) i);
	    class298_sub37_sub12.method3445(-1607796466);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.ax(").append(')').toString());
	}
    }

    static void method6282(int i, boolean bool, int i_12_) {
	try {
	    Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(22, (long) i);
	    class298_sub37_sub12.method3449((byte) 61);
	    ((Class298_Sub37_Sub12) class298_sub37_sub12).type = (bool ? 1 : 0) * 1274450087;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.ai(").append(')').toString());
	}
    }
}
