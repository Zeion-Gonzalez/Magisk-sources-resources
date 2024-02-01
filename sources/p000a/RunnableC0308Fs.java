package p000a;

/* renamed from: a.Fs */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0308Fs implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Object f1063R;

    /* renamed from: S */
    public final /* synthetic */ int f1064S;

    public /* synthetic */ RunnableC0308Fs(int i, Object obj) {
        this.f1064S = i;
        this.f1063R = obj;
    }

    /* renamed from: z */
    private final void m653z() {
        C2213pi c2213pi = (C2213pi) this.f1063R;
        synchronized (c2213pi.f6807M) {
            c2213pi.f6810Q = false;
            c2213pi.f6814o.m3210h();
            InterfaceC2721zM interfaceC2721zM = c2213pi.f6815u;
            if (interfaceC2721zM != null) {
                interfaceC2721zM.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.RunnableC0308Fs.run():void");
    }
}
