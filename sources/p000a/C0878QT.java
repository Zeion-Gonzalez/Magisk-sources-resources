package p000a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: a.QT */
/* loaded from: classes.dex */
public final class C0878QT {

    /* renamed from: G */
    public final /* synthetic */ C0437IH f3031G;

    /* renamed from: N */
    public boolean f3032N;

    /* renamed from: P */
    public final ArrayList f3033P;

    /* renamed from: Q */
    public boolean f3034Q;

    /* renamed from: W */
    public long f3035W;

    /* renamed from: h */
    public final long[] f3036h;

    /* renamed from: o */
    public int f3037o;

    /* renamed from: u */
    public C1570dX f3038u;

    /* renamed from: v */
    public final ArrayList f3039v;

    /* renamed from: z */
    public final String f3040z;

    public C0878QT(C0437IH c0437ih, String str) {
        this.f3031G = c0437ih;
        this.f3040z = str;
        c0437ih.getClass();
        this.f3036h = new long[2];
        this.f3039v = new ArrayList();
        this.f3033P = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f3039v.add(new File(this.f3031G.f1436R, sb.toString()));
            sb.append(".tmp");
            this.f3033P.add(new File(this.f3031G.f1436R, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [a.ez] */
    /* renamed from: z */
    public final C2702z0 m2026z() {
        byte[] bArr = AbstractC1181W6.f3860z;
        if (!this.f3032N) {
            return null;
        }
        C0437IH c0437ih = this.f3031G;
        if (!c0437ih.f1443f && (this.f3038u != null || this.f3034Q)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f3036h.clone();
        for (int i = 0; i < 2; i++) {
            try {
                InterfaceC0810P6 interfaceC0810P6 = c0437ih.f1437S;
                File file = (File) this.f3039v.get(i);
                ((C0197Dm) interfaceC0810P6).getClass();
                Logger logger = AbstractC0982SQ.f3316z;
                C2294rC c2294rC = new C2294rC(new FileInputStream(file), C1819iG.f5685P);
                if (!c0437ih.f1443f) {
                    this.f3037o++;
                    c2294rC = new C1647ez(c2294rC, c0437ih, this);
                }
                arrayList.add(c2294rC);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1181W6.m2430v((InterfaceC0984SS) it.next());
                }
                try {
                    c0437ih.m981ZH(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
        return new C2702z0(this.f3031G, this.f3040z, this.f3035W, arrayList);
    }
}
