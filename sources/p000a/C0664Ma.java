package p000a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: a.Ma */
/* loaded from: classes.dex */
public final class C0664Ma implements Enumeration {

    /* renamed from: h */
    public AbstractC1593e f2153h = m1481z();

    /* renamed from: z */
    public final C2651y f2154z;

    public C0664Ma(byte[] bArr) {
        this.f2154z = new C2651y(bArr, 0);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f2153h != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        AbstractC1593e abstractC1593e = this.f2153h;
        if (abstractC1593e == null) {
            throw new NoSuchElementException();
        }
        this.f2153h = m1481z();
        return abstractC1593e;
    }

    /* renamed from: z */
    public final AbstractC1593e m1481z() {
        try {
            return this.f2154z.m4554C();
        } catch (IOException e) {
            throw new C0367H(0, "malformed ASN.1: " + e, e);
        }
    }
}
