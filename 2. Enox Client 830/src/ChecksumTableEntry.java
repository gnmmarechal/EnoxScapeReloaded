/* Class242_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class ChecksumTableEntry extends Class242 {
	HashTable aClass437_7085;
	Class247 aClass247_7086;
	byte[] aByteArray7087;
	int anInt7088;
	Class329 aClass329_7089;
	Class298_Sub37_Sub16 aClass298_Sub37_Sub16_7090;
	Class255 aClass255_7091;
	int anInt7092 = 0;
	Class329 aClass329_7093;
	Class226 aClass226_7094;
	static byte aByte7095 = 0;
	static byte aByte7096 = 1;
	static byte aByte7097 = -1;
	byte[] aByteArray7098;
	static int anInt7099 = 1000;
	Class453 aClass453_7100;
	int anInt7101;
	boolean aBoolean7102;
	int anInt7103;
	static int anInt7104 = 0;
	Class453 aClass453_7105;
	boolean aBoolean7106;
	long aLong7107;
	int anInt7108;
	static int anInt7109 = 250;
	static CRC32 aCRC32_7110 = new CRC32();
	boolean aBoolean7111;
	static int anInt7112 = 1;
	static int anInt7113 = 2;

	public int method2270(int i) {
		try {
			if (method2250(2127930788) == null) {
				if (null == aClass298_Sub37_Sub16_7090)
					return 0;
				return aClass298_Sub37_Sub16_7090.method3468(-2104540777);
			}
			return 100;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.v(").append(')').toString());
		}
	}

	void method2260(int i) {
		if (null != aClass329_7093) {
			for (Class298 class298 = aClass453_7105.method5939(1766612795); null != class298; class298 = aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.hash == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.hash = (long) i * 4191220306876042991L;
			aClass453_7105.add(class298);
		}
	}

	void method2256(int i, short i_0_) {
		try {
			if (null != aClass329_7093) {
				for (Class298 class298 = aClass453_7105.method5939(1766612795); null != class298; class298 = aClass453_7105.method5944(49146)) {
					if (7051297995265073167L * class298.hash == (long) i)
						return;
				}
				Class298 class298 = new Class298();
				class298.hash = (long) i * 4191220306876042991L;
				aClass453_7105.add(class298);
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.b(").append(')').toString());
		}
	}

	Class298_Sub37_Sub16 method2271(int i, int i_1_, byte i_2_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
			if (class298_sub37_sub16 != null && 0 == i_1_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)) {
				class298_sub37_sub16.method2839(-1460969981);
				class298_sub37_sub16 = null;
			}
			if (null == class298_sub37_sub16) {
				if (i_1_ == 0) {
					if (aClass329_7093 != null && aByteArray7098[i] != -1)
						class298_sub37_sub16 = (aClass255_7091.method2430(i, aClass329_7093, -1787098666));
					else if (!aClass247_7086.method2340((byte) 14))
						class298_sub37_sub16 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, -393413622));
					else
						return null;
				}
				else if (i_1_ == 1) {
					if (aClass329_7093 == null)
						throw new RuntimeException();
					class298_sub37_sub16 = (aClass255_7091.method2429(i, aClass329_7093, (byte) -18));
				}
				else if (2 == i_1_) {
					if (null == aClass329_7093)
						throw new RuntimeException();
					if (-1 != aByteArray7098[i])
						throw new RuntimeException();
					if (!aClass247_7086.method2347((byte) -70))
						class298_sub37_sub16 = (aClass247_7086.method2338(anInt7088 * -553176479, i, (byte) 2, false, 67458398));
					else
						return null;
				}
				else
					throw new RuntimeException();
				aClass437_7085.method5817(class298_sub37_sub16, (long) i);
			}
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
				return null;
			byte[] is = class298_sub37_sub16.method3465((short) 657);
			if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
				Class298_Sub37_Sub16 class298_sub37_sub16_3_;
				try {
					if (null == is || is.length <= 2)
						throw new RuntimeException();
					aCRC32_7110.reset();
					aCRC32_7110.update(is, 0, is.length - 2);
					int i_4_ = (int) aCRC32_7110.getValue();
					if ((((Class226) aClass226_7094).entryCrcs[i]) != i_4_)
						throw new RuntimeException();
					if ((((Class226) aClass226_7094).entryHashes) != null && null != (((Class226) aClass226_7094).entryHashes[i])) {
						byte[] is_5_ = (((Class226) aClass226_7094).entryHashes[i]);
						byte[] is_6_ = Class152.method1654(is, 0, is.length - 2, (byte) 21);
						for (int i_7_ = 0; i_7_ < 64; i_7_++) {
							if (is_5_[i_7_] != is_6_[i_7_])
								throw new RuntimeException();
						}
					}
					int i_8_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
					if (i_8_ != ((((Class226) aClass226_7094).entryVersions[i]) & 0xffff))
						throw new RuntimeException();
					if (aByteArray7098[i] != 1) {
						if (aByteArray7098[i] != 0) {
							/* empty */
						}
						anInt7092 += 13538129;
						aByteArray7098[i] = (byte) 1;
					}
					if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
						class298_sub37_sub16.method2839(-1460969981);
					class298_sub37_sub16_3_ = class298_sub37_sub16;
				}
				catch (Exception exception) {
					aByteArray7098[i] = (byte) -1;
					class298_sub37_sub16.method2839(-1460969981);
					if ((((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672) && !aClass247_7086.method2340((byte) 14)) {
						RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, 61291917));
						aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
					}
					return null;
				}
				return class298_sub37_sub16_3_;
			}
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_9_ = (int) aCRC32_7110.getValue();
				if (i_9_ != (((Class226) aClass226_7094).entryCrcs[i]))
					throw new RuntimeException();
				if ((((Class226) aClass226_7094).entryHashes) != null && (null != (((Class226) aClass226_7094).entryHashes[i]))) {
					byte[] is_10_ = (((Class226) aClass226_7094).entryHashes[i]);
					byte[] is_11_ = Class152.method1654(is, 0, is.length - 2, (byte) -6);
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						if (is_10_[i_12_] != is_11_[i_12_])
							throw new RuntimeException();
					}
				}
				aClass247_7086.anInt2735 = 0;
				aClass247_7086.anInt2745 = 0;
			}
			catch (RuntimeException runtimeexception) {
				aClass247_7086.method2359(-1195501767);
				class298_sub37_sub16.method2839(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !aClass247_7086.method2340((byte) 14)) {
					RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, -791962540));
					aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			is[is.length - 2] = (byte) ((((Class226) aClass226_7094).entryVersions[i]) >>> 8);
			is[is.length - 1] = (byte) (((Class226) aClass226_7094).entryVersions[i]);
			if (aClass329_7093 != null) {
				aClass255_7091.method2431(i, is, aClass329_7093, -645332532);
				if (aByteArray7098[i] != 1) {
					anInt7092 += 13538129;
					aByteArray7098[i] = (byte) 1;
				}
			}
			if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
				class298_sub37_sub16.method2839(-1460969981);
			return class298_sub37_sub16;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.g(").append(')').toString());
		}
	}

	void method2272(byte i) {
		try {
			if (null != aClass453_7100 && method2250(2079218396) != null) {
				for (Class298 class298 = aClass453_7105.method5939(1766612795); class298 != null; class298 = aClass453_7105.method5944(49146)) {
					int i_13_ = (int) (7051297995265073167L * class298.hash);
					if (i_13_ < 0 || i_13_ >= -1583970959 * ((Class226) (aClass226_7094)).entrySize || 0 == (((Class226) aClass226_7094).childCounts[i_13_]))
						class298.method2839(-1460969981);
					else {
						if (aByteArray7098[i_13_] == 0)
							method2271(i_13_, 1, (byte) 96);
						if (-1 == aByteArray7098[i_13_])
							method2271(i_13_, 2, (byte) 26);
						if (1 == aByteArray7098[i_13_])
							class298.method2839(-1460969981);
					}
				}
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.e(").append(')').toString());
		}
	}

	void method2273(int i) {
		try {
			if (null != aClass453_7100) {
				if (method2250(2060715797) == null)
					return;
				if (aBoolean7102) {
					boolean bool = true;
					for (Class298 class298 = aClass453_7100.method5939(1766612795); null != class298; class298 = aClass453_7100.method5944(49146)) {
						int i_14_ = (int) (class298.hash * 7051297995265073167L);
						if (aByteArray7098[i_14_] == 0)
							method2271(i_14_, 1, (byte) 113);
						if (0 != aByteArray7098[i_14_])
							class298.method2839(-1460969981);
						else
							bool = false;
					}
					while (anInt7101 * 2044090087 < (((Class226) aClass226_7094).childCounts).length) {
						if (0 == (((Class226) aClass226_7094).childCounts[(2044090087 * anInt7101)]))
							anInt7101 += -303145769;
						else {
							if ((-2031048721 * ((Class255) (aClass255_7091)).anInt2793) >= 250) {
								bool = false;
								break;
							}
							if ((aByteArray7098[(2044090087 * anInt7101)]) == 0)
								method2271(2044090087 * (anInt7101), 1, (byte) 122);
							if ((aByteArray7098[(anInt7101 * 2044090087)]) == 0) {
								Class298 class298 = new Class298();
								class298.hash = ((long) anInt7101 * -1525375729483922519L);
								aClass453_7100.add(class298);
								bool = false;
							}
							anInt7101 += -303145769;
						}
					}
					if (bool) {
						aBoolean7102 = false;
						anInt7101 = 0;
					}
				}
				else if (aBoolean7111) {
					boolean bool = true;
					for (Class298 class298 = aClass453_7100.method5939(1766612795); null != class298; class298 = aClass453_7100.method5944(49146)) {
						int i_15_ = (int) (7051297995265073167L * class298.hash);
						if (aByteArray7098[i_15_] != 1)
							method2271(i_15_, 2, (byte) 80);
						if (1 == aByteArray7098[i_15_])
							class298.method2839(-1460969981);
						else
							bool = false;
					}
					while (2044090087 * anInt7101 < (((Class226) aClass226_7094).childCounts).length) {
						if ((((Class226) aClass226_7094).childCounts[2044090087 * anInt7101]) == 0)
							anInt7101 += -303145769;
						else {
							if (aClass247_7086.method2347((byte) 57)) {
								bool = false;
								break;
							}
							if (1 != (aByteArray7098[(2044090087 * anInt7101)]))
								method2271((anInt7101 * 2044090087), 2, (byte) 99);
							if (1 != (aByteArray7098[(anInt7101 * 2044090087)])) {
								Class298 class298 = new Class298();
								class298.hash = (-1525375729483922519L * (long) (anInt7101));
								aClass453_7100.add(class298);
								bool = false;
							}
							anInt7101 += -303145769;
						}
					}
					if (bool) {
						aBoolean7111 = false;
						anInt7101 = 0;
					}
				}
				else
					aClass453_7100 = null;
			}
			if (aBoolean7106 && (Class122.method1319((byte) 1) >= (aLong7107 * 2822951764100643313L))) {
				for (Class298_Sub37_Sub16 class298_sub37_sub16 = (Class298_Sub37_Sub16) aClass437_7085.method5816(1614241493); null != class298_sub37_sub16; class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.method5815((byte) -12))) {
					if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
						if (i == -1065641321)
							return;
					}
					else if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671) {
						if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
							throw new RuntimeException();
						class298_sub37_sub16.method2839(-1460969981);
					}
					else
						((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671 = true;
				}
				aLong7107 = ((Class122.method1319((byte) 1) + 1000L) * -7842795960219478255L);
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.c(").append(')').toString());
		}
	}

	ChecksumTableEntry(int i, Class329 class329, Class329 class329_16_, Class247 class247, Class255 class255, int i_17_, byte[] is, int i_18_, boolean bool) {
		aClass437_7085 = new HashTable(16);
		anInt7101 = 0;
		aClass453_7105 = new Class453();
		aLong7107 = 0L;
		anInt7088 = i * 160231841;
		aClass329_7093 = class329;
		if (null == aClass329_7093)
			aBoolean7102 = false;
		else {
			aBoolean7102 = true;
			aClass453_7100 = new Class453();
		}
		aClass329_7089 = class329_16_;
		aClass247_7086 = class247;
		aClass255_7091 = class255;
		anInt7108 = i_17_ * 235523743;
		aByteArray7087 = is;
		anInt7103 = 1761064455 * i_18_;
		aBoolean7106 = bool;
		if (null != aClass329_7089)
			aClass298_Sub37_Sub16_7090 = (aClass255_7091.method2430(anInt7088 * -553176479, aClass329_7089, -1787098666));
	}

	public int method2274(byte i) {
		try {
			return anInt7092 * -150039119;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.w(").append(')').toString());
		}
	}

	public int method2275(int i) {
		try {
			if (null == aClass226_7094)
				return 0;
			if (!aBoolean7102)
				return (-2145352941 * (((Class226) aClass226_7094).entryCount));
			Class298 class298 = aClass453_7100.method5939(1766612795);
			if (null == class298)
				return 0;
			return (int) (7051297995265073167L * class298.hash);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.j(").append(')').toString());
		}
	}

	byte[] method2252(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 95);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 9305);
		class298_sub37_sub16.method2839(-1460969981);
		return is;
	}

	Class226 method2264() {
		if (aClass226_7094 != null)
			return aClass226_7094;
		if (null == aClass298_Sub37_Sub16_7090) {
			if (aClass247_7086.method2340((byte) 14))
				return null;
			aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, 1341135400));
		}
		if (((Class298_Sub37_Sub16) aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = aClass298_Sub37_Sub16_7090.method3465((short) -18101);
		do {
			if (aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					aClass226_7094 = new Class226(is, (28953951 * anInt7108), aByteArray7087);
					if (1598805943 * anInt7103 != 201380083 * (((Class226) aClass226_7094).version))
						throw new RuntimeException();
					break;
				}
				catch (RuntimeException runtimeexception) {
					aClass226_7094 = null;
					if (aClass247_7086.method2340((byte) 14))
						aClass298_Sub37_Sub16_7090 = null;
					else
						aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, 694224083));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				aClass226_7094 = new Class226(is, 28953951 * anInt7108, aByteArray7087);
			}
			catch (RuntimeException runtimeexception) {
				aClass247_7086.method2359(-1690580411);
				aClass226_7094 = null;
				if (aClass247_7086.method2340((byte) 14))
					aClass298_Sub37_Sub16_7090 = null;
				else
					aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, anInt7088 * -553176479, (byte) 0, true, -1212933335));
				return null;
			}
			if (aClass329_7089 != null)
				aClass255_7091.method2431(-553176479 * anInt7088, is, aClass329_7089, 628603077);
		}
		while (false);
		aClass298_Sub37_Sub16_7090 = null;
		if (aClass329_7093 != null) {
			aByteArray7098 = new byte[(((Class226) aClass226_7094).entrySize) * -1583970959];
			anInt7092 = 0;
		}
		return aClass226_7094;
	}

	int method2253(int i, int i_19_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
			if (class298_sub37_sub16 != null)
				return class298_sub37_sub16.method3468(-2048847327);
			return 0;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	Class226 method2254() {
		if (aClass226_7094 != null)
			return aClass226_7094;
		if (null == aClass298_Sub37_Sub16_7090) {
			if (aClass247_7086.method2340((byte) 14))
				return null;
			aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, -1923437147));
		}
		if (((Class298_Sub37_Sub16) aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = aClass298_Sub37_Sub16_7090.method3465((short) 17552);
		do {
			if (aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					aClass226_7094 = new Class226(is, (28953951 * anInt7108), aByteArray7087);
					if (1598805943 * anInt7103 != 201380083 * (((Class226) aClass226_7094).version))
						throw new RuntimeException();
					break;
				}
				catch (RuntimeException runtimeexception) {
					aClass226_7094 = null;
					if (aClass247_7086.method2340((byte) 14))
						aClass298_Sub37_Sub16_7090 = null;
					else
						aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, -313120105));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				aClass226_7094 = new Class226(is, 28953951 * anInt7108, aByteArray7087);
			}
			catch (RuntimeException runtimeexception) {
				aClass247_7086.method2359(-1420399817);
				aClass226_7094 = null;
				if (aClass247_7086.method2340((byte) 14))
					aClass298_Sub37_Sub16_7090 = null;
				else
					aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, anInt7088 * -553176479, (byte) 0, true, 76396423));
				return null;
			}
			if (aClass329_7089 != null)
				aClass255_7091.method2431(-553176479 * anInt7088, is, aClass329_7089, -1430287423);
		}
		while (false);
		aClass298_Sub37_Sub16_7090 = null;
		if (aClass329_7093 != null) {
			aByteArray7098 = new byte[(((Class226) aClass226_7094).entrySize) * -1583970959];
			anInt7092 = 0;
		}
		return aClass226_7094;
	}

	byte[] method2251(int i, byte i_20_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
			if (null == class298_sub37_sub16)
				return null;
			byte[] is = class298_sub37_sub16.method3465((short) 6593);
			class298_sub37_sub16.method2839(-1460969981);
			return is;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.f(").append(')').toString());
		}
	}

	byte[] method2258(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 21);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -8951);
		class298_sub37_sub16.method2839(-1460969981);
		return is;
	}

	Class298_Sub37_Sub16 method2276(int i, int i_21_) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null && 0 == i_21_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && ((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
			class298_sub37_sub16.method2839(-1460969981);
			class298_sub37_sub16 = null;
		}
		if (null == class298_sub37_sub16) {
			if (i_21_ == 0) {
				if (aClass329_7093 != null && aByteArray7098[i] != -1)
					class298_sub37_sub16 = (aClass255_7091.method2430(i, aClass329_7093, -1787098666));
				else if (!aClass247_7086.method2340((byte) 14))
					class298_sub37_sub16 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, -418226880));
				else
					return null;
			}
			else if (i_21_ == 1) {
				if (aClass329_7093 == null)
					throw new RuntimeException();
				class298_sub37_sub16 = (aClass255_7091.method2429(i, aClass329_7093, (byte) -52));
			}
			else if (2 == i_21_) {
				if (null == aClass329_7093)
					throw new RuntimeException();
				if (-1 != aByteArray7098[i])
					throw new RuntimeException();
				if (!aClass247_7086.method2347((byte) -63))
					class298_sub37_sub16 = (aClass247_7086.method2338(anInt7088 * -553176479, i, (byte) 2, false, -620070396));
				else
					return null;
			}
			else
				throw new RuntimeException();
			aClass437_7085.method5817(class298_sub37_sub16, (long) i);
		}
		if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 369);
		if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
			Class298_Sub37_Sub16 class298_sub37_sub16_22_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_23_ = (int) aCRC32_7110.getValue();
				if ((((Class226) aClass226_7094).entryCrcs[i]) != i_23_)
					throw new RuntimeException();
				if ((((Class226) aClass226_7094).entryHashes) != null && (null != (((Class226) aClass226_7094).entryHashes[i]))) {
					byte[] is_24_ = (((Class226) aClass226_7094).entryHashes[i]);
					byte[] is_25_ = Class152.method1654(is, 0, is.length - 2, (byte) 3);
					for (int i_26_ = 0; i_26_ < 64; i_26_++) {
						if (is_24_[i_26_] != is_25_[i_26_])
							throw new RuntimeException();
					}
				}
				int i_27_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_27_ != ((((Class226) aClass226_7094).entryVersions[i]) & 0xffff))
					throw new RuntimeException();
				if (aByteArray7098[i] != 1) {
					if (aByteArray7098[i] != 0) {
						/* empty */
					}
					anInt7092 += 13538129;
					aByteArray7098[i] = (byte) 1;
				}
				if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
					class298_sub37_sub16.method2839(-1460969981);
				class298_sub37_sub16_22_ = class298_sub37_sub16;
			}
			catch (Exception exception) {
				aByteArray7098[i] = (byte) -1;
				class298_sub37_sub16.method2839(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !aClass247_7086.method2340((byte) 14)) {
					RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, 65779920));
					aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			return class298_sub37_sub16_22_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7110.reset();
			aCRC32_7110.update(is, 0, is.length - 2);
			int i_28_ = (int) aCRC32_7110.getValue();
			if (i_28_ != (((Class226) aClass226_7094).entryCrcs[i]))
				throw new RuntimeException();
			if ((((Class226) aClass226_7094).entryHashes) != null && null != (((Class226) aClass226_7094).entryHashes[i])) {
				byte[] is_29_ = (((Class226) aClass226_7094).entryHashes[i]);
				byte[] is_30_ = Class152.method1654(is, 0, is.length - 2, (byte) -72);
				for (int i_31_ = 0; i_31_ < 64; i_31_++) {
					if (is_29_[i_31_] != is_30_[i_31_])
						throw new RuntimeException();
				}
			}
			aClass247_7086.anInt2735 = 0;
			aClass247_7086.anInt2745 = 0;
		}
		catch (RuntimeException runtimeexception) {
			aClass247_7086.method2359(106727223);
			class298_sub37_sub16.method2839(-1460969981);
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !aClass247_7086.method2340((byte) 14)) {
				RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, 1559389901));
				aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class226) aClass226_7094).entryVersions[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class226) aClass226_7094).entryVersions[i]);
		if (aClass329_7093 != null) {
			aClass255_7091.method2431(i, is, aClass329_7093, 408687877);
			if (aByteArray7098[i] != 1) {
				anInt7092 += 13538129;
				aByteArray7098[i] = (byte) 1;
			}
		}
		if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
			class298_sub37_sub16.method2839(-1460969981);
		return class298_sub37_sub16;
	}

	byte[] method2259(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -19395);
		class298_sub37_sub16.method2839(-1460969981);
		return is;
	}

	int method2257(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2007766703);
		return 0;
	}

	int method2261(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2126560995);
		return 0;
	}

	Class298_Sub37_Sub16 method2277(int i, int i_32_) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null && 0 == i_32_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && ((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
			class298_sub37_sub16.method2839(-1460969981);
			class298_sub37_sub16 = null;
		}
		if (null == class298_sub37_sub16) {
			if (i_32_ == 0) {
				if (aClass329_7093 != null && aByteArray7098[i] != -1)
					class298_sub37_sub16 = (aClass255_7091.method2430(i, aClass329_7093, -1787098666));
				else if (!aClass247_7086.method2340((byte) 14))
					class298_sub37_sub16 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, 1037407823));
				else
					return null;
			}
			else if (i_32_ == 1) {
				if (aClass329_7093 == null)
					throw new RuntimeException();
				class298_sub37_sub16 = (aClass255_7091.method2429(i, aClass329_7093, (byte) -21));
			}
			else if (2 == i_32_) {
				if (null == aClass329_7093)
					throw new RuntimeException();
				if (-1 != aByteArray7098[i])
					throw new RuntimeException();
				if (!aClass247_7086.method2347((byte) -55))
					class298_sub37_sub16 = (aClass247_7086.method2338(anInt7088 * -553176479, i, (byte) 2, false, -835440234));
				else
					return null;
			}
			else
				throw new RuntimeException();
			aClass437_7085.method5817(class298_sub37_sub16, (long) i);
		}
		if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -10519);
		if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
			Class298_Sub37_Sub16 class298_sub37_sub16_33_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_34_ = (int) aCRC32_7110.getValue();
				if ((((Class226) aClass226_7094).entryCrcs[i]) != i_34_)
					throw new RuntimeException();
				if ((((Class226) aClass226_7094).entryHashes) != null && (null != (((Class226) aClass226_7094).entryHashes[i]))) {
					byte[] is_35_ = (((Class226) aClass226_7094).entryHashes[i]);
					byte[] is_36_ = Class152.method1654(is, 0, is.length - 2, (byte) 67);
					for (int i_37_ = 0; i_37_ < 64; i_37_++) {
						if (is_35_[i_37_] != is_36_[i_37_])
							throw new RuntimeException();
					}
				}
				int i_38_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_38_ != ((((Class226) aClass226_7094).entryVersions[i]) & 0xffff))
					throw new RuntimeException();
				if (aByteArray7098[i] != 1) {
					if (aByteArray7098[i] != 0) {
						/* empty */
					}
					anInt7092 += 13538129;
					aByteArray7098[i] = (byte) 1;
				}
				if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
					class298_sub37_sub16.method2839(-1460969981);
				class298_sub37_sub16_33_ = class298_sub37_sub16;
			}
			catch (Exception exception) {
				aByteArray7098[i] = (byte) -1;
				class298_sub37_sub16.method2839(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !aClass247_7086.method2340((byte) 14)) {
					RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, -155086608));
					aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			return class298_sub37_sub16_33_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7110.reset();
			aCRC32_7110.update(is, 0, is.length - 2);
			int i_39_ = (int) aCRC32_7110.getValue();
			if (i_39_ != (((Class226) aClass226_7094).entryCrcs[i]))
				throw new RuntimeException();
			if ((((Class226) aClass226_7094).entryHashes) != null && null != (((Class226) aClass226_7094).entryHashes[i])) {
				byte[] is_40_ = (((Class226) aClass226_7094).entryHashes[i]);
				byte[] is_41_ = Class152.method1654(is, 0, is.length - 2, (byte) -11);
				for (int i_42_ = 0; i_42_ < 64; i_42_++) {
					if (is_40_[i_42_] != is_41_[i_42_])
						throw new RuntimeException();
				}
			}
			aClass247_7086.anInt2735 = 0;
			aClass247_7086.anInt2745 = 0;
		}
		catch (RuntimeException runtimeexception) {
			aClass247_7086.method2359(556604655);
			class298_sub37_sub16.method2839(-1460969981);
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !aClass247_7086.method2340((byte) 14)) {
				RemoteRequest class298_sub37_sub16_sub1 = (aClass247_7086.method2338(-553176479 * anInt7088, i, (byte) 2, true, -1299366949));
				aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class226) aClass226_7094).entryVersions[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class226) aClass226_7094).entryVersions[i]);
		if (aClass329_7093 != null) {
			aClass255_7091.method2431(i, is, aClass329_7093, 1120335343);
			if (aByteArray7098[i] != 1) {
				anInt7092 += 13538129;
				aByteArray7098[i] = (byte) 1;
			}
		}
		if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
			class298_sub37_sub16.method2839(-1460969981);
		return class298_sub37_sub16;
	}

	Class226 method2255() {
		if (aClass226_7094 != null)
			return aClass226_7094;
		if (null == aClass298_Sub37_Sub16_7090) {
			if (aClass247_7086.method2340((byte) 14))
				return null;
			aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, -1646455310));
		}
		if (((Class298_Sub37_Sub16) aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = aClass298_Sub37_Sub16_7090.method3465((short) 15445);
		do {
			if (aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					aClass226_7094 = new Class226(is, (28953951 * anInt7108), aByteArray7087);
					if (1598805943 * anInt7103 != 201380083 * (((Class226) aClass226_7094).version))
						throw new RuntimeException();
					break;
				}
				catch (RuntimeException runtimeexception) {
					aClass226_7094 = null;
					if (aClass247_7086.method2340((byte) 14))
						aClass298_Sub37_Sub16_7090 = null;
					else
						aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, -1760474693));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				aClass226_7094 = new Class226(is, 28953951 * anInt7108, aByteArray7087);
			}
			catch (RuntimeException runtimeexception) {
				aClass247_7086.method2359(-1856562324);
				aClass226_7094 = null;
				if (aClass247_7086.method2340((byte) 14))
					aClass298_Sub37_Sub16_7090 = null;
				else
					aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, anInt7088 * -553176479, (byte) 0, true, 1078557293));
				return null;
			}
			if (aClass329_7089 != null)
				aClass255_7091.method2431(-553176479 * anInt7088, is, aClass329_7089, -1078065022);
		}
		while (false);
		aClass298_Sub37_Sub16_7090 = null;
		if (aClass329_7093 != null) {
			aByteArray7098 = new byte[(((Class226) aClass226_7094).entrySize) * -1583970959];
			anInt7092 = 0;
		}
		return aClass226_7094;
	}

	public void method2278(byte i) {
		try {
			if (aClass329_7093 != null) {
				aBoolean7111 = true;
				if (aClass453_7100 == null)
					aClass453_7100 = new Class453();
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.o(").append(')').toString());
		}
	}

	Class226 method2250(int i) {
		try {
			if (aClass226_7094 != null)
				return aClass226_7094;
			if (null == aClass298_Sub37_Sub16_7090) {
				if (aClass247_7086.method2340((byte) 14))
					return null;
				aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, -553176479 * anInt7088, (byte) 0, true, -1469164318));
			}
			if (((Class298_Sub37_Sub16) aClass298_Sub37_Sub16_7090).aBoolean9670)
				return null;
			byte[] is = aClass298_Sub37_Sub16_7090.method3465((short) -4612);
			do {
				if (aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
					try {
						if (null == is)
							throw new RuntimeException();
						aClass226_7094 = new Class226(is, 28953951 * (anInt7108), (aByteArray7087));
						if (1598805943 * anInt7103 != 201380083 * (((Class226) (aClass226_7094)).version))
							throw new RuntimeException();
						break;
					}
					catch (RuntimeException runtimeexception) {
						aClass226_7094 = null;
						if (aClass247_7086.method2340((byte) 14))
							aClass298_Sub37_Sub16_7090 = null;
						else
							aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, (-553176479 * anInt7088), (byte) 0, true, -165290458));
						return null;
					}
				}
				try {
					if (null == is)
						throw new RuntimeException();
					aClass226_7094 = new Class226(is, (28953951 * anInt7108), aByteArray7087);
				}
				catch (RuntimeException runtimeexception) {
					aClass247_7086.method2359(674708053);
					aClass226_7094 = null;
					if (aClass247_7086.method2340((byte) 14))
						aClass298_Sub37_Sub16_7090 = null;
					else
						aClass298_Sub37_Sub16_7090 = (aClass247_7086.method2338(255, anInt7088 * -553176479, (byte) 0, true, 1947550865));
					return null;
				}
				if (aClass329_7089 != null)
					aClass255_7091.method2431(-553176479 * anInt7088, is, aClass329_7089, -586951023);
			}
			while (false);
			aClass298_Sub37_Sub16_7090 = null;
			if (aClass329_7093 != null) {
				aByteArray7098 = (new byte[(((Class226) aClass226_7094).entrySize) * -1583970959]);
				anInt7092 = 0;
			}
			return aClass226_7094;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.a(").append(')').toString());
		}
	}

	byte[] method2262(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 124);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 20083);
		class298_sub37_sub16.method2839(-1460969981);
		return is;
	}

	void method2263(int i) {
		if (null != aClass329_7093) {
			for (Class298 class298 = aClass453_7105.method5939(1766612795); null != class298; class298 = aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.hash == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.hash = (long) i * 4191220306876042991L;
			aClass453_7105.add(class298);
		}
	}

	public int method2279(int i) {
		try {
			if (aClass226_7094 == null)
				return 0;
			return ((((Class226) aClass226_7094).entryCount) * -2145352941);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.m(").append(')').toString());
		}
	}

	void method2249(int i) {
		if (null != aClass329_7093) {
			for (Class298 class298 = aClass453_7105.method5939(1766612795); null != class298; class298 = aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.hash == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.hash = (long) i * 4191220306876042991L;
			aClass453_7105.add(class298);
		}
	}

	void method2265(int i) {
		if (null != aClass329_7093) {
			for (Class298 class298 = aClass453_7105.method5939(1766612795); null != class298; class298 = aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.hash == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.hash = (long) i * 4191220306876042991L;
			aClass453_7105.add(class298);
		}
	}

	static void method2280(int i, byte i_43_) {
		try {
			for (Class298 class298 = pb.aClass437_8896.method5816(2109381941); null != class298; class298 = pb.aClass437_8896.method5815((byte) -58)) {
				if ((long) i == (7051297995265073167L * class298.hash >> 48 & 0xffffL))
					class298.method2839(-1460969981);
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.mu(").append(')').toString());
		}
	}

	static final void method2281(Class403 class403, short i) {
		try {
			if (Class452.aBoolean5642 && Class231.aFrame2589 != null)
				Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 4), -1, -1, false, 1414482658);
			String string = (String) (((Class403) class403).anObjectArray5240[(((Class403) class403).anInt5241 -= 969361751) * -203050393]);
			boolean bool = ((((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]) == 1);
			String string_44_ = new StringBuilder().append(ClientScriptMap.method6131((byte) -59)).append(string).toString();
			string_44_ = CS2Replacer.filterUrl(string_44_);
			Class346.method4172(string_44_, bool, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1851684401) == 5, pb.aBoolean8867, pb.aBoolean8651, (byte) 49);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.afo(").append(')').toString());
		}
	}

	public static void method2282(int i, int i_45_, String string, String string_46_, String string_47_, String string_48_, int i_49_) {
		try {
			Class25.method393(i, i_45_, string, string_46_, string_47_, string_48_, null, -1, 1446000206);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	static void method2283(byte i) {
		try {
			int i_50_ = 0;
			if (Class422_Sub25.aClass298_Sub48_8425 != null)
				i_50_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub8_7566.method5654(-1747444886);
			if (i_50_ == 2) {
				int i_51_ = (-639974669 * Class78.anInt733 > 800 ? 800 : Class78.anInt733 * -639974669);
				int i_52_ = (pb.anInt6472 * 1282634425 > 600 ? 600 : 1282634425 * pb.anInt6472);
				Class462.anInt5683 = -2010408377 * i_51_;
				pb.anInt6473 = -753018213 * ((Class78.anInt733 * -639974669 - i_51_) / 2);
				Class298_Sub40_Sub9.anInt9716 = 1445266787 * i_52_;
				pb.anInt6474 = 0;
			}
			else if (i_50_ == 1) {
				int i_53_ = (-639974669 * Class78.anInt733 > 1024 ? 1024 : Class78.anInt733 * -639974669);
				int i_54_ = (pb.anInt6472 * 1282634425 > 768 ? 768 : pb.anInt6472 * 1282634425);
				Class462.anInt5683 = i_53_ * -2010408377;
				pb.anInt6473 = -753018213 * ((-639974669 * Class78.anInt733 - i_53_) / 2);
				Class298_Sub40_Sub9.anInt9716 = 1445266787 * i_54_;
				pb.anInt6474 = 0;
			}
			else {
				Class462.anInt5683 = Class78.anInt733 * -607961243;
				pb.anInt6473 = 0;
				Class298_Sub40_Sub9.anInt9716 = pb.anInt6472 * -1935672693;
				pb.anInt6474 = 0;
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.gm(").append(')').toString());
		}
	}
}
