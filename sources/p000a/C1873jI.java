package p000a;

import java.util.ArrayList;

/* renamed from: a.jI */
/* loaded from: classes.dex */
public final class C1873jI {

    /* renamed from: N */
    public String f5848N;

    /* renamed from: P */
    public StringBuilder f5849P;

    /* renamed from: Q */
    public String f5850Q;

    /* renamed from: o */
    public StringBuilder f5853o;

    /* renamed from: u */
    public char f5854u;

    /* renamed from: z */
    public int f5856z = 1;

    /* renamed from: h */
    public final StringBuilder f5852h = new StringBuilder();

    /* renamed from: v */
    public final ArrayList f5855v = new ArrayList();

    /* renamed from: W */
    public boolean f5851W = false;

    /* renamed from: z */
    public final void m3492z() {
        if (this.f5851W) {
            String m720z = AbstractC0323GC.m720z(this.f5850Q);
            StringBuilder sb = this.f5853o;
            this.f5855v.add(new C0665Mb(this.f5848N, m720z, sb != null ? AbstractC0323GC.m720z(sb.toString()) : null));
            this.f5849P = null;
            this.f5851W = false;
            this.f5848N = null;
            this.f5850Q = null;
            this.f5853o = null;
        }
    }
}
