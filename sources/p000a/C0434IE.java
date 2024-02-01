package p000a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: a.IE */
/* loaded from: classes.dex */
public class C0434IE extends AbstractC2703z2 implements InterfaceC1798hr, Closeable {

    /* renamed from: g */
    public static final ArrayList f1415g = new ArrayList(0);

    /* renamed from: s */
    public static final byte[] f1416s;

    /* renamed from: y */
    public static final String f1417y;

    /* renamed from: I */
    public List f1418I;

    /* renamed from: R */
    public final ArrayList f1419R;

    /* renamed from: k */
    public C1996lX f1420k;

    /* renamed from: q */
    public List f1421q;

    /* renamed from: w */
    public final C0876QR f1422w;

    static {
        String uuid = UUID.randomUUID().toString();
        f1417y = uuid;
        f1416s = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(StandardCharsets.UTF_8);
    }

    public C0434IE() {
        super(9);
        this.f1419R = new ArrayList();
        this.f1422w = new C0876QR();
        this.f1421q = f1415g;
    }

    /* renamed from: O4 */
    public final C0434IE m971O4(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.f1419R.add(new C0939Rf(0, strArr));
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f1419R.iterator();
        while (it.hasNext()) {
            ((C0939Rf) ((InterfaceC1827iP) it.next())).close();
        }
    }

    /* renamed from: d3 */
    public final C0876QR m972d3() {
        boolean z;
        List list = this.f1421q;
        if (list == f1415g) {
            z = true;
        } else {
            z = false;
        }
        List list2 = this.f1418I;
        C0876QR c0876qr = this.f1422w;
        c0876qr.f2986z = list2;
        List list3 = null;
        if (z) {
            list = null;
        }
        c0876qr.f2984h = list;
        if (z && this.f1420k.f6178I) {
            c0876qr.f2984h = list2;
        }
        if (list2 != null && list2 == c0876qr.f2984h) {
            if (AbstractC1292YB.f4145z == null) {
                AbstractC1292YB.f4145z = Collections.synchronizedCollection(C1453bH.m2872h()).getClass();
            }
            if (!AbstractC1292YB.f4145z.isInstance(list2)) {
                List synchronizedList = Collections.synchronizedList(c0876qr.f2986z);
                c0876qr.f2986z = synchronizedList;
                c0876qr.f2984h = synchronizedList;
            }
        }
        try {
            try {
                this.f1420k.mo46h(this);
                close();
                c0876qr.f2986z = this.f1418I;
                if (!z) {
                    list3 = this.f1421q;
                }
                c0876qr.f2984h = list3;
                return c0876qr;
            } catch (IOException e) {
                if (e instanceof C2647xv) {
                    C0876QR c0876qr2 = C0876QR.f2982N;
                    close();
                    c0876qr.f2986z = this.f1418I;
                    if (!z) {
                        list3 = this.f1421q;
                    }
                    c0876qr.f2984h = list3;
                    return c0876qr2;
                }
                AbstractC1292YB.m2644E("LIBSU", e);
                C0876QR c0876qr3 = C0876QR.f2983P;
                close();
                c0876qr.f2986z = this.f1418I;
                if (!z) {
                    list3 = this.f1421q;
                }
                c0876qr.f2984h = list3;
                return c0876qr3;
            }
        } catch (Throwable th) {
            close();
            c0876qr.f2986z = this.f1418I;
            if (!z) {
                list3 = this.f1421q;
            }
            c0876qr.f2984h = list3;
            throw th;
        }
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: dG */
    public void mo780dG(Executor executor, InterfaceC2487ut interfaceC2487ut) {
        this.f1420k.f6183w.execute(new RunnableC1247XH(3, this, executor, interfaceC2487ut));
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: dx */
    public AbstractC1823iK mo781dx() {
        return m972d3();
    }

    /* renamed from: nB */
    public final FutureTask m973nB() {
        FutureTask futureTask = new FutureTask(new CallableC1584dp(this, 0));
        this.f1420k.f6183w.execute(futureTask);
        return futureTask;
    }

    @Override // p000a.InterfaceC1798hr
    /* renamed from: x */
    public final void mo766x(C0529Jz c0529Jz, C0776OS c0776os, C0776OS c0776os2) {
        ExecutorService executorService = AbstractC0017AI.f108S;
        C0876QR c0876qr = this.f1422w;
        Future submit = executorService.submit(new C1674fT(c0776os, c0876qr.f2986z, 1));
        Future submit2 = AbstractC0017AI.f108S.submit(new C1674fT(c0776os2, c0876qr.f2984h, 0));
        Iterator it = this.f1419R.iterator();
        while (it.hasNext()) {
            C0939Rf c0939Rf = (C0939Rf) ((InterfaceC1827iP) it.next());
            int i = c0939Rf.f3223S;
            Object obj = c0939Rf.f3222R;
            switch (i) {
                case AbstractC0795Op.f2698E /* 0 */:
                    for (String str : (String[]) obj) {
                        c0529Jz.write(str.getBytes(StandardCharsets.UTF_8));
                        c0529Jz.write(10);
                    }
                    break;
                default:
                    InputStream inputStream = (InputStream) obj;
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            c0529Jz.write(bArr, 0, read);
                        } else {
                            inputStream.close();
                            c0529Jz.write(10);
                            break;
                        }
                    }
            }
        }
        c0529Jz.write(f1416s);
        c0529Jz.flush();
        try {
            c0876qr.f2985v = ((Integer) submit.get()).intValue();
            submit2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }

    public C0434IE(C1996lX c1996lX) {
        super(9);
        this.f1419R = new ArrayList();
        this.f1422w = new C0876QR();
        this.f1421q = f1415g;
        this.f1420k = c1996lX;
    }
}
