package p000a;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: a.xP */
/* loaded from: classes.dex */
public abstract class AbstractC2626xP implements Closeable, Flushable {

    /* renamed from: q */
    public boolean f8146q;

    /* renamed from: S */
    public int f8144S = 0;

    /* renamed from: R */
    public int[] f8143R = new int[32];

    /* renamed from: w */
    public String[] f8147w = new String[32];

    /* renamed from: I */
    public int[] f8142I = new int[32];

    /* renamed from: k */
    public int f8145k = -1;

    /* renamed from: C */
    public final int m4523C() {
        int i = this.f8144S;
        if (i != 0) {
            return this.f8143R[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: G */
    public abstract C2279qw mo3918G();

    /* renamed from: U8 */
    public abstract C2279qw mo3920U8(String str);

    /* renamed from: V */
    public abstract C2279qw mo3921V(String str);

    /* renamed from: h */
    public abstract C2279qw mo3923h();

    /* renamed from: od */
    public final String m4524od() {
        return AbstractC0795Op.m1804C(this.f8144S, this.f8143R, this.f8142I, this.f8147w);
    }

    /* renamed from: x */
    public abstract C2279qw mo3925x(long j);

    /* renamed from: y */
    public abstract C2279qw mo3926y();

    /* renamed from: z */
    public abstract C2279qw mo3927z();
}
