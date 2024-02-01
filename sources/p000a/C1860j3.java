package p000a;

import java.io.File;

/* renamed from: a.j3 */
/* loaded from: classes.dex */
public final class C1860j3 extends AbstractC1223Wq {

    /* renamed from: N */
    public boolean f5813N;

    /* renamed from: P */
    public int f5814P;

    /* renamed from: Q */
    public final /* synthetic */ C2697yw f5815Q;

    /* renamed from: h */
    public boolean f5816h;

    /* renamed from: v */
    public File[] f5817v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860j3(C2697yw c2697yw, File file) {
        super(file);
        this.f5815Q = c2697yw;
    }

    @Override // p000a.AbstractC0396HW
    /* renamed from: z */
    public final File mo890z() {
        int i;
        boolean z = this.f5813N;
        File file = this.f1326z;
        C2697yw c2697yw = this.f5815Q;
        if (!z && this.f5817v == null) {
            c2697yw.f8509I.getClass();
            File[] listFiles = file.listFiles();
            this.f5817v = listFiles;
            if (listFiles == null) {
                c2697yw.f8509I.getClass();
                this.f5813N = true;
            }
        }
        File[] fileArr = this.f5817v;
        if (fileArr != null && (i = this.f5814P) < fileArr.length) {
            this.f5814P = i + 1;
            return fileArr[i];
        }
        if (!this.f5816h) {
            this.f5816h = true;
            return file;
        }
        c2697yw.f8509I.getClass();
        return null;
    }
}
