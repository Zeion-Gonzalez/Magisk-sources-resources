package p000a;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: a.so */
/* loaded from: classes.dex */
public final class C2382so implements InterfaceC2061mq {

    /* renamed from: h */
    public final Object f7314h;

    /* renamed from: v */
    public final Object f7315v;

    /* renamed from: z */
    public int f7316z;

    public C2382so() {
        this.f7314h = new SparseArray();
        this.f7316z = 0;
        this.f7315v = Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x017e, code lost:
    
        if (r8.size() <= 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0180, code lost:
    
        r0 = new p000a.C1624eZ((java.util.ArrayList) r8, (java.util.ArrayList) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0186, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0187, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x018c, code lost:
    
        if (r19 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x018e, code lost:
    
        r0 = new p000a.C1624eZ(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0192, code lost:
    
        r0 = new p000a.C1624eZ(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0196, code lost:
    
        if (r11 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0199, code lost:
    
        if (r11 == 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x019b, code lost:
    
        r16 = (int[]) r0.f5013R;
        r17 = (float[]) r0.f5015w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01a9, code lost:
    
        if (r7 == 1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01ab, code lost:
    
        if (r7 == 2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01ad, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01b0, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01b3, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01b5, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, (float) r15, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01c2, code lost:
    
        r3 = new android.graphics.SweepGradient((float) r7, (float) r9, (int[]) r0.f5013R, (float[]) r0.f5015w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01db, code lost:
    
        if (r8 <= 0.0f) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01dd, code lost:
    
        r1 = (int[]) r0.f5013R;
        r21 = (float[]) r0.f5015w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01ea, code lost:
    
        if (r7 == 1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ed, code lost:
    
        if (r7 == 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01ef, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01f2, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01f5, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01f7, code lost:
    
        r3 = new android.graphics.RadialGradient((float) r7, (float) r9, (float) r8, r1, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x020d, code lost:
    
        return new p000a.C2382so(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0215, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Type inference failed for: r15v2, types: [float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [float, java.util.ArrayList] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C2382so m4101z(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2382so.m4101z(android.content.res.Resources, int, android.content.res.Resources$Theme):a.so");
    }

    /* renamed from: N */
    public boolean m4102N() {
        if (((Shader) this.f7314h) == null) {
            Object obj = this.f7315v;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public InterfaceC0959S m4103P(int i) {
        boolean z;
        InputStream inputStream = (InputStream) this.f7314h;
        boolean z2 = false;
        if (inputStream instanceof C2133oE) {
            C2133oE c2133oE = (C2133oE) inputStream;
            c2133oE.f6574k = false;
            c2133oE.m3757h();
        }
        int m4552x = C2651y.m4552x(inputStream, i);
        int i2 = this.f7316z;
        int i3 = 4;
        int i4 = 1;
        int i5 = 3;
        if (m4552x != 3 && m4552x != 4 && m4552x != 16 && m4552x != 17 && m4552x != 8) {
            z = false;
        } else {
            z = true;
        }
        int m4553y = C2651y.m4553y(inputStream, i2, z);
        int i6 = 2;
        Object obj = this.f7315v;
        if (m4553y < 0) {
            if ((i & 32) != 0) {
                C2382so c2382so = new C2382so(new C2133oE(inputStream, this.f7316z), this.f7316z, (byte[][]) obj);
                int i7 = i & 192;
                if (i7 != 0) {
                    return new C1837ia(i7, m4552x, c2382so);
                }
                if (m4552x != 3) {
                    if (m4552x != 4) {
                        if (m4552x != 8) {
                            if (m4552x != 16) {
                                if (m4552x == 17) {
                                    return new C0424I2(c2382so, i4);
                                }
                                throw new C2228q("unknown BER object encountered: 0x" + Integer.toHexString(m4552x));
                            }
                            return new C0424I2(c2382so, z2 ? 1 : 0);
                        }
                        return new C0424I2(c2382so, i6);
                    }
                    return new C1256XV(z2 ? 1 : 0, c2382so);
                }
                return new C2269qi(c2382so);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C1312YZ c1312yz = new C1312YZ(inputStream, m4553y, this.f7316z);
        if ((i & 224) == 0) {
            if (m4552x != 3) {
                if (m4552x != 4) {
                    if (m4552x != 8) {
                        if (m4552x != 16) {
                            if (m4552x != 17) {
                                try {
                                    return C2651y.m4551h(m4552x, c1312yz, (byte[][]) obj);
                                } catch (IllegalArgumentException e) {
                                    throw new C2228q(z2 ? 1 : 0, "corrupted stream detected", e);
                                }
                            }
                            throw new C2228q("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                        }
                        throw new C2228q("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                    }
                    throw new C2228q("externals must use constructed encoding (see X.690 8.18)");
                }
                return new C1256XV(i4, c1312yz);
            }
            return new C0451IZ(c1312yz);
        }
        C2382so c2382so2 = new C2382so(c1312yz, c1312yz.f4418R, (byte[][]) obj);
        int i8 = i & 192;
        if (i8 != 0) {
            if ((i & 32) != 0) {
                z2 = true;
            }
            return new C1309YW(i8, m4552x, z2, c2382so2);
        }
        if (m4552x != 3) {
            if (m4552x != 4) {
                if (m4552x != 8) {
                    if (m4552x != 16) {
                        if (m4552x == 17) {
                            return new C0424I2(c2382so2, i3);
                        }
                        throw new C2228q("unknown DL object encountered: 0x" + Integer.toHexString(m4552x));
                    }
                    return new C0424I2(c2382so2, i5);
                }
                return new C0424I2(c2382so2, i6);
            }
            return new C1256XV(z2 ? 1 : 0, c2382so2);
        }
        return new C2269qi(c2382so2);
    }

    /* renamed from: Q */
    public C2645xt m4104Q(int i, int i2) {
        boolean z;
        C0622Lh c0622Lh;
        C2551w m4107o = m4107o();
        int i3 = m4107o.f7796h;
        if (i3 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C2645xt(3, i, i2, m4107o.m4370v(0));
        }
        C0622Lh c0622Lh2 = AbstractC2176p0.f6668z;
        if (i3 < 1) {
            c0622Lh = AbstractC2176p0.f6668z;
        } else {
            c0622Lh = new C0622Lh(m4107o);
        }
        return new C2645xt(4, i, i2, c0622Lh);
    }

    /* renamed from: W */
    public void m4105W(OutputStream outputStream) {
        switch (this.f7316z) {
            case AbstractC0795Op.f2698E /* 0 */:
                outputStream.write((byte[]) this.f7315v);
                return;
            default:
                ((C2382so) ((InterfaceC2061mq) this.f7314h)).m4105W(outputStream);
                return;
        }
    }

    /* renamed from: h */
    public Object m4106h() {
        switch (this.f7316z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return AbstractC0438II.m1049w((byte[]) this.f7315v);
            default:
                return ((C2382so) ((InterfaceC2061mq) this.f7314h)).m4106h();
        }
    }

    /* renamed from: o */
    public C2551w m4107o() {
        Object obj = this.f7314h;
        int read = ((InputStream) obj).read();
        if (read < 0) {
            return new C2551w(0);
        }
        C2551w c2551w = new C2551w();
        do {
            InterfaceC0959S m4103P = m4103P(read);
            c2551w.m4371z(m4103P instanceof InterfaceC2200pR ? ((InterfaceC2200pR) m4103P).mo953h() : m4103P.mo302N());
            read = ((InputStream) obj).read();
        } while (read >= 0);
        return c2551w;
    }

    /* renamed from: u */
    public boolean m4108u(int[] iArr) {
        if (m4102N()) {
            ColorStateList colorStateList = (ColorStateList) this.f7315v;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f7316z) {
                this.f7316z = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public C2247qL m4109v(int i) {
        Object obj = this.f7314h;
        C2247qL c2247qL = (C2247qL) ((SparseArray) obj).get(i);
        if (c2247qL != null) {
            return c2247qL;
        }
        C2247qL c2247qL2 = new C2247qL();
        ((SparseArray) obj).put(i, c2247qL2);
        return c2247qL2;
    }

    public /* synthetic */ C2382so(C1281Y c1281y, byte[] bArr) {
        this.f7316z = 0;
        this.f7314h = c1281y;
        this.f7315v = bArr;
    }

    public C2382so(AbstractC1405aM abstractC1405aM, int i, byte[][] bArr) {
        this.f7314h = abstractC1405aM;
        this.f7316z = i;
        this.f7315v = bArr;
    }

    public C2382so(Shader shader, ColorStateList colorStateList, int i) {
        this.f7314h = shader;
        this.f7315v = colorStateList;
        this.f7316z = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2382so(byte[] bArr) {
        this(InterfaceC0141Cj.f489h, bArr);
        this.f7316z = 0;
    }
}
