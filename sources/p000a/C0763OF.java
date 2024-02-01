package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: a.OF */
/* loaded from: classes.dex */
public final class C0763OF {

    /* renamed from: W */
    public static C0763OF f2584W;

    /* renamed from: N */
    public TypedValue f2586N;

    /* renamed from: P */
    public final WeakHashMap f2587P = new WeakHashMap(0);

    /* renamed from: Q */
    public boolean f2588Q;

    /* renamed from: h */
    public C2698yx f2589h;

    /* renamed from: u */
    public C1364ZX f2590u;

    /* renamed from: v */
    public C2616xE f2591v;

    /* renamed from: z */
    public WeakHashMap f2592z;

    /* renamed from: o */
    public static final PorterDuff.Mode f2585o = PorterDuff.Mode.SRC_IN;

    /* renamed from: G */
    public static final C2539vn f2583G = new C2539vn();

    /* renamed from: G */
    public static void m1759G(C0763OF c0763of) {
        if (Build.VERSION.SDK_INT < 24) {
            c0763of.m1771z("vector", new C0284FP(3));
            c0763of.m1771z("animated-vector", new C0284FP(1));
            c0763of.m1771z("animated-selector", new C0284FP(0));
            c0763of.m1771z("drawable", new C0284FP(2));
        }
    }

    /* renamed from: P */
    public static synchronized C0763OF m1760P() {
        C0763OF c0763of;
        synchronized (C0763OF.class) {
            if (f2584W == null) {
                C0763OF c0763of2 = new C0763OF();
                f2584W = c0763of2;
                m1759G(c0763of2);
            }
            c0763of = f2584W;
        }
        return c0763of;
    }

