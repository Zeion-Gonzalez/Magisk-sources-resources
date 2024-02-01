package p000a;

import java.io.File;

/* renamed from: a.PN */
/* loaded from: classes.dex */
public final class C0824PN extends AbstractC1223Wq {

    /* renamed from: N */
    public final /* synthetic */ C2697yw f2795N;

    /* renamed from: P */
    public int f2796P;

    /* renamed from: h */
    public boolean f2797h;

    /* renamed from: v */
    public File[] f2798v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824PN(C2697yw c2697yw, File file) {
        super(file);
        this.f2795N = c2697yw;
    }

    @Override // p000a.AbstractC0396HW
    /* renamed from: z */
    public final File mo890z() {
        boolean z = this.f2797h;
        File file = this.f1326z;
        C2697yw c2697yw = this.f2795N;
        if (!z) {
            c2697yw.f8509I.getClass();
            this.f2797h = true;
            return file;
        }
        File[] fileArr = this.f2798v;
        if (fileArr != null && this.f2796P >= fileArr.length) {
            c2697yw.f8509I.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f2798v = listFiles;
            if (listFiles == null) {
                c2697yw.f8509I.getClass();
            }
            File[] fileArr2 = this.f2798v;
            if (fileArr2 == null || fileArr2.length == 0) {
                c2697yw.f8509I.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f2798v;
        int i = this.f2796P;
        this.f2796P = i + 1;
        return fileArr3[i];
    }
}
