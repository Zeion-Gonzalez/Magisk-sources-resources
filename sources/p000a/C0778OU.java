package p000a;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

/* renamed from: a.OU */
/* loaded from: classes.dex */
public final class C0778OU extends FilterOutputStream {

    /* renamed from: S */
    public int f2635S;

    public C0778OU(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f2635S = 0;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        super.write(i);
        this.f2635S++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.f2635S += i2;
    }
}