    /* renamed from: o */
    public static synchronized PorterDuffColorFilter m1761o(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0763OF.class) {
            C2539vn c2539vn = f2583G;
            c2539vn.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c2539vn.m1210z(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                c2539vn.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c2539vn.m1208h(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: M */
    public final synchronized void m1762M(Context context) {
        C1276Xv c1276Xv = (C1276Xv) this.f2587P.get(context);
        if (c1276Xv != null) {
            c1276Xv.m2605v();
        }
    }

    /* renamed from: N */
    public final synchronized Drawable m1763N(Context context, long j) {
        C1276Xv c1276Xv = (C1276Xv) this.f2587P.get(context);
        if (c1276Xv == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1276Xv.m2602Q(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m1015V = AbstractC0438II.m1015V(c1276Xv.f4101R, c1276Xv.f4100I, j);
            if (m1015V >= 0) {
                Object[] objArr = c1276Xv.f4103w;
                Object obj = objArr[m1015V];
                Object obj2 = C1276Xv.f4099q;
                if (obj != obj2) {
                    objArr[m1015V] = obj2;
                    c1276Xv.f4102S = true;
                }
            }
        }
        return null;
    }

    /* renamed from: Q */
    public final synchronized Drawable m1764Q(Context context, int i) {
        return m1769u(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1765S(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            a.ZX r0 = r6.f2590u
            r1 = 0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r2 = p000a.C1982lH.f6149h
            java.lang.Object r3 = r0.f4279h
            int[] r3 = (int[]) r3
            boolean r3 = p000a.C1364ZX.m2759z(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968834(0x7f040102, float:1.7546333E38)
            goto L4e
        L17:
            java.lang.Object r3 = r0.f4277P
            int[] r3 = (int[]) r3
            boolean r3 = p000a.C1364ZX.m2759z(r3, r8)
            if (r3 == 0) goto L25
            r8 = 2130968831(0x7f0400ff, float:1.7546327E38)
            goto L4e
        L25:
            java.lang.Object r0 = r0.f4276N
            int[] r0 = (int[]) r0
            boolean r0 = p000a.C1364ZX.m2759z(r0, r8)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L4b
        L32:
            r0 = 2131230855(0x7f080087, float:1.8077775E38)
            if (r8 != r0) goto L46
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L56
        L46:
            r0 = 2131230837(0x7f080075, float:1.8077738E38)
            if (r8 != r0) goto L51
        L4b:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4e:
            r0 = r8
            r8 = r4
            goto L53
        L51:
            r8 = r1
            r0 = r8
        L53:
            r3 = r2
            r2 = r0
            r0 = r5
        L56:
            if (r8 == 0) goto L70
            int[] r8 = p000a.AbstractC1888jY.f5902z
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = p000a.AbstractC1757h0.m3288v(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = p000a.C1982lH.m3596v(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6e
            r8.setAlpha(r0)
        L6e:
            r7 = r4
            goto L71
        L70:
            r7 = r1
        L71:
            if (r7 == 0) goto L74
            r1 = r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0763OF.m1765S(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: V */
    public final synchronized void m1766V(C1364ZX c1364zx) {
        this.f2590u = c1364zx;
    }

    /* renamed from: W */
    public final synchronized ColorStateList m1767W(Context context, int i) {
        ColorStateList colorStateList;
        C2616xE c2616xE;
        try {
            WeakHashMap weakHashMap = this.f2592z;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (c2616xE = (C2616xE) weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) c2616xE.m4502N(i, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                C1364ZX c1364zx = this.f2590u;
                if (c1364zx != null) {
                    colorStateList2 = c1364zx.m2761P(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.f2592z == null) {
                        this.f2592z = new WeakHashMap();
                    }
                    C2616xE c2616xE2 = (C2616xE) this.f2592z.get(context);
                    if (c2616xE2 == null) {
                        c2616xE2 = new C2616xE();
                        this.f2592z.put(context, c2616xE2);
                    }
                    c2616xE2.m4509z(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* renamed from: h */
    public final synchronized void m1768h(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1276Xv c1276Xv = (C1276Xv) this.f2587P.get(context);
            if (c1276Xv == null) {
                c1276Xv = new C1276Xv();
                this.f2587P.put(context, c1276Xv);
            }
            c1276Xv.m2604u(j, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x002b, code lost:
    
        if (r0 == 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0117, code lost:
    
        p000a.AbstractC0235ET.m476W(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ec A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:111:0x0001, B:124:0x002d, B:126:0x0032, B:128:0x0038, B:130:0x003e, B:133:0x004c, B:137:0x005d, B:139:0x0061, B:140:0x0068, B:168:0x00ec, B:170:0x00f2, B:172:0x00fa, B:174:0x0100, B:181:0x0117, B:179:0x0113, B:183:0x011d, B:187:0x0134, B:194:0x016a, B:198:0x0194, B:205:0x01a1, B:143:0x0082, B:145:0x0086, B:147:0x0092, B:148:0x009a, B:153:0x00a6, B:155:0x00b9, B:157:0x00c5, B:160:0x00d1, B:161:0x00d8, B:163:0x00da, B:165:0x00e3, B:136:0x0056, B:114:0x0008, B:116:0x0013, B:118:0x0017, B:208:0x01a6, B:209:0x01af), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f2 A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:111:0x0001, B:124:0x002d, B:126:0x0032, B:128:0x0038, B:130:0x003e, B:133:0x004c, B:137:0x005d, B:139:0x0061, B:140:0x0068, B:168:0x00ec, B:170:0x00f2, B:172:0x00fa, B:174:0x0100, B:181:0x0117, B:179:0x0113, B:183:0x011d, B:187:0x0134, B:194:0x016a, B:198:0x0194, B:205:0x01a1, B:143:0x0082, B:145:0x0086, B:147:0x0092, B:148:0x009a, B:153:0x00a6, B:155:0x00b9, B:157:0x00c5, B:160:0x00d1, B:161:0x00d8, B:163:0x00da, B:165:0x00e3, B:136:0x0056, B:114:0x0008, B:116:0x0013, B:118:0x0017, B:208:0x01a6, B:209:0x01af), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00fa A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:111:0x0001, B:124:0x002d, B:126:0x0032, B:128:0x0038, B:130:0x003e, B:133:0x004c, B:137:0x005d, B:139:0x0061, B:140:0x0068, B:168:0x00ec, B:170:0x00f2, B:172:0x00fa, B:174:0x0100, B:181:0x0117, B:179:0x0113, B:183:0x011d, B:187:0x0134, B:194:0x016a, B:198:0x0194, B:205:0x01a1, B:143:0x0082, B:145:0x0086, B:147:0x0092, B:148:0x009a, B:153:0x00a6, B:155:0x00b9, B:157:0x00c5, B:160:0x00d1, B:161:0x00d8, B:163:0x00da, B:165:0x00e3, B:136:0x0056, B:114:0x0008, B:116:0x0013, B:118:0x0017, B:208:0x01a6, B:209:0x01af), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a1 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #1 {all -> 0x00ce, blocks: (B:111:0x0001, B:124:0x002d, B:126:0x0032, B:128:0x0038, B:130:0x003e, B:133:0x004c, B:137:0x005d, B:139:0x0061, B:140:0x0068, B:168:0x00ec, B:170:0x00f2, B:172:0x00fa, B:174:0x0100, B:181:0x0117, B:179:0x0113, B:183:0x011d, B:187:0x0134, B:194:0x016a, B:198:0x0194, B:205:0x01a1, B:143:0x0082, B:145:0x0086, B:147:0x0092, B:148:0x009a, B:153:0x00a6, B:155:0x00b9, B:157:0x00c5, B:160:0x00d1, B:161:0x00d8, B:163:0x00da, B:165:0x00e3, B:136:0x0056, B:114:0x0008, B:116:0x0013, B:118:0x0017, B:208:0x01a6, B:209:0x01af), top: B:213:0x0001, inners: #0 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable m1769u(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0763OF.m1769u(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m1770v(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0763OF.m1770v(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: z */
    public final void m1771z(String str, C0284FP c0284fp) {
        if (this.f2589h == null) {
            this.f2589h = new C2698yx();
        }
        this.f2589h.put(str, c0284fp);
    }
}
