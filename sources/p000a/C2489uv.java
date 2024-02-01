package p000a;

import java.io.OutputStream;

/* renamed from: a.uv */
/* loaded from: classes.dex */
public final class C2489uv extends OutputStream {

    /* renamed from: R */
    public final OutputStream f7621R;

    /* renamed from: S */
    public final /* synthetic */ int f7622S;

    /* renamed from: w */
    public final OutputStream f7623w;

    public C2489uv(OutputStream outputStream, OutputStream outputStream2, int i) {
        this.f7622S = i;
        if (i != 1) {
            this.f7621R = outputStream;
            this.f7623w = outputStream2;
        } else {
            this.f7621R = outputStream;
            this.f7623w = outputStream2;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f7622S;
        OutputStream outputStream = this.f7623w;
        OutputStream outputStream2 = this.f7621R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                outputStream2.close();
                outputStream.close();
                return;
            default:
                outputStream2.close();
                outputStream.close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f7622S) {
            case 1:
                this.f7621R.flush();
                this.f7623w.flush();
                return;
            default:
                super.flush();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f7622S;
        OutputStream outputStream = this.f7623w;
        OutputStream outputStream2 = this.f7621R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                outputStream2.write(i);
                outputStream.write(i);
                return;
            default:
                outputStream2.write(i);
                outputStream.write(i);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f7622S) {
            case 1:
                this.f7621R.write(bArr);
                this.f7623w.write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f7622S;
        OutputStream outputStream = this.f7623w;
        OutputStream outputStream2 = this.f7621R;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                outputStream2.write(bArr, i, i2);
                outputStream.write(bArr, i, i2);
                return;
            default:
                outputStream2.write(bArr, i, i2);
                outputStream.write(bArr, i, i2);
                return;
        }
    }
}
