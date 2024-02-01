package p000a;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: a.lX */
/* loaded from: classes.dex */
public final class C1996lX extends AbstractC0017AI {

    /* renamed from: I */
    public final boolean f6178I;

    /* renamed from: R */
    public int f6179R;

    /* renamed from: g */
    public final C0776OS f6180g;

    /* renamed from: k */
    public final C0529Jz f6181k;

    /* renamed from: q */
    public final Process f6182q;

    /* renamed from: w */
    public final CallableC1550dB f6183w;

    /* renamed from: y */
    public final C0776OS f6184y;

    public C1996lX(C1015T2 c1015t2, Process process) {
        boolean z;
        this.f6179R = -1;
        int i = 1;
        if ((c1015t2.f3394h & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        this.f6178I = z;
        this.f6182q = process;
        this.f6181k = new C0529Jz(process.getOutputStream());
        this.f6180g = new C0776OS(process.getInputStream());
        this.f6184y = new C0776OS(process.getErrorStream());
        CallableC1550dB callableC1550dB = new CallableC1550dB();
        this.f6183w = callableC1550dB;
        try {
            try {
                try {
                    try {
                        this.f6179R = ((Integer) callableC1550dB.submit(new CallableC1584dp(this, i)).get(c1015t2.f3396z, TimeUnit.SECONDS)).intValue();
                    } catch (InterruptedException e) {
                        throw new IOException("Shell check interrupted", e);
                    }
                } catch (TimeoutException e2) {
                    throw new IOException("Shell check timeout", e2);
                }
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Unknown ExecutionException", cause);
            }
        } catch (IOException e4) {
            this.f6183w.shutdownNow();
            m3609V();
            throw e4;
        }
    }

    /* renamed from: V */
    public final void m3609V() {
        this.f6179R = -1;
        try {
            this.f6181k.m1244z();
        } catch (IOException unused) {
        }
        try {
            this.f6184y.m1791z();
        } catch (IOException unused2) {
        }
        try {
            this.f6180g.m1791z();
        } catch (IOException unused3) {
        }
        this.f6182q.destroy();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6179R < 0) {
            return;
        }
        this.f6183w.shutdownNow();
        m3609V();
    }

    @Override // p000a.AbstractC0017AI
    /* renamed from: h */
    public final synchronized void mo46h(InterfaceC1798hr interfaceC1798hr) {
        if (this.f6179R < 0) {
            throw new C2647xv();
        }
        AbstractC1292YB.m2660S(this.f6180g);
        AbstractC1292YB.m2660S(this.f6184y);
        try {
            this.f6181k.write(10);
            this.f6181k.flush();
            interfaceC1798hr.mo766x(this.f6181k, this.f6180g, this.f6184y);
        } catch (IOException unused) {
            m3609V();
            throw new C2647xv();
        }
    }
}
