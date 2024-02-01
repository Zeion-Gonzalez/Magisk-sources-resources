package p000a;

import android.app.Notification;
import java.util.Arrays;

/* renamed from: a.ui */
/* loaded from: classes.dex */
public final class C2477ui extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ float f7587I;

    /* renamed from: R */
    public final /* synthetic */ long f7588R;

    /* renamed from: k */
    public final /* synthetic */ long f7589k;

    /* renamed from: q */
    public final /* synthetic */ AbstractC0164DB f7590q;

    /* renamed from: w */
    public final /* synthetic */ float f7591w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477ui(long j, float f, float f2, AbstractC0164DB abstractC0164DB, long j2) {
        super(1);
        this.f7588R = j;
        this.f7591w = f;
        this.f7587I = f2;
        this.f7590q = abstractC0164DB;
        this.f7589k = j2;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        String format;
        Notification.Builder builder = (Notification.Builder) obj;
        long j = this.f7588R;
        AbstractC0164DB abstractC0164DB = this.f7590q;
        float f = this.f7591w;
        if (j > 0) {
            C1112Up c1112Up = AbstractServiceC1020T7.f3413w;
            float f2 = this.f7587I;
            C1219Wm.m2516z(f / f2, abstractC0164DB);
            builder = builder.setProgress((int) j, (int) this.f7589k, false);
            format = String.format("%.2f / %.2f MB", Arrays.copyOf(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, 2));
        } else {
            C1112Up c1112Up2 = AbstractServiceC1020T7.f3413w;
            C1219Wm.m2516z(-1.0f, abstractC0164DB);
            format = String.format("%.2f MB / ??", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        builder.setContentText(format);
        return C0329GJ.f1115z;
    }
}
