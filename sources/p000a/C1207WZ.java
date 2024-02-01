package p000a;

import com.topjohnwu.magisk.core.download.DownloadService;

/* renamed from: a.WZ */
/* loaded from: classes.dex */
public final class C1207WZ extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ long f3920I;

    /* renamed from: R */
    public final /* synthetic */ AbstractServiceC1020T7 f3921R;

    /* renamed from: k */
    public final /* synthetic */ AbstractC0164DB f3922k;

    /* renamed from: q */
    public final /* synthetic */ float f3923q;

    /* renamed from: w */
    public final /* synthetic */ int f3924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207WZ(DownloadService downloadService, int i, long j, float f, AbstractC0164DB abstractC0164DB) {
        super(1);
        this.f3921R = downloadService;
        this.f3924w = i;
        this.f3920I = j;
        this.f3923q = f;
        this.f3922k = abstractC0164DB;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        long longValue = ((Number) obj).longValue();
        this.f3921R.m2198v(this.f3924w, new C2477ui(this.f3920I, ((float) longValue) / 1048576, this.f3923q, this.f3922k, longValue));
        return C0329GJ.f1115z;
    }
}
