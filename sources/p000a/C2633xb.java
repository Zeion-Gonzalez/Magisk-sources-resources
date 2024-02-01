package p000a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: a.xb */
/* loaded from: classes.dex */
public final class C2633xb extends OutputStream {

    /* renamed from: R */
    public final Object f8220R;

    /* renamed from: S */
    public final /* synthetic */ int f8221S;

    public /* synthetic */ C2633xb(int i, Object obj) {
        this.f8221S = i;
        this.f8220R = obj;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f8221S;
        Object obj = this.f8220R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    ((Signature) obj).update((byte) i);
                    return;
                } catch (SignatureException e) {
                    throw new IOException(e.getMessage(), e);
                }
            default:
                ((MessageDigest) obj).update((byte) i);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int i = this.f8221S;
        Object obj = this.f8220R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    ((Signature) obj).update(bArr);
                    return;
                } catch (SignatureException e) {
                    throw new IOException(e.getMessage(), e);
                }
            default:
                ((MessageDigest) obj).update(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f8221S;
        Object obj = this.f8220R;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    ((Signature) obj).update(bArr, i, i2);
                    return;
                } catch (SignatureException e) {
                    throw new IOException(e.getMessage(), e);
                }
            default:
                ((MessageDigest) obj).update(bArr, i, i2);
                return;
        }
    }
}
