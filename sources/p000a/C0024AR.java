package p000a;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;

/* renamed from: a.AR */
/* loaded from: classes.dex */
public final /* synthetic */ class C0024AR implements InterfaceC2447u5, InterfaceC1542d3, InterfaceC2487ut {

    /* renamed from: R */
    public final /* synthetic */ Object f141R;

    /* renamed from: S */
    public final /* synthetic */ int f142S;

    public /* synthetic */ C0024AR(int i, Object obj) {
        this.f142S = i;
        this.f141R = obj;
    }

    @Override // p000a.InterfaceC2487ut
    /* renamed from: h */
    public final void mo57h(AbstractC1823iK abstractC1823iK) {
        ((InterfaceC2364sT) this.f141R).mo85W(abstractC1823iK);
    }

    /* renamed from: v */
    public final boolean m58v(C2196pM c2196pM, int i, Bundle bundle) {
        View view = (View) this.f141R;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC0369H1) c2196pM.f6755R).mo853z();
                Parcelable parcelable = (Parcelable) ((InterfaceC0369H1) c2196pM.f6755R).mo849M();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        C2196pM c2196pM2 = new C2196pM(new ClipData(((InterfaceC0369H1) c2196pM.f6755R).mo851o(), new ClipData.Item(((InterfaceC0369H1) c2196pM.f6755R).mo850V())), 2);
        ((InterfaceC1792hi) c2196pM2.f6755R).mo3070N(((InterfaceC0369H1) c2196pM.f6755R).mo852v());
        ((InterfaceC1792hi) c2196pM2.f6755R).mo3073v(bundle);
        if (AbstractC2446u3.m4224o(view, ((InterfaceC1792hi) c2196pM2.f6755R).mo3071h()) == null) {
            return true;
        }
        return false;
    }

    @Override // p000a.InterfaceC2447u5
    /* renamed from: z */
    public final void mo59z() {
        ((AbstractC0204Du) this.f141R).m393z();
    }
}
